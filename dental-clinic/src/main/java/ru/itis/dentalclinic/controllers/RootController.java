package ru.itis.dentalclinic.controllers;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import ru.itis.dentalclinic.entities.User;
import ru.itis.dentalclinic.security.UserDetailsImpl;

@Controller
public class RootController {

    @GetMapping("/")
    public String root(Authentication authentication) {
        UserDetailsImpl user = (UserDetailsImpl) authentication.getPrincipal();
        boolean isAdmin = user.getAuthorities().stream()
                .map(GrantedAuthority::getAuthority)
                .anyMatch(a -> User.Role.ADMIN.name().equals(a));
        return isAdmin ? "redirect:/admin" : "redirect:/main";
    }
}

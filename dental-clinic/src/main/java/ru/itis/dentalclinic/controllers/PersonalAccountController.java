package ru.itis.dentalclinic.controllers;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.itis.dentalclinic.security.UserDetailsImpl;

@Controller
public class PersonalAccountController {

    @GetMapping("/personalAccount")
    public String getPersonalAccountPage(@AuthenticationPrincipal UserDetailsImpl user, Model model) {
        model.addAttribute("user", user);
        return "personal_account";
    }
}

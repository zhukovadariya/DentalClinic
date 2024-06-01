package ru.itis.dentalclinic.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.itis.dentalclinic.services.UserService;

@Controller
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/banAll")
    public String banAllUsersPage(){
        return "ban_all";
    }

    @PostMapping("/banAll")
    @ResponseBody
    public String banAllUsers(){
        userService.banAll();
        return "Success!!";
    }
}
package ru.itis.dentalclinic.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.itis.dentalclinic.dto.forms.SignUpForm;
import ru.itis.dentalclinic.services.SignUpService;

import java.text.ParseException;
import java.text.SimpleDateFormat;

@RequiredArgsConstructor
@Controller
public class SignUpController {

    private final SignUpService signUpService;
    private static final SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

    @GetMapping("/signUp")
    public String getSignUpPage() {
        return "sign_up";
    }

    @PostMapping("/signUp")
    public String signUpUser(@RequestParam("firstName") String firstName,
                             @RequestParam("lastName") String lastName,
                             @RequestParam("dateOfBirth") String dateOfBirth,
                             @RequestParam("email") String email,
                             @RequestParam("password") String password) throws ParseException {

        signUpService.signUp(
                SignUpForm.builder()
                        .email(email)
                        .firstName(firstName)
                        .dateOfBirth(formatter.parse(dateOfBirth))
                        .password(password)
                        .lastName(lastName)
                        .build()
        );
        return "redirect:/signIn";
    }
}

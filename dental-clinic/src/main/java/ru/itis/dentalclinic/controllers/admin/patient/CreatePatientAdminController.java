package ru.itis.dentalclinic.controllers.admin.patient;

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
public class CreatePatientAdminController {

    private final SignUpService signUpService;
    private static final SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

    @GetMapping("/admin/createPatientAdmin")
    public String getCreatePatientAdminPage() {
        return "create_patient_admin";
    }

    @PostMapping("/admin/createPatientAdmin")
    public String createPatientAdmin(@RequestParam("patientfirstname") String firstName,
                                     @RequestParam("patientlastname") String lastName,
                                     @RequestParam("patientdateofbirth") String dateOfBirth,
                                     @RequestParam("patientemail") String email,
                                     @RequestParam("patientpassword") String password) throws ParseException {

        signUpService.signUp(
                SignUpForm.builder()
                        .email(email)
                        .firstName(firstName)
                        .dateOfBirth(formatter.parse(dateOfBirth))
                        .password(password)
                        .lastName(lastName)
                        .build()
        );
        return "redirect:/admin";
    }
}

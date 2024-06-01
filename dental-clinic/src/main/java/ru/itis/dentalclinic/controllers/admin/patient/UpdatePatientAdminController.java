package ru.itis.dentalclinic.controllers.admin.patient;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.itis.dentalclinic.dto.forms.admin.patient.PatientUpdateAdminForm;
import ru.itis.dentalclinic.services.UserService;
import java.text.ParseException;
import java.text.SimpleDateFormat;

@RequiredArgsConstructor
@Controller
public class UpdatePatientAdminController {

    private final UserService userService;
    private static final SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

    @GetMapping("/admin/updatePatientAdmin")
    public String getUpdatePatientAdminPage() {
        return "update_patient_admin";
    }

    @PostMapping("/admin/updatePatientAdmin")
    public String updatePatientAdmin(@RequestParam("idupdate") String id,
                                     @RequestParam("firstnameupdate") String firstName,
                                     @RequestParam("lastnameupdate") String lastName,
                                     @RequestParam("dateofbirthupdate") String dateOfBirth,
                                     @RequestParam("emailupdate") String email,
                                     @RequestParam("passwordupdate") String password,
                                     @RequestParam("stateupdate") String state) throws ParseException {
        userService.updateById(
                PatientUpdateAdminForm.builder()
                        .id(Long.valueOf(id))
                        .firstName(firstName)
                        .lastName(lastName)
                        .dateOfBirth(formatter.parse(dateOfBirth))
                        .email(email)
                        .password(password)
                        .state(state)
                        .build()
        );
        return "redirect:/admin";
    }
}

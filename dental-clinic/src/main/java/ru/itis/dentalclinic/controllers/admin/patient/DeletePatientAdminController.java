package ru.itis.dentalclinic.controllers.admin.patient;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.itis.dentalclinic.dto.forms.admin.DeleteAdminForm;
import ru.itis.dentalclinic.services.UserService;

@RequiredArgsConstructor
@Controller
public class DeletePatientAdminController {

    private final UserService userService;

    @GetMapping("/admin/deletePatientAdmin")
    public String getDeletePatientAdminPage() {
        return "delete_patient_admin";
    }

    @PostMapping("/admin/deletePatientAdmin")
    public String deletePatientById(@RequestParam("iddelete") String id) {
        userService.deleteById(DeleteAdminForm.builder().id(id).build());
        return "redirect:/admin";
    }

}

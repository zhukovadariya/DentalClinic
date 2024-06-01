package ru.itis.dentalclinic.controllers.admin.appointment;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.itis.dentalclinic.dto.forms.admin.DeleteAdminForm;
import ru.itis.dentalclinic.services.AppointmentService;

@RequiredArgsConstructor
@Controller
public class DeleteAppointmentAdminController {

    private final AppointmentService appointmentService;

    @GetMapping("/admin/deleteAppointmentAdmin")
    public String getDeleteAppointmentAdminPage() {
        return "delete_appointment_admin";
    }

    @PostMapping("/admin/deleteAppointmentAdmin")
    public String deleteAppointmentById(@RequestParam("iddelete") String id) {
        appointmentService.deleteById(DeleteAdminForm.builder().id(id).build());
        return "redirect:/admin";
    }
}

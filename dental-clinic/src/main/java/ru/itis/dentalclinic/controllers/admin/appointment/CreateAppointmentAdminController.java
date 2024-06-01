package ru.itis.dentalclinic.controllers.admin.appointment;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.itis.dentalclinic.dto.ProcedureDto;
import ru.itis.dentalclinic.dto.forms.admin.appointment.AddAppointmentDtoAdmin;
import ru.itis.dentalclinic.services.CreateAppointmentService;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class CreateAppointmentAdminController {

    private final CreateAppointmentService createAppointmentService;

    @GetMapping("/admin/createAppointmentAdmin")
    public String getCreateAppointmentAdminPage(Model model) {
        List<ProcedureDto> procedures = createAppointmentService.findAll();
        model.addAttribute("procedures", procedures);
        return "create_appointment_admin";
    }

    @PostMapping("/admin/createAppointmentAdmin")
    @ResponseBody
    public ResponseEntity<String> processCreateAppointmentForm(@RequestBody AddAppointmentDtoAdmin appointmentDtoAdmin) {
        return createAppointmentService.addByAdmin(appointmentDtoAdmin) ?
                ResponseEntity.ok("Created") : ResponseEntity.badRequest().build();
    }
}

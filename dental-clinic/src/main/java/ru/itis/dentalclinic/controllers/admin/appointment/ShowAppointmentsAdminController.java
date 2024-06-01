package ru.itis.dentalclinic.controllers.admin.appointment;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.itis.dentalclinic.dto.AppointmentDto;
import ru.itis.dentalclinic.services.AppointmentService;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class ShowAppointmentsAdminController {

    private final AppointmentService appointmentService;

    @GetMapping("/admin/showAppointmentsAdmin")
    public String getShowAppointmentsPage(Model model) {
        List<AppointmentDto> appointments = appointmentService.getAllAppointments();
        model.addAttribute("appointments", appointments);
        return "show_appointments_admin";
    }
}

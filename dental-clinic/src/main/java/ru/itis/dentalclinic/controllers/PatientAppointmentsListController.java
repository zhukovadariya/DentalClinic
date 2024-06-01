package ru.itis.dentalclinic.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.itis.dentalclinic.dto.AppointmentDto;
import ru.itis.dentalclinic.security.UserDetailsImpl;
import ru.itis.dentalclinic.services.AppointmentService;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class PatientAppointmentsListController {

    private final AppointmentService appointmentService;

    @GetMapping("/patientAppointmentsList")
    public String getPatientAppointmentsListPage(@AuthenticationPrincipal UserDetailsImpl user, Model model) {
        List<AppointmentDto> appointments = appointmentService.getAllAppointmentsByPatientId(user.getUser().getId());
        System.out.println(appointments);
        model.addAttribute("appointments", appointments);
        return "patient_appointments_list";
    }
}

package ru.itis.dentalclinic.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.itis.dentalclinic.dto.AddAppointmentDto;
import ru.itis.dentalclinic.dto.ProcedureDto;
import ru.itis.dentalclinic.security.UserDetailsImpl;
import ru.itis.dentalclinic.services.CreateAppointmentService;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class CreateAppointmentController {

    private  final CreateAppointmentService createAppointmentService;

    @GetMapping("/createAppointment")
    public String showAppointmentForm( Model model) {
        List<ProcedureDto> procedures = createAppointmentService.findAll();
        model.addAttribute("procedures", procedures);
        return "create_appointment";
    }

    @PostMapping("/createAppointment")
    @ResponseBody
    public ResponseEntity<String> processCreateAppointmentForm(@RequestBody AddAppointmentDto appointmentDto,
                                                               @AuthenticationPrincipal UserDetailsImpl user) {
        return createAppointmentService.add(appointmentDto, user.getUser()) ?
                ResponseEntity.ok("Created") : ResponseEntity.badRequest().build();
    }

}

package ru.itis.dentalclinic.controllers.admin.patient;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.itis.dentalclinic.dto.UserDto;
import ru.itis.dentalclinic.services.UserService;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class ShowPatientsAdminController {

    private final UserService userService;

    @GetMapping("/admin/showPatientsAdmin")
    public String getShowPatientsAdminPage(Model model) {
        List<UserDto> patients = userService.getAllPatients();
        model.addAttribute("patients", patients);
        return "show_patients_admin";
    }

}

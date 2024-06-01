package ru.itis.dentalclinic.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.itis.dentalclinic.entities.TimeSlot;
import ru.itis.dentalclinic.services.CreateAppointmentService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TimeSlotsController {

    private final CreateAppointmentService createAppointmentService;

    @GetMapping("/timeSlots")
    public ResponseEntity<List<TimeSlot>> getProcedureListPage(@RequestParam Long id) {
        return ResponseEntity.ok(createAppointmentService.findAvailableTimeSlotsByProcedure_Id(id));
    }
}

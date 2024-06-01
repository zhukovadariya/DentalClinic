package ru.itis.dentalclinic.services;

import ru.itis.dentalclinic.dto.AppointmentDto;
import ru.itis.dentalclinic.dto.forms.admin.DeleteAdminForm;

import java.util.List;

public interface AppointmentService {

    void deleteById(DeleteAdminForm deletePatientAdminForm);

    List<AppointmentDto> getAllAppointmentsByPatientId(Long id);

    List<AppointmentDto> getAllAppointments();
}

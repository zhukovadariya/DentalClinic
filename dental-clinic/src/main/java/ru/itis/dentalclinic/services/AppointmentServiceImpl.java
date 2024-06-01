package ru.itis.dentalclinic.services;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itis.dentalclinic.dto.AppointmentDto;
import ru.itis.dentalclinic.dto.forms.admin.DeleteAdminForm;
import ru.itis.dentalclinic.repositories.AppointmentRepository;
import ru.itis.dentalclinic.repositories.ProcedureRepository;
import ru.itis.dentalclinic.repositories.UserRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AppointmentServiceImpl implements AppointmentService {

    private final AppointmentRepository appointmentRepository;

    @Override
    public void deleteById(DeleteAdminForm deletePatientAdminForm) {
        Long id = Long.valueOf(deletePatientAdminForm.getId());
        appointmentRepository.deleteById(id);
    }

    @Override
    public List<AppointmentDto> getAllAppointmentsByPatientId(Long id) {
        return appointmentRepository.findByPatientId(id).stream()
                .map(appointment -> {
                    AppointmentDto dto = new AppointmentDto();
                    dto.setId(appointment.getId());
                    dto.setProcedureName(appointment.getProcedureName());
                    dto.setDate(appointment.getDate());
                    dto.setPaymentMethod(appointment.getPaymentMethod());
                    dto.setPatient(appointment.getPatient());
                    return dto;
                })
                .collect(Collectors.toList());
    }

    @Override
    public List<AppointmentDto> getAllAppointments() {
        return appointmentRepository.findAll().stream()
                .map(appointment -> {
                    AppointmentDto dto = new AppointmentDto();
                    dto.setId(appointment.getId());
                    dto.setProcedureName(appointment.getProcedureName());
                    dto.setDate(appointment.getDate());
                    dto.setPaymentMethod(appointment.getPaymentMethod());
                    dto.setPatient(appointment.getPatient());
                    return dto;
                })
                .collect(Collectors.toList());

    }
}

package ru.itis.dentalclinic.services;

import ru.itis.dentalclinic.dto.AddAppointmentDto;
import ru.itis.dentalclinic.dto.ProcedureDto;
import ru.itis.dentalclinic.dto.forms.admin.appointment.AddAppointmentDtoAdmin;
import ru.itis.dentalclinic.entities.TimeSlot;
import ru.itis.dentalclinic.entities.User;

import java.util.List;

public interface CreateAppointmentService {

    List<ProcedureDto> findAll();

    public boolean add(AddAppointmentDto appointmentDto, User user);

    public boolean addByAdmin(AddAppointmentDtoAdmin appointmentDtoAdmin);

    public List<TimeSlot> findAvailableTimeSlotsByProcedure_Id(Long id);
}


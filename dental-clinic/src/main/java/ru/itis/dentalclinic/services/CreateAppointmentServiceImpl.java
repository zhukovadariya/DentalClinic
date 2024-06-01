package ru.itis.dentalclinic.services;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itis.dentalclinic.client.InsuranceClient;
import ru.itis.dentalclinic.dto.AddAppointmentDto;
import ru.itis.dentalclinic.dto.ProcedureDto;
import ru.itis.dentalclinic.dto.forms.admin.appointment.AddAppointmentDtoAdmin;
import ru.itis.dentalclinic.entities.Appointment;
import ru.itis.dentalclinic.entities.Procedure;
import ru.itis.dentalclinic.entities.TimeSlot;
import ru.itis.dentalclinic.entities.User;
import ru.itis.dentalclinic.repositories.AppointmentRepository;
import ru.itis.dentalclinic.repositories.ProcedureRepository;
import ru.itis.dentalclinic.repositories.TimeSlotRepository;
import ru.itis.dentalclinic.repositories.UserRepository;

import java.util.List;


@Service
public class CreateAppointmentServiceImpl implements CreateAppointmentService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private InsuranceClient insuranceClient;

    @Autowired
    private ProcedureRepository procedureRepository;

    @Autowired
    private TimeSlotRepository timeSlotRepository;

    @Autowired
    private AppointmentRepository appointmentRepository;

    public CreateAppointmentServiceImpl(ProcedureRepository procedureRepository) {
        this.procedureRepository = procedureRepository;
    }

    public List<ProcedureDto> findAll() {
        return procedureRepository.findAll().stream()
                .map(ProcedureDto::fromEntity)
                .toList();
    }

    @Override
    public boolean add(AddAppointmentDto appointmentDto, User user) {
        if (appointmentDto.getPaymentMethod().equals("insurance")){
            String insuranceName = appointmentDto.getInsuranceName();
            boolean response = insuranceClient.checkInsurance(insuranceName);
            if (!response){
                return false;
            }
        }

        String freeTime = timeSlotRepository.findById(Long.valueOf(appointmentDto.getDate())).get().getFreeTime();
        Procedure name = procedureRepository.findById(Long.valueOf(appointmentDto.getProcedureName())).get();
        appointmentRepository.save(Appointment.builder()
                .paymentMethod(appointmentDto.getPaymentMethod())
                .date(freeTime)
                .insuranceName(appointmentDto.getInsuranceName())
                .patient(user)
                .procedureName(name)
                .build());

        timeSlotRepository.delete(timeSlotRepository.findById(Long.valueOf(appointmentDto.getDate())).get());
        return true;
    }

    @Override
    public boolean addByAdmin(AddAppointmentDtoAdmin appointmentDtoAdmin) {
        if (appointmentDtoAdmin.getPaymentMethod().equals("insurance")){
            String insuranceName = appointmentDtoAdmin.getInsuranceName();
            boolean response = insuranceClient.checkInsurance(insuranceName);
            if (!response){
                return false;
            }
        }

        String freeTime = timeSlotRepository.findById(Long.valueOf(appointmentDtoAdmin.getDate())).get().getFreeTime();
        Procedure name = procedureRepository.findById(Long.valueOf(appointmentDtoAdmin.getProcedureName())).get();
        appointmentRepository.save(Appointment.builder()
                .paymentMethod(appointmentDtoAdmin.getPaymentMethod())
                .date(freeTime)
                .insuranceName(appointmentDtoAdmin.getInsuranceName())
                .patient(userRepository.findById(appointmentDtoAdmin.getPatientId()).get())
                .procedureName(name)
                .build());

        timeSlotRepository.delete(timeSlotRepository.findById(Long.valueOf(appointmentDtoAdmin.getDate())).get());
        return true;
    }


    @Override
    public List<TimeSlot> findAvailableTimeSlotsByProcedure_Id(Long id) {
        return timeSlotRepository.findByProcedure_Id(id);
    }
}

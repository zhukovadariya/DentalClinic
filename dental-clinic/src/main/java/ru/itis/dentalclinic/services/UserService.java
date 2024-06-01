package ru.itis.dentalclinic.services;

import ru.itis.dentalclinic.dto.UserDto;
import ru.itis.dentalclinic.dto.forms.admin.DeleteAdminForm;
import ru.itis.dentalclinic.dto.forms.admin.patient.PatientUpdateAdminForm;

import java.util.List;

public interface UserService {

    void banAll();

    void deleteById(DeleteAdminForm deletePatientAdminForm);

    void updateById(PatientUpdateAdminForm patientUpdateAdminForm);

    List<UserDto> getAllPatients();
}

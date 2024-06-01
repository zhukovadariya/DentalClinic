package ru.itis.dentalclinic.dto.forms.admin.patient;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class PatientUpdateAdminForm {

    private Long id;

    private String firstName;

    private String lastName;

    private Date dateOfBirth;

    private String email;

    private String password;

    private String state;
}

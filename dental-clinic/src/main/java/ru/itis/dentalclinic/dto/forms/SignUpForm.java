package ru.itis.dentalclinic.dto.forms;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class SignUpForm {

    private String firstName;

    private String lastName;

    private Date dateOfBirth;

    private String email;

    private String password;
}

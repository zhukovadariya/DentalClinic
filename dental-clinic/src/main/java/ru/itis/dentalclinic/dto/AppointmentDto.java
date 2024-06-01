package ru.itis.dentalclinic.dto;

import lombok.*;
import ru.itis.dentalclinic.entities.Procedure;
import ru.itis.dentalclinic.entities.User;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class AppointmentDto {

    private Long id;

    private Procedure procedureName;

    private String date;

    private String paymentMethod;

    private String insuranceName;

    private User patient;
}

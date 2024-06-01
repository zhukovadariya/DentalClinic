package ru.itis.dentalclinic.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class AddAppointmentDto {

    private String procedureName;

    private String date;

    private String paymentMethod;

    private String insuranceName;
}

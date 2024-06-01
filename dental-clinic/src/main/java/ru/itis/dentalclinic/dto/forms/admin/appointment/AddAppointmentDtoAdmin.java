package ru.itis.dentalclinic.dto.forms.admin.appointment;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class AddAppointmentDtoAdmin {

    private String procedureName;

    private String date;

    private String paymentMethod;

    private String insuranceName;

    private Long patientId;
}

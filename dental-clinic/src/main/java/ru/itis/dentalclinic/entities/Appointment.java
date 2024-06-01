package ru.itis.dentalclinic.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "appointments")
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "procedure_name")
    private Procedure procedureName;

    private String date;

    private String paymentMethod;

    private String insuranceName;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private User patient;
}

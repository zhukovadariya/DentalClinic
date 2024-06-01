package ru.itis.dentalclinic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.itis.dentalclinic.entities.Appointment;
import ru.itis.dentalclinic.entities.Procedure;
import ru.itis.dentalclinic.entities.User;

import java.util.List;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

    List<Appointment> findByProcedureName(Procedure procedureName);

    List<Appointment> findByPatientId(long patientId);

    @Modifying
    @Query("UPDATE Appointment SET procedureName = ?2, date = ?3, paymentMethod = ?4, patient = ?5 " +
            "WHERE id = ?1")
    void updateAppointmentById(Long id, Procedure procedureName, String date, String paymentMethod, User patient);
}

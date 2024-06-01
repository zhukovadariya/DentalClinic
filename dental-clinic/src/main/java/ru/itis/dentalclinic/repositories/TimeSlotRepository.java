package ru.itis.dentalclinic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.itis.dentalclinic.entities.TimeSlot;

import java.util.List;
import java.util.Optional;

@Repository
public interface TimeSlotRepository extends JpaRepository<TimeSlot, Long> {

    List<TimeSlot> findByProcedure_Id(Long id);

    Optional<TimeSlot> findFreeTimeById(Long id);
}


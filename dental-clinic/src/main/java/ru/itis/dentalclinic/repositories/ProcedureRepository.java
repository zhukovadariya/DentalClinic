package ru.itis.dentalclinic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.itis.dentalclinic.entities.Procedure;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProcedureRepository extends JpaRepository<Procedure, Long> {

    Optional<Procedure> findByName(String name);

    @Query("SELECT p.name FROM Procedure p WHERE p.name LIKE :name")
    List<Procedure> searchProcedureByName(@Param("name") String procedureName);

    @Modifying
    @Query("UPDATE Procedure SET name = ?2, duration = ?3, price = ?4 WHERE id = ?1")
    void updateById(Long id, String name, String duration, Integer price);

    List<Procedure> findByNameContaining(String name);
}

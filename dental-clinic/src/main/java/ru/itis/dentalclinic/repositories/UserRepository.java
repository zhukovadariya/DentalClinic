package ru.itis.dentalclinic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.itis.dentalclinic.entities.User;

import java.util.Date;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findOneByEmail(String email);

    Optional<User> findByEmailAndPassword(String email, String password);

    Optional<User> findIdByEmail(String email);

    @Modifying
    @Query("UPDATE User SET firstName = ?2, lastName = ?3, dateOfBirth = ?4, email = ?5, " +
            "password = ?6, state = ?7 WHERE id = ?1")
    void updateUserById(Long id, String firstName, String lastName, Date dateOfBirth, String email,
                        String password, User.State state);

    void deleteById(Long id);

    Optional<User> findById(Long patientId);
}



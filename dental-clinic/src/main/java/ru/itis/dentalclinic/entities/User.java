package ru.itis.dentalclinic.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;

    private String lastName;

    private Date dateOfBirth;

    private String email;

    private String password;

    @Enumerated(EnumType.STRING)
    private Role role;

    @Enumerated(EnumType.STRING)
    private State state;

    public enum Role{
        PATIENT,ADMIN
    }

    public enum State{
        ACTIVE,BANNED
    }

    public Boolean isActive(){
        return this.state == State.ACTIVE;
    }

    public Boolean isBanned(){
        return this.state == State.BANNED;
    }

    public Boolean isPatient(){
        return this.role == Role.PATIENT;
    }

    public Boolean isAdmin(){
        return this.role == Role.ADMIN;
    }
}

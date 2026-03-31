package com.gymnos.fittrack.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String name;

    @Email
    @NotBlank
    @Column(unique = true)
    private String email;

    @NotBlank
    private String password;

    private LocalDate birthDate;

    private String gender;

    private Double weight;

    private Double height;

    @Enumerated(EnumType.STRING)
    private Role role;

    public enum Role
    {
        USER, ADMIN
    }
}

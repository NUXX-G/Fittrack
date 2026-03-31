package com.gymnos.fittrack.model.dto;

<<<<<<< HEAD
public class RegisterRequest {
=======
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDate;

@Data
public class RegisterRequest
{
    @NotBlank
    private String name;

    @NotBlank
    @Email
    private String email;

    @NotBlank
    private String password;

    @NotNull
    private LocalDate birthDate;

    @NotBlank
    private String gender;

    @NotNull
    private Double weight;

    @NotNull
    private Double height;
>>>>>>> 6bd6b64 (feat: crear DTOs RegisterRequest, LoginRequest y AuthResponse)
}

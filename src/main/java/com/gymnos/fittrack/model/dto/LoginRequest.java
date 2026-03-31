package com.gymnos.fittrack.model.dto;

<<<<<<< HEAD
public class LoginRequest {
=======
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class LoginRequest
{
    @NotBlank
    @Email
    private String email;

    @NotBlank
    private String password;
>>>>>>> 6bd6b64 (feat: crear DTOs RegisterRequest, LoginRequest y AuthResponse)
}

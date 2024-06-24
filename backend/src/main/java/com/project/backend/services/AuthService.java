package com.project.backend.services;

import com.project.backend.dto.LoginRequest;
import com.project.backend.dto.SignupRequest;
import org.springframework.http.ResponseEntity;

public class AuthService {
    public ResponseEntity<?> registerUser(SignupRequest signUpRequest) {
    }

    public ResponseEntity<?> authenticateUser(LoginRequest loginRequest) {
    }

    public boolean existsByUsername(String username) {
    }

    public boolean existsByEmail(Object email) {
    }
}

package com.example.demo.registration.controller;

import com.example.demo.appuser.model.AppUser;
import com.example.demo.registration.service.RegistrationService;
import com.example.demo.registration.model.RegistrationRequest;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/registration")
@AllArgsConstructor
public class RegistrationController {

    private final RegistrationService registrationService;

    @PostMapping
    public String register(@RequestBody RegistrationRequest request) {
        return registrationService.register(request);
    }


    @GetMapping
    public List<AppUser> getAllUsers(){
        return registrationService.getAllUsers();
    }
}

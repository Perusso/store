package com.dev.store.api.controller.auth;

import com.dev.store.api.model.RegistrationBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthenticatorController {


    @PostMapping("/register")
    public void registerUser(@RequestBody RegistrationBody registrationBody) {
        System.out.println(registrationBody.getUsername());
    }

}

package com.projects147.springboot_app_security.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class WelcomeController {

    @GetMapping("/welcome")
    public String welcome() {
        log.info("Invoked WelcomeController::welcome");
        return "Welcome to String Security Application";
    }
}

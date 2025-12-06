package com.tp.gestion_stock.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Bienvenue dans l'application Gestion Stock ! L'application fonctionne correctement.";
    }

    @GetMapping("/test")
    public String test() {
        return "Test endpoint fonctionne !";
    }
}
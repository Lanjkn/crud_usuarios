package com.example.crud_usuarios.Passport.controller;

import com.example.crud_usuarios.Passport.model.PassportModel;
import com.example.crud_usuarios.Passport.service.PassportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PassportController {
    private final PassportService service;

    @Autowired
    public PassportController(PassportService service) {
        this.service = service;
    }

    @GetMapping("/passports")
    public List<PassportModel> getPassports() {
        return service.getPassports();
    }

    @PostMapping("/passports")
    public PassportModel addPassport(@RequestBody PassportModel passport) {
        return service.addPassport(passport);
    }

    @DeleteMapping("/passport_delete/{id}")
    public void deletePassport(@PathVariable int id) {
        service.deletePassport((long) id);
    }

    @PostMapping("/passports/{id}")
    public PassportModel updatePassport(@RequestBody PassportModel passport, @PathVariable int id) {
        return service.updatePassport(passport, (long) id);
    }

    @GetMapping("/passports/{id}")
    public PassportModel getPassport(@PathVariable int id) {
        return service.getPassport((long) id);
    }

    public PassportModel getPassportByPassportNumber(String passportNumber) {
        return service.getPassportByPassportNumber(passportNumber);
    }
}

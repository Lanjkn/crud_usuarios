package com.example.crud_usuarios.DriversLicense.controller;

import com.example.crud_usuarios.DriversLicense.model.DriversLicenseModel;
import com.example.crud_usuarios.DriversLicense.service.DriversLicenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DriversLicenseController {
    private final DriversLicenseService service;

    @Autowired
    public DriversLicenseController(DriversLicenseService service) {
        this.service = service;
    }

    @GetMapping("/driversLicences")
    public List<DriversLicenseModel> getDriversLicenses() {
        return service.getDriversLicenses();
    }

    @PostMapping("/driversLicenses")
    public DriversLicenseModel addDriversLicense(@RequestBody DriversLicenseModel driversLicense) {
        return service.addDriversLicense(driversLicense);
    }

    @DeleteMapping("/driversLicense_delete/{id}")
    public void deleteDriversLicense(@PathVariable int id) {
        service.deleteDriversLicense((long) id);
    }

    @PostMapping("/DriversLicenses/{id}")
    public DriversLicenseModel updateDriversLicense(@RequestBody DriversLicenseModel driversLicense, @PathVariable int id) {
        return service.updateDriversLicense(driversLicense, (long) id);
    }

    @GetMapping("/DriversLicenses/{id}")
    public DriversLicenseModel getDriversLicense(@PathVariable int id) {
        return service.getDriversLicense((long) id);
    }

    public DriversLicenseModel getDriversLicenseByRegistrationNumber(String registrationNumber) {
        return service.getDriversLicenseByRegistrationNumber(registrationNumber);
    }
}
package com.example.crud_usuarios.Passport.service;

import com.example.crud_usuarios.Passport.model.PassportModel;
import com.example.crud_usuarios.Passport.repository.PassportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PassportService {
    PassportRepository passportRepository;

    @Autowired
    public PassportService(PassportRepository passportRepository) {
        this.passportRepository = passportRepository;
    }

    public List<PassportModel> getPassports() {
        return passportRepository.findAll();
    }

    public PassportModel addPassport(PassportModel passport) {
        passportRepository.save(passport);
        return passport;
    }

    public void deletePassport(Long id) {
        passportRepository.deleteById(id);
    }

    public PassportModel getPassport(Long id) {
        return passportRepository.findById(id).orElseThrow();
    }

    public PassportModel updatePassport(PassportModel passport, Long id) {
        Optional<PassportModel> passportOptional = passportRepository.findById(id);
        if (passportOptional.isPresent()) {
            PassportModel passport1 = passportOptional.get();

            passport1.setType(passport.getType());
            passport1.setCountry(passport.getCountry());
            passport1.setPassportNumber(passport.getPassportNumber());
            passport1.setGender(passport.getGender());
            passport1.setNationality(passport.getNationality());
            passport1.setAuthority(passport.getAuthority());
            passport1.setNaturalness(passport.getNaturalness());
            passport1.setExpirationDate(passport.getExpirationDate());

            passport1.setName(passport.getName());
            passport1.setFathersName(passport.getFathersName());
            passport1.setMothersName(passport.getMothersName());
            passport1.setBirthDate(passport.getBirthDate());
            passport1.setIssueDate(passport.getIssueDate());

            return passport;
        }
        return null;
    }

    public PassportModel getPassportByPassportNumber(String passportNumber) {
        return passportRepository.findByPassportNumber(passportNumber);
    }
}

package com.example.crud_usuarios.Terceiro.service;

import com.example.crud_usuarios.Terceiro.model.ThirdModel;
import com.example.crud_usuarios.Terceiro.repository.ThirdRepositiry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ThirdService {

    ThirdRepositiry thirdRepositiry;

    @Autowired
    public ThirdService(ThirdRepositiry thirdRepositiry) {
        this.thirdRepositiry = thirdRepositiry;
    }

    public List<ThirdModel> getThirds() {
        return thirdRepositiry.findAll();
    }

    public ThirdModel addThird(ThirdModel third) {
        thirdRepositiry.save(third);
        return third;
    }

    public void deleteThird(Long id) {
        thirdRepositiry.deleteById(id);
    }

    public ThirdModel getThird(Long id) {
        return thirdRepositiry.findById(id).orElseThrow();
    }

    public ThirdModel updateThird(ThirdModel third, Long id) {
        Optional<ThirdModel> thirdOptional = thirdRepositiry.findById(id);
        if (thirdOptional.isPresent()) {
            ThirdModel third1 = thirdOptional.get();
            third1.setUsername(third.getUsername());
            third1.setPassword(third.getPassword());
            third1.setApplicationName(third.getApplicationName());
            return third;
        }
        return null;
    }

    public ThirdModel getThirdByApplicationName(String applicationName) {
        return thirdRepositiry.findByApplicationName(applicationName);
    }
}

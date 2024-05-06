package com.example.prueba3it.validation;

import com.example.prueba3it.service.EncuestaService;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ExistsByEmailValidation implements ConstraintValidator<ExistsByEmail, String> {
    @Autowired
    private EncuestaService encuestaService;

    @Override
    public boolean isValid(String email, ConstraintValidatorContext constraintValidatorContext) {
        if(encuestaService == null){
            return true;
        }
        return !encuestaService.existsByEmail(email);
    }
}

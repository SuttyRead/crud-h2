package com.ua.sutty.crudh2.validator;

import com.ua.sutty.crudh2.form.UserForm;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class MatchPasswordValidator implements ConstraintValidator<MatchPassword, UserForm> {
   public void initialize(MatchPassword constraint) {
   }

   public boolean isValid(UserForm userForm, ConstraintValidatorContext context) {
      return userForm.getPassword().equals(userForm.getConfirmPassword());
   }
}

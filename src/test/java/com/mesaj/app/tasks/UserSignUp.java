package com.mesaj.app.tasks;

import com.mesaj.app.enums.Gender;
import com.mesaj.app.models.User;
import com.mesaj.app.pageobjects.SignUpServices;
import com.mesaj.app.util.RandomNumberGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserSignUp {

    @Autowired
    private SignUpServices signUp;

    public void withInfo(User user){

        if(user.getGender() == Gender.female){
            signUp.selectFemale();
        } else {
            signUp.selectMale();
        }

        signUp.writeFirstName(user.getFirstName());
        signUp.writeLastName(user.getLastName());
        signUp.writeEmail(user.getEmail());
        signUp.selectMale();
        signUp.selectCountry(user.getCountry());
        signUp.selectBirthday(user.getBirthDay());
        signUp.selectBirthMonth(user.getBirthMonth();
        signUp.selectBirthYear(user.getBirthYear());
        signUp.writePhone(RandomNumberGenerator.get());
        signUp.writePassword(user.getPassword());
        signUp.writeConfirmPassword(user.getConfirmPassword());

        //signUp.clickOnSubmit();

    }

    //"C0nTraseÑa_123"
}

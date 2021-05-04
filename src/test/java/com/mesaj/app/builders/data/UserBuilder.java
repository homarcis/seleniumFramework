package com.mesaj.app.builders.data;

import com.mesaj.app.models.User;

public class UserBuilder {
    private User;

    public static UserBuilder anUser(){
        return  new UserBuilder();
    }

    public UserBuilder withDefaultInfo(){

        this.user = User.builder()
        .writeFirstName("Pepito");
        .writeLastName("Perez");
        .writeEmail("homar@golstats.com");
        .selectMale();
        .selectCountry("Belgium");
        .selectBirthday("10");
        .selectBirthMonth("February");
        .selectBirthYear("1989");
        .writePhone(RandomNumberGenerator.get());
        .writePassword("C0nTraseÑa_123");
        .writeConfirmPassword("C0nTraseÑa_123");
        .clickOnSubmit();

    }

}

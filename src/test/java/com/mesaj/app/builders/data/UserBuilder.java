package com.mesaj.app.builders.data;

import com.mesaj.app.enums.Gender;
import com.mesaj.app.models.User;
import com.mesaj.app.util.RandomNumberGenerator;

public class UserBuilder {
    private User user;

    public static UserBuilder anUser(){
        return  new UserBuilder();
    }

    public UserBuilder but(){
        return withDefaultInfo();
    }

    public UserBuilder withDefaultInfo() {

        this.user = User.builder()
        .firstName("Pepito")
        .lastName("Perez")
        .email("homar@golstats.com")
        .gender(Gender.male)
        .Country("Belgium")
        .birthDay("10")
        .birthMonth("February")
        .birthYear("1989")
        .phone(RandomNumberGenerator.get())
        .password("C0nTraseÑa_123")
        .ConfirmPassword("C0nTraseÑa_123").build();
        return this;
        //.clickOnSubmit()
    }

    public UserBuilder withoutEmail(){
        but().user.setEmail("");
        return this;
    }
    public UserBuilder withoutPhone(){
        but().user.setPhone("");
        return this;
    }

    public User build(){
        return this.user;
    }

}

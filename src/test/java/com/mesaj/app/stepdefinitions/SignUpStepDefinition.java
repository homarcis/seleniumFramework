package com.mesaj.app.stepdefinitions;

import com.mesaj.app.conf.DriverConfig;
import com.mesaj.app.models.User;
import com.mesaj.app.tasks.NavigateTo;
import com.mesaj.app.tasks.UserSignUp;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ContextConfiguration;
import com.mesaj.app.pageobjects.SignUpServices;
import com.mesaj.app.util.RandomNumberGenerator;

@ContextConfiguration (classes = {DriverConfig.class})
public class SignUpStepDefinition {

    @Autowired
    private UserSignUp signUp;


    @Autowired
    private NavigateTo navigate;

    @Given("^Client wants to have an account$")
    public void client_wants_to_have_an_account(){
        navigate.signUpPage();

    }

    @When("^he send required information to get the account$")
    public void he_send_required_information_to_get_the_account() {
        signUp.withInfo(User.builder().build());

    }

    @Then("^he should be told that the account was created$")
    public void he_should_be_told_that_the_account_was_created() {

    }


}

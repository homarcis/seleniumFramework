package com.mesaj.app.pageobjects;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Getter
public class SingUpPageObject extends PageBase {


    @Autowired
    public SingUpPageObject(WebDriver driver){
      super(driver);

    }
    // Elementos del Page Object : 1 .- representacion de elementos en pagina


    @FindBy(xpath = "//input[@ng-model='FirstName']")
    private WebElement firstNameTextbox;

    @FindBy(xpath ="//input[@ng-model='LastName']")
    private WebElement lastNameTextbox;

    @FindBy(xpath ="//input[@type='email']")
    private WebElement emailAddress ;

    @FindBy(xpath ="//input[@type='tel']")
    private WebElement phone;

    @FindBy(xpath ="//input[@value='Male']")
    private WebElement genderMale;

    @FindBy(xpath ="//input[@value='FeMale']")
    private WebElement genderFemale;

    @FindBy(id ="countries")
    private WebElement country;

    @FindBy(id ="yearbox")
    private WebElement dateOfBirthYear;

    @FindBy(xpath ="//select[@ng-model='monthbox']")
    private WebElement dateOfBirthMonth;

    @FindBy(id ="daybox")
    private WebElement dayOfBirthday;

    @FindBy(id ="firstpassword")
    private WebElement password;

    @FindBy(id ="secondpassword")
    private WebElement confirmpassword;

    @FindBy(id ="submitbtn")
    private WebElement submit;







}

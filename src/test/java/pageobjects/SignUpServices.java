package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SignUpServices {

    private WebDriver driver;
    private  SingUpPageObject singUpPageObject;

    public SignUpServices( WebDriver driver) {
        this.driver = driver;
        singUpPageObject = new SingUpPageObject(driver);
    }


    // Elementos del Page Object : 2 .- Servicios que provee la pagina

    public void go(String url) { this.driver.get(url); }

    public void writeFirstName(String firstName){
        this.singUpPageObject.getFirstNameTextbox().sendKeys(firstName);
    }

    public void writeLastName(String lastName){
        this.singUpPageObject.getLastNameTextbox().sendKeys(lastName);
    }

    public void writeEmail(String email){
        this.singUpPageObject.getEmailAddress().sendKeys(email);
    }

    public void writePhone(String phone){
        this.singUpPageObject.getPhone().sendKeys(phone);
    }

    public void selectMale(){
        this.singUpPageObject.getGenderMale().click();
    }

    public void selectFemale(){
        this.singUpPageObject.getGenderFemale().click();
    }

    public void selectCountry(String country){
        new Select(this.singUpPageObject.getCountry()).selectByValue(country);
    }

    public void selectBirthday(String day){
        new Select(this.singUpPageObject.getDayOfBirthday()).selectByValue(day);
    }

    public void selectBirthMonth(String month){
        new Select(this.singUpPageObject.getDateOfBirthMonth()).selectByValue(month);
    }

    public void selectBirthYear(String year){
        new Select(this.singUpPageObject.getDateOfBirthYear()).selectByValue(year);
    }

    public void writePassword(String password){
        this.singUpPageObject.getPassword().sendKeys(password);
    }

    public void writeConfirmPassword(String confirmPassword){
        this.singUpPageObject.getConfirmpassword().sendKeys(confirmPassword);
    }

    public void clickOnSubmit(){
        this.singUpPageObject.getSubmit().click();
    }



}




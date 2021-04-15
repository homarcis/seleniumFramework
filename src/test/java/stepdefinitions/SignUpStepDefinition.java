package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjects.SignUpServices;
import pageobjects.SingUpPageObject;
import util.HookDriver;
import util.RandomNumberGenerator;

public class SignUpStepDefinition {

    @Given("^Client wants to have an account$")
    public void client_wants_to_have_an_account() throws InterruptedException {



        SignUpServices singUp = new SignUpServices(HookDriver.driver);
        singUp.go("http://demo.automationtesting.in/Register.html");
        singUp.writeFirstName("Pepito");
        singUp.writeLastName("Perez");
        singUp.writeEmail("homar@golstats.com");
        singUp.selectMale();
        singUp.selectCountry("Belgium");
        singUp.selectBirthday("10");
        singUp.selectBirthMonth("February");
        singUp.selectBirthYear("1989");
        singUp.writePhone(RandomNumberGenerator.get());
        singUp.writePassword("C0nTraseÑa_123");
        singUp.writeConfirmPassword("C0nTraseÑa_123");
        singUp.clickOnSubmit();

        Thread.sleep(8000);



    }

    @When("^he send required information to get the account$")
    public void he_send_required_information_to_get_the_account() {

    }

    @Then("^he should be told that the account was created$")
    public void he_should_be_told_that_the_account_was_created() {

    }


}

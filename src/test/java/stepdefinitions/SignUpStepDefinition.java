package stepdefinitions;

import conf.DriverConfig;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import pageobjects.SignUpServices;
import pageobjects.SingUpPageObject;
import util.HookDriver;
import util.RandomNumberGenerator;

@ContextConfiguration (classes = {DriverConfig.class})
public class SignUpStepDefinition {

    @Autowired
    private SignUpServices signUp;

    @Given("^Client wants to have an account$")
    public void client_wants_to_have_an_account() throws InterruptedException {



        //SignUpServices signUp = new SignUpServices(HookDriver.driver);
        signUp.go("http://demo.automationtesting.in/Register.html");
        signUp.writeFirstName("Pepito");
        signUp.writeLastName("Perez");
        signUp.writeEmail("homar@golstats.com");
        signUp.selectMale();
        signUp.selectCountry("Belgium");
        signUp.selectBirthday("10");
        signUp.selectBirthMonth("February");
        signUp.selectBirthYear("1989");
        signUp.writePhone(RandomNumberGenerator.get());
        signUp.writePassword("C0nTraseÑa_123");
        signUp.writeConfirmPassword("C0nTraseÑa_123");
        signUp.clickOnSubmit();

        Thread.sleep(8000);



    }

    @When("^he send required information to get the account$")
    public void he_send_required_information_to_get_the_account() {

    }

    @Then("^he should be told that the account was created$")
    public void he_should_be_told_that_the_account_was_created() {

    }


}

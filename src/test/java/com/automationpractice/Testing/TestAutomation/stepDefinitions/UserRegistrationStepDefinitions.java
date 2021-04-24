package com.automationpractice.Testing.TestAutomation.stepDefinitions;

import com.automationpractice.Testing.TestAutomation.pages.*;
import com.automationpractice.Testing.TestAutomation.validationPage.ShoppingCartSummary;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.PageGenerator;

import static org.junit.Assert.*;

public class UserRegistrationStepDefinitions {
    protected WebDriver driver = Hook.getDriver();

    @Given("^that I opened the automationpractice page$")
    public void thatIOpenedBrowserAtAutomationpracticePage() throws Throwable {

        PageGenerator.getInstance(HomeYourLogoPage.class, driver).goToThePage();
    }

    @And("^I want to register a new (.*) into the platform$")
    public void iClickOnSignIn(String userEmail) throws Throwable {
        PageGenerator.getInstance(HomeYourLogoPage.class, driver).goToSignInPage();
        PageGenerator.getInstance(UserRegistrationPage.class, driver).fillUserRegistrationEmail(userEmail);
    }

    @And("^send the personal information (.*) (.*) (.*) (.*) (.*)$")
    public void sendPersonalInformation(String title, String firstName, String lastName, String email, String password) throws Throwable {
        PageGenerator.getInstance(CreateAccountPage.class, driver).fillPersonalInformation(title,firstName,lastName,email, password);

    }

    @And("^address details (.*) (.*) (.*) (.*) (.*)$")
    public void sendAddressDetails(String address, String city, String state, String zip, String phone) throws Throwable {
        PageGenerator.getInstance(CreateAccountPage.class, driver).sendAddressDetails(address,city,state,zip,phone);

    }

    @Then("^the new user should be created and the user see the message (.*)$")
    public void sendAddressDetails(String message) throws Throwable {
        assertEquals(message, PageGenerator.getInstance(CreateAccountPage.class, driver).verifyMessageAccountCreated());

    }


    @Then("^should the create account form be shown$")
    public void shouldTheCreateAccountFormBeShown() throws Throwable{
       // System.out.println("Result"+ PageGenerator.getInstance(RegistrationForm.class, driver).getFormTag());
        assertTrue(PageGenerator.getInstance(RegistrationForm.class, driver).formExists());
       // assertEquals(PageGenerator.getInstance(RegistrationForm.class, driver).getFormTag());
        //assertEquals(PageGenerator.getInstance(RegistrationForm.class, driver).getFormTag());
    }

    @Then("^a '(.*)' error message should be displayed$")
    public void shouldDisplayAnInValidEmailErrorMessage(String emailErrorMessage) throws Throwable{
        assertEquals(emailErrorMessage, PageGenerator.getInstance(UserRegistrationPage.class, driver).returnAccountErrorMessage());

    }
}



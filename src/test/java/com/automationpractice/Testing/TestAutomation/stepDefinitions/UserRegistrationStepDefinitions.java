package com.automationpractice.Testing.TestAutomation.stepDefinitions;

import com.automationpractice.Testing.TestAutomation.pages.BasePage;
import com.automationpractice.Testing.TestAutomation.pages.HomeYourLogoPage;
import com.automationpractice.Testing.TestAutomation.pages.RegistrationForm;
import com.automationpractice.Testing.TestAutomation.pages.UserRegistrationPage;
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

    @And("^I click on Sign-in$")
    public void iClickOnSignIn() throws Throwable {
        PageGenerator.getInstance(HomeYourLogoPage.class, driver).goToSignInPage();
    }

    @When("^I enter an email '(.*)'$")
    public void iEnterAEmail(String userEmail) throws Throwable{
        PageGenerator.getInstance(UserRegistrationPage.class, driver).fillUserRegistrationEmail(userEmail);
    }

    @Then("^should the create account form be shown$")
    public void shouldTheCreateAccountFormBeShown() throws Throwable{
       // System.out.println("Result"+ PageGenerator.getInstance(RegistrationForm.class, driver).getFormTag());
        assertTrue(PageGenerator.getInstance(RegistrationForm.class, driver).formExists());
       // assertEquals(PageGenerator.getInstance(RegistrationForm.class, driver).getFormTag());
        //assertEquals(PageGenerator.getInstance(RegistrationForm.class, driver).getFormTag());
    }
    /*@When("^I enter the user information (.*) (.*)'$")
    public void iEnterTheUserInformationNameLastname(String firstName, String lastName) throws Throwable {
        PageGenerator.getInstance(RegistrationForm.class, driver).fillTitle();
        PageGenerator.getInstance(RegistrationForm.class, driver).fillFirstName(firstName);
        PageGenerator.getInstance(RegistrationForm.class, driver).fillLastName(lastName);}*/

    @Then("^the user is registered$")
    public void theUserIsRegistered() {
        System.out.println("Hello World");
    }

    @When("^I enter the user information (.*) (.*)$")
    public void iEnterTheUserInformationNameLastname() {
        System.out.println("test");
    }

}



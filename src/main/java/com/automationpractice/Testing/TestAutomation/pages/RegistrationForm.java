package com.automationpractice.Testing.TestAutomation.pages;

import net.serenitybdd.screenplay.actions.SendKeys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationForm extends BasePage {

    @FindBy(xpath = "//h1[normalize-space()='Create an account']")
    private WebElement accountCreationForm;
    @FindBy(className = "top")
    private WebElement  title;
    @FindBy(id = "customer_firstname")
    private WebElement  firstNameWeb;
    @FindBy(id = "customer_lastname")
    private WebElement  lastNameWeb;
    @FindBy(id = "email")
    private WebElement  email;
    @FindBy(id = "passwd")
    private WebElement  password;
    @FindBy(id = "days")
    private WebElement  dayOfBirth;
    @FindBy(id = "months")
    private WebElement  monthOfBirth;
    @FindBy(id = "years")
    private WebElement yearOfBirth;
    @FindBy(id = "address1")
    private WebElement address;
    @FindBy(id = "city")
    private WebElement city;
    @FindBy(id = "id_state")
    private WebElement state;
    @FindBy(id = "postcode")
    private WebElement postalCode;
    @FindBy(id = "id_country")
    private WebElement country;
    @FindBy(id = "phone_mobile")
    private WebElement mobile;


    public RegistrationForm (WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public WebElement getFormTag() {
        return accountCreationForm;
    }

    public boolean formExists(){
        return existsElement(accountCreationForm);
    }
    public void fillTitle () {
        click(title);
    }
    public void fillFirstName(String firstName){firstNameWeb.getAttribute(firstName);}
    public void fillLastName(String lastName){lastNameWeb.getAttribute(lastName);}
    }




package com.automationpractice.Testing.TestAutomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationForm extends BasePage {

    @FindBy(xpath = "//h1[normalize-space()='Create an account']")
    private WebElement accountCreationForm;

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
}


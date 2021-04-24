package com.automationpractice.Testing.TestAutomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class UserRegistrationPage extends BasePage{

    @FindBy(id = "email_create")
    private WebElement userEmailField;

    @FindBy(id = "SubmitCreate")
    private WebElement submitCreate;

    @FindBy(xpath = "//*[@id='create_account_error']/ol/li")
    private WebElement accountErrorMessage;

    public UserRegistrationPage (WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void fillUserRegistrationEmail(String userEmail){
        waitVisibility(userEmailField);
        writeText(userEmailField,userEmail);
        click(submitCreate);
    }

    public String returnAccountErrorMessage(){
        waitVisibility(accountErrorMessage);
        return accountErrorMessage.getText();
    }

}

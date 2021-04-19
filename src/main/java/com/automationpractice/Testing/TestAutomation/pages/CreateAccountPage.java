package com.automationpractice.Testing.TestAutomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountPage extends BasePage {


	@FindBy(id = "id_gender1")
	private WebElement cbTitleMr;

	@FindBy(id = "id_gender2")
	private WebElement cbTitleMrs;

	@FindBy(id = "customer_firstname")
	private WebElement lblFirstName;

	@FindBy(id = "customer_lastname")
	private WebElement lblLastName;

	@FindBy(id = "email")
	private WebElement lblEmail;

	@FindBy(id = "passwd")
	private WebElement lblPassword;

	@FindBy(id = "address1")
	private WebElement lblAddress;

	@FindBy(id = "city")
	private WebElement lblCity;

	@FindBy(id = "id_state")
	private WebElement cmState;

	@FindBy(id = "postcode")
	private WebElement lblZip;

	@FindBy(id = "phone_mobile")
	private WebElement lblPhone;

	@FindBy(xpath = "//span[normalize-space()='Register']")
	private WebElement btnRegister;

	@FindBy(xpath = "//p[@class='info-account']")
	private WebElement lblAccountCreated;


	public CreateAccountPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void fillPersonalInformation(String title, String firstName, String lastName, String email, String password) {
		waitVisibility(lblFirstName);


		if(title.equals("Mr")){
			click(cbTitleMr);
		}
		if(title.equals("Mrs")){
			click(cbTitleMrs);
		}
		writeText(lblFirstName, firstName);
		writeText(lblLastName, lastName);
		//writeText(lblEmail, email);
		writeText(lblPassword, password);
	}
	public void sendAddressDetails(String address, String city, String state, String zip, String phone){
		writeText(lblAddress,address);
		writeText(lblCity,city);
		final Select selectState =  new Select(cmState);
		selectState.selectByVisibleText(state);
		writeText(lblZip,zip);
		writeText(lblPhone,phone);
		click(btnRegister);
	}

	public String verifyMessageAccountCreated(){
		waitVisibility(lblAccountCreated);
		return lblAccountCreated.getText();
	}
}

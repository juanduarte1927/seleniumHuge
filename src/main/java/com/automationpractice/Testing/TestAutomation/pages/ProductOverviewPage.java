package com.automationpractice.Testing.TestAutomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.StaticWait;

public class ProductOverviewPage extends BasePage {

	@FindBy(name = "Submit")
	private WebElement buttonAddToCart;

	@FindBy(id = "quantity_wanted")
	private WebElement productQuantity;

	@FindBy(xpath = "//a[@class='btn btn-default button button-medium']//span")
	private WebElement buttonProceedToCheckout;

	@FindBy(className = "navigation_page")
	private WebElement labelYourShoppingCart;

	public ProductOverviewPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void setQuantity(String quantity){
		waitVisibility(productQuantity);
		clearField(productQuantity);
		writeText(productQuantity, quantity);
	}

	public void addToShoppingCart() {
		waitVisibility(buttonAddToCart);
		click(buttonAddToCart);
		waitVisibility(buttonProceedToCheckout);
		click(buttonProceedToCheckout);
		StaticWait.WaitForSeconds(2);
		waitVisibility(labelYourShoppingCart);
	}

}

package com.automationpractice.Testing.TestAutomation.validationPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.automationpractice.Testing.TestAutomation.pages.BasePage;

public class ShoppingCartSummary extends BasePage {

	@FindBy(xpath = "//td[@class='cart_description']//p[@class='product-name']//a")
	private WebElement productInShoppingCart;

	@FindBy(xpath = "//input[@class='cart_quantity_input form-control grey']")
	private WebElement productQuantityInShoppingCart;

	public ShoppingCartSummary(WebDriver driver) {
		super(driver);
	}

	public String validateShoppingCart() {
		return exists(productInShoppingCart);
	}

	public String shoppingCartAmount(){ return productQuantityInShoppingCart.getAttribute("value");}

}

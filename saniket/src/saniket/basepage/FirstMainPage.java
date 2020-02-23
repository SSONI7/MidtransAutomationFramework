package saniket.basepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FirstMainPage {
	
	WebDriver driver;

	public FirstMainPage(WebDriver driver){
		this.driver=driver;
		}
	
	@FindBy(xpath = "//a[@class='btn buy']")
	WebElement BuyNow;
	
	@FindBy(xpath = "//div[@class='cart-checkout']")
	WebElement CheckOut;
	
	
	public void Buttonclick() {
		BuyNow.click();
	}
	
	public void CheckoutButtonClick() {
		CheckOut.click();
	}
	
	
}

package saniket.basepage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderSummary {
	
	WebDriver driver;
	
	public OrderSummary(WebDriver driver) {
		this.driver = driver;
	}
	
   @FindBy(className = ("button-main-content"))
	WebElement SampleOrderSummary;
   
   @FindBy(xpath = "//*[@id=\"payment-list\"]/div[2]/a")
   WebElement CardType;
   
   @FindBy(xpath = "//*[@id=\"application\"]/div[3]/div/div/div/form/div[2]/div[1]/input")
   WebElement CardNumber;
   
   @FindBy(xpath = "//*[@id=\"application\"]/div[3]/div/div/div/form/div[2]/div[2]/input")
   WebElement ExpiryDate;
   
   @FindBy(xpath = "//*[@id=\"application\"]/div[3]/div/div/div/form/div[2]/div[3]/input")
   WebElement CVVNumber;
   
   @FindBy(xpath = "//*[@id=\"application\"]/div[1]")
   WebElement PayNow;
   
   
   public void ContinueButton() {
	   int size = driver.findElements(By.tagName("iframe")).size();
	   System.out.println(size);
	   driver.switchTo().frame(0);
	   SampleOrderSummary.click();
	  
   }
    public void CreditCard() {
    	 CardType.click();	
    }
    public void CardDetails() {
    	CardNumber.sendKeys("4811 1111 1111 1114");
    	ExpiryDate.sendKeys("02/20");
    	CVVNumber.sendKeys("123");
    	PayNow.click();
    	driver.switchTo().defaultContent();
    }
    public void FailedCardDetails() {
    	CardNumber.sendKeys("4811 1111 1111 1113");
    	ExpiryDate.sendKeys("02/20");
    	CVVNumber.sendKeys("123");
    	PayNow.click();
    	
    }
    
    public void Verification() {
        String text1 = "Invalid card number";
    	String text =  driver.findElement(By.xpath("//*[@id='application']/div[3]/div/div/div/form/div[2]/div[1]/div/span")).getText();
    	//System.out.println(text);
  	 if(text.equalsIgnoreCase(text1)){
        System.out.println("Invalid card number entred");
   	  }else {
   		System.out.println("card number verified");  	}
    }

}

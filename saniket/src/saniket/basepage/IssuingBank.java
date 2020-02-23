package saniket.basepage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IssuingBank {
	
	WebDriver driver;
	
	public IssuingBank(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(xpath = "//*[@id='PaRes']")
	WebElement OTP;
	
	@FindBy(xpath = "//*[@id=\"acsForm\"]/div[6]/div/button[1]")
	WebElement otpOkButton;
	
	public void OTPdetails() {
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='application']/div[3]/div/div/div/iframe")));
	    driver.findElement(By.xpath("//*[@id='PaRes']")).sendKeys("112233");
		//OTP.sendKeys("112233");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		otpOkButton.click();
	}
}

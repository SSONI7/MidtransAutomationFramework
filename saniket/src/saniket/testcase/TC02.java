package saniket.testcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import saniket.basepage.FirstMainPage;
import saniket.basepage.IssuingBank;
import saniket.basepage.OrderSummary;

public class TC02 extends HelperClass{
	
    @Test
	public void Failedpurchaseflow() {
		
		  driver.get("https://demo.midtrans.com/");
		  
		  FirstMainPage mainpage = PageFactory.initElements(driver,FirstMainPage.class);
		  mainpage.Buttonclick();
		  mainpage.CheckoutButtonClick();
		  OrderSummary ordersummary = PageFactory.initElements(driver,OrderSummary.class);  
		  ordersummary.ContinueButton();
		  ordersummary.CreditCard();
		  ordersummary.FailedCardDetails();
		  ordersummary.Verification();
	  }

	}


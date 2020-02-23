package saniket.testcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import saniket.basepage.FirstMainPage;
import saniket.basepage.IssuingBank;
import saniket.basepage.OrderSummary;


public class TC01 extends CommonClass {

	
  @Test
  public void purchaseflow() {
	  
	  driver.get("https://demo.midtrans.com/");
	  
	  FirstMainPage mainpage = PageFactory.initElements(driver,FirstMainPage.class);
	  mainpage.Buttonclick();
	  mainpage.CheckoutButtonClick();
	  OrderSummary ordersummary = PageFactory.initElements(driver,OrderSummary.class);  
	  ordersummary.ContinueButton();
	  ordersummary.CreditCard();
	  ordersummary.CardDetails();
	  IssuingBank issuingbank = PageFactory.initElements(driver,IssuingBank.class);
	  issuingbank.OTPdetails();
	  
  }

}

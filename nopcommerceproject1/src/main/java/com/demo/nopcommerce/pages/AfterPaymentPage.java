package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

public class AfterPaymentPage  extends Utility {


        By locatorActualPageTitleMessageAfterPayment =By.xpath("//h1[contains(text(),'Thank you')]");
        By locatorActualOrderSuccessfulMessage=    By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]");
        By locatorButtonContinueFromAfterPaymentPage = By.xpath("//button[contains(text(),'Continue')]");



        public String verifyActualPageTitleMessageAfterPayment(){
            return getTextFromElement(locatorActualPageTitleMessageAfterPayment);
        }

        public String verifyActualOrderSuccessfulMessage(){
            return getTextFromElement(locatorActualOrderSuccessfulMessage);
        }

        public void clickOnButtonContinueFromAfterPaymentPage(){

            clickOnElement(locatorButtonContinueFromAfterPaymentPage);
        }
    }


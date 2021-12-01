package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

public class RegistrationSuccessfullPage extends Utility {

    By locatorMessageOfSuccessfulRegistration = By.xpath("//div[contains(text(),'Your registration completed')]");
    By locationButtonContinue = By.xpath("//a[contains(text(),'Continue')]");

    public String actualMessageOfSuccessfulRegistration(){
        return getTextFromElement(locatorMessageOfSuccessfulRegistration);
    }

    public void clickOnButtonContinue() throws InterruptedException {
        clickOnElement(locationButtonContinue);
        Thread.sleep(3000);
    }


}


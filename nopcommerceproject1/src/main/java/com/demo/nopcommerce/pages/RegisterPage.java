package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utility.Utility;
import net.bytebuddy.utility.RandomString;
import org.openqa.selenium.By;

import java.util.Random;

public class RegisterPage extends Utility {

    By registerLink = By.xpath("//a[contains(text(),'Register')]");
    By locatorTitleTextOfRegisterPage = By.xpath("//h1[contains(text(),'Register')]");
    By locatorFirstNameInputBox = By.xpath("//input[@id='FirstName']");
    By locatorLastNameInputBox = By.xpath("//input[@id='LastName']");
    By locatorEmailInputBox = By.xpath("//input[@id='Email']");
    By locatorPasswordInputBox = By.xpath("//input[@id='Password']");
    By locatorConfirmPasswordInputBox = By.xpath("//input[@id='ConfirmPassword']");
    By locatorButtonRegister = By.xpath("//button[@id='register-button']");

    public void fillInFirstName(){
        sendTextToElement(locatorFirstNameInputBox, "Sam");
    }

    public void fillInLastName(){
        sendTextToElement(locatorLastNameInputBox, "Murphy");
    }

    public void fillInEmail(){
        Random randomPartOfEmailGenerator = new Random(2000);
        int randomNumberInEmail = randomPartOfEmailGenerator.nextInt();
        RandomString randomString = new RandomString(5);
        String randomStringInEmailGenerator = randomString.nextString();

        sendTextToElement(locatorEmailInputBox, "Sam" + randomNumberInEmail + randomStringInEmailGenerator + "xtz@gmail.com");
    }

    public void fillInPassword(){
        sendTextToElement(locatorPasswordInputBox, "Abcd123");
    }

    public void fillInConfirmPassword(){
        sendTextToElement(locatorConfirmPasswordInputBox, "Abcd123");
    }

    public void clickOnButtonRegister() throws InterruptedException {
        clickOnElement(locatorButtonRegister);
        Thread.sleep(2000);
    }

    public String actualTitleTextOfRegisterPage(){
        return getTextFromElement(locatorTitleTextOfRegisterPage);
    }


}
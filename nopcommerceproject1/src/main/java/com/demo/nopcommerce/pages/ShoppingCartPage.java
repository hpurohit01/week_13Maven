package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

public class ShoppingCartPage extends Utility {

    By actualTitleOfShoppingCart = By.xpath("//h1[contains(text(),'Shopping cart')]");

    By qtyInputBox = By.xpath("//input[@class='qty-input']");
    By buttonUpdateShoppingCart = By.xpath("//button[contains(text(),'Update shopping cart')]");
    By actualTotalInCart = By.xpath("//span[@class='product-subtotal']");

    By checkBoxAgreeTermsAndCondition = By.xpath("//input[@id='termsofservice']");
    By buttonCheckout = By.xpath("//button[@id='checkout']");


    public String verifyThetitleMessageFromShoppingCartPage(){
        waitUntilVisibilityOfElementLocated(actualTitleOfShoppingCart, 3);
        return getTextFromElement(actualTitleOfShoppingCart);
    }

    public void clearAndChangeQtyInShoppingCart(){
        clearValue(qtyInputBox);
        sendTextToElement(qtyInputBox,"2");
    }

    public String actualQtyInShoppingCart(){
        return getTextFromElement(qtyInputBox);
    }

    public void clickOnButtonUpdateShoppingCart(){
        clickOnElement(buttonUpdateShoppingCart);
    }

    public String verifyTheTotalInShoppingCart(){
        waitUntilVisibilityOfElementLocated(actualTotalInCart, 2);
        return getTextFromElement(actualTotalInCart);
    }

    public void clickOnCheckoutButton(){
        clickOnElement(buttonCheckout);
    }

}


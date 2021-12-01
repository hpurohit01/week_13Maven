package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

public class NokiaLumiaPage extends Utility {






    By locatorTitleTextOfProductNokiaLumia1020Page = By.xpath("//h1[contains(text(),'Nokia Lumia 1020')]");
    By locatorPriceOfProductNokiaLumia1020 = By.xpath("//span[@id='price-value-20']");
    By locatorQtyProductNokiaLumia1020 = By.xpath("(//input[@id='product_enteredQuantity_20'])[1]");
    By locatorButtonAddToCartFromPageNokiaLumia1020 = By.xpath("(//button[@id='add-to-cart-button-20'])[1]");
    By locatorMessageOfProductBeingInShoppingCart = By.xpath("//p[@class='content']");
    By locatorCrossFromMessage = By.xpath("//body/div[@id='bar-notification']/div[1]/span[1]");
    By locatorShoppingCartLinkFromNokiaLumia1020Page = By.xpath("//span[contains(text(),'Shopping cart')]");
    By locatorButtonAddToCartFromNokiaLumia1020Page = By.xpath("//button[contains(text(),'Go to cart')]");


    public String actualTitleTextOfProductNokiaLumia1020Page() {
        return getTextFromElement(locatorTitleTextOfProductNokiaLumia1020Page);
    }

    public String actualPriceOfProductNokiaLumia1020() {
        return getTextFromElement(locatorPriceOfProductNokiaLumia1020);
    }

    public void clearAndUpdateQtyOfProductNokiaLumia1020() throws InterruptedException {
        clearValue(locatorQtyProductNokiaLumia1020);
        String newQty = "2";
        sendTextToElement(locatorQtyProductNokiaLumia1020, newQty);
        Thread.sleep(1000);
    }

    public void clickOnButtonAddToCartFromPageNokiaLumia1020() throws InterruptedException {
        clickOnElement(locatorButtonAddToCartFromPageNokiaLumia1020);
        Thread.sleep(1000);
    }

    String actualMessageOfProductBeingInShoppingCart;
    public String actualMessageOfProductBeingInShoppingCart() throws InterruptedException {
        return getTextFromElement(locatorMessageOfProductBeingInShoppingCart);
    }

    public void clickOnCrossFromMessage() throws InterruptedException {
        clickOnElement(locatorCrossFromMessage);
        Thread.sleep(1000);
    }

    public void hoverToShoppingCartAndClickOnAddToCart() throws InterruptedException {
        mouseHoverOnFirstThenSecondAndClick(locatorShoppingCartLinkFromNokiaLumia1020Page, locatorButtonAddToCartFromPageNokiaLumia1020);
        Thread.sleep(2000);
    }


}
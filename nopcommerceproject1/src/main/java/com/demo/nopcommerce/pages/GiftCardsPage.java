package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

public class GiftCardsPage extends Utility {

    By menuGiftCardsLink = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Gift Cards']");

    public String getTitleTextFromGiftCardsPage(){
        return getTextFromElement(menuGiftCardsLink);
    }
}

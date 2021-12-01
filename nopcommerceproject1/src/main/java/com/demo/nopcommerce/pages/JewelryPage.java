package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

public class JewelryPage extends Utility {

    By menuJewelryLink = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Jewelry']");


    public String getTitleTextFromJewelryPage() {
        return getTextFromElement(menuJewelryLink);
    }
}
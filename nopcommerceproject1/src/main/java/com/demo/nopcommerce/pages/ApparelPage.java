package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

public class ApparelPage extends Utility {

    By menuApparelLink = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Apparel']");

    public String getTitleTextFromApparelPage() {

        return getTextFromElement(menuApparelLink);
    }
}

package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

public class BooksPage extends Utility {

    By menuBooksLink = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Books']");


    public String getTitleTextFromBooksPage() {

        return getTextFromElement(menuBooksLink);
    }
}


package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

public class CellPhonePage extends Utility {
    By menuCellphoneLink = By.xpath("//h1[contains(text(),'Cell phones')]");


    public String getTitleTextFromCellPhonePage() {

        return getTextFromElement(menuCellphoneLink);
    }
}




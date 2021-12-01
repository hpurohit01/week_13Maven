package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

public class BuildYourOwnComputerPage extends Utility {

    By pageTitleTextOfBuildYourOwnComputerPage = By.xpath("//h1[contains(text(),'Build your own computer')]");

    public String getTextFromBuildYourOwnComputerPage() {

        return getTextFromElement(pageTitleTextOfBuildYourOwnComputerPage);
    }
}

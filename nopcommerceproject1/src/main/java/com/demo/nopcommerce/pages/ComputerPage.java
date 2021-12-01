package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

public class ComputerPage extends Utility {

    By computersPageTitleText = By.xpath("//h1[contains(text(),'Computers')]");

    By desktopsLinkXpath = By.xpath("//a[@href='/desktops']");

    public void clickOnDesktopsFromComputersPage(){
        clickOnElement(desktopsLinkXpath);
    }





    public String getTitleTextFromComputersPage() {
        return getTextFromElement(computersPageTitleText);
    }


    }

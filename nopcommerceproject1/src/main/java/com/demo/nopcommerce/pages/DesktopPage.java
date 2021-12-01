package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

public class DesktopPage extends Utility {

    By sortByLocator = By.id("products-orderby");
    public void clickOnSortBy(){
        selectByValueFromDropDown(sortByLocator,"2"); // Name A to Z will be clicked
    }

    By buildYourOwnComputerXpath = By.xpath("//a[@href='/build-your-own-computer']");
    public void clickOnBuildYourOwnComputerLink(){

        clickOnElement(buildYourOwnComputerXpath);
    }



}

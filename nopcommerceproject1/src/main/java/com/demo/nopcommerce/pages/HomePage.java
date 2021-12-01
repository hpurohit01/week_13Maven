package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {





        By registerLink = By.xpath("//a[contains(text(),'Register')]");
        By loginLink = By.linkText("Log in");
        By wishlistLink = By.linkText("Wishlist");
        By shoppingCartLink = By.xpath("//span[contains(text(),'Shopping cart')]");
        By searchStoreTextBox = By.id("small-searchterms");


        By menuComputersLink = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']");
        By MenuDesktopsLink = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Desktops']");
        By MenuNotebooksLink = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Notebooks']");
        By MenuSoftwareLink = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Software']");


        By menuElectronicsLink = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']");
        By MenuCameraAndPhotoLink = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Camera & photo']");
        By MenuCellPhonesLink = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Cell phones']");
        By MenuOthersLink = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Others']");


        By menuApparelLink = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Apparel']");
        By menuDigitalDownloadsLink = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Digital downloads']");
        By menuBooksLink = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Books']");


        By menuJewelryLink = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Jewelry']");


        By menuGiftCardsLink = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Gift Cards']");


        By locatorWelcomeToOutStoreMessage = By.xpath("//h2[contains(text(),'Welcome to our store')]");


        public String actualTextOfWelcomeToOurStoreFromHomePage() {
            return getTextFromElement(locatorWelcomeToOutStoreMessage);
        }


        public void clickOnMenuComputersLink() {
            clickOnElement(menuComputersLink);
        }

        public void clickOnMenuElectronicsLink() {
            clickOnElement(menuElectronicsLink);
        }

        public void clickOnMenuApparelLink() {
            clickOnElement(menuApparelLink);
        }

        public void clickOnMenuDigitalDownloadLink() {
            clickOnElement(menuDigitalDownloadsLink);
        }

        public void clickOnMenuBooksLink() {
            clickOnElement(menuBooksLink);
        }

        public void clickOnMenuJewelryLink() {
            clickOnElement(menuJewelryLink);
        }

        public void clickOnMenuGiftCardsLink() {
            clickOnElement(menuGiftCardsLink);
        }

        public void hoverToElectronicsAndClickOnCellPhoneLink() {
            mouseHoverOnFirstThenSecondAndClick(menuElectronicsLink, MenuCellPhonesLink);


        }
    }

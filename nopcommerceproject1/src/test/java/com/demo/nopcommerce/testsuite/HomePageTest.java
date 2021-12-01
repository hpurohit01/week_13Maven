package com.demo.nopcommerce.testsuite;

import com.demo.nopcommerce.pages.*;
import com.demo.nopcommerce.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase {

    HomePage homePage = new HomePage();
    ComputerPage computersPage = new ComputerPage();
    ElectronicPage electronicsPage = new ElectronicPage();
    ApparelPage apparelPage = new ApparelPage();
    DigitalDownloadsPage digitalDownloadsPage = new DigitalDownloadsPage();
    BooksPage booksPage = new BooksPage();
    JewelryPage jewelryPage = new JewelryPage();
    GiftCardsPage giftCardsPage = new GiftCardsPage();

    @Test
    public void verifyThatHomePageMenuIsClickable(){
        homePage.clickOnMenuComputersLink();
        String actualTitleOfComputersPage = computersPage.getTitleTextFromComputersPage();
        String expectedTitleTextOfComputersPage = "Computers";
        Assert.assertEquals(actualTitleOfComputersPage,expectedTitleTextOfComputersPage, "Computers title text not matched");
        
        homePage.clickOnMenuElectronicsLink();
        homePage.clickOnMenuGiftCardsLink();
    }

        @Test
        public void verifyComputersPageNavigation() throws InterruptedException {
            homePage.clickOnMenuComputersLink();


            Thread.sleep(3000);
            String expectedPageTitle = "Computers";
            String actualPageTitle = computersPage.getTitleTextFromComputersPage();
            Assert.assertEquals(expectedPageTitle, actualPageTitle, "Title from page not displayed ");
        }

        @Test
        public void verifyElectronicsPageNavigation() throws InterruptedException {
            homePage.clickOnMenuElectronicsLink();
               //WebDriverWait wait = new WebDriverWait(driver, 10);
            Thread.sleep(3000);

            String expectedPageTitle = "Electronics";
            String actualPageTitle = electronicsPage.getTitleTextFromElectronicsPage();
            Assert.assertEquals(expectedPageTitle, actualPageTitle, "Title from page not displayed");
        }

        @Test
        public void verifyApparelPageNavigation() throws InterruptedException {
            homePage.clickOnMenuApparelLink();
            Thread.sleep(3000);

            String expectedPageTitle = "Apparel";
            String actualPageTitle = apparelPage.getTitleTextFromApparelPage();
            Assert.assertEquals(expectedPageTitle, actualPageTitle, "Title from page not displayed");
        }

        @Test
        public void verifyDigitalDownloadsPageNavigation() throws InterruptedException {
            homePage.clickOnMenuDigitalDownloadLink();
            Thread.sleep(3000);

            String expectedPageTitle = "Digital downloads";
            String actualPageTitle = digitalDownloadsPage.getTitleTextFromDigitalDownloadsPage();
            Assert.assertEquals(expectedPageTitle, actualPageTitle, "Title from page not displayed");
        }

        @Test
        public void verifyBooksPageNavigation() throws InterruptedException {
            homePage.clickOnMenuBooksLink();
            Thread.sleep(3000);

            String expectedPageTitle = "Books";
            String actualPageTitle = booksPage.getTitleTextFromBooksPage();
            Assert.assertEquals(expectedPageTitle, actualPageTitle, "Title from page not displayed");
        }

        @Test
        public void verifyJewelryPageNavigation() throws InterruptedException {
            homePage.clickOnMenuJewelryLink();
            Thread.sleep(3000);

            String expectedPageTitle = "Jewelry";
            String actualPageTitle = jewelryPage.getTitleTextFromJewelryPage();
            Assert.assertEquals(expectedPageTitle, actualPageTitle, "Title from page not displayed");
        }

        @Test
        public void verifyGiftCardsPageNavigation() throws InterruptedException {
            homePage.clickOnMenuGiftCardsLink();
            Thread.sleep(3000);

            String expectedPageTitle = "Gift cards";
            String actualPageTitle = giftCardsPage.getTitleTextFromGiftCardsPage();
            Assert.assertEquals(expectedPageTitle, actualPageTitle, "Title from page not displayed");
        }

    }


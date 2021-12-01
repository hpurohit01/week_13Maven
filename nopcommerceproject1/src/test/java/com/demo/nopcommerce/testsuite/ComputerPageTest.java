package com.demo.nopcommerce.testsuite;

import com.demo.nopcommerce.testbase.TestBase;

public class ComputerPageTest extends TestBase {

}  /*public class TestComputer extends TestBase {

        HomePage homePage = new HomePage();
        ComputersPage computersPage = new ComputersPage();
        DesktopPage desktopPage = new DesktopPage();
        BuildYourOwnComputerPage buildYourOwnComputerPage = new BuildYourOwnComputerPage();
        CheckOutAsGuestPage checkOutAsGuestPage = new CheckOutAsGuestPage();
        CheckOutPage checkOutPage = new CheckOutPage();
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
        AfterPaymentPage afterPaymentPage = new AfterPaymentPage();

        @Test
        public void verifyProductsArrangedInDescendingOrder() throws InterruptedException {
            homePage.clickOnMenuComputersLink();

            computersPage.clickOnDesktopsLink();

            desktopPage.verifyProductArrangedInAlphabeticalOrder();
        }

        @Test
        public void verifyProductAddedToShoppingCartSuccessfully() throws InterruptedException {

            homePage.clickOnMenuComputersLink();

            computersPage.clickOnDesktopsLink();

            desktopPage.selectAtoZfromSoryBy();

            desktopPage.clickOnAddToCartBuildYourOwnComputerProduct();

            String expectedPageTitle = "Build your own computer";
            Assert.assertEquals(buildYourOwnComputerPage.getTextFromBuildYourOwnComputerPage(),expectedPageTitle, "Title From page not displayed");

            buildYourOwnComputerPage.selectProcessorFromDropDown();

            buildYourOwnComputerPage.selectRamFromDropDown();

            buildYourOwnComputerPage.selectHddFromRadioButtons();

//        2.9 Select OS radio "Vista Premium [+$60.00]"
            buildYourOwnComputerPage.selectOsFromRadioButtons();

            buildYourOwnComputerPage.selectSoftwareMsOfficeAndTotalCommanderFromCheckBoxes();

            Thread.sleep(10000);

            String expectedTotalPrice = "$1,475.00";
            Assert.assertEquals(buildYourOwnComputerPage.verifyThePrice(),expectedTotalPrice, " Price is not displayed");

            buildYourOwnComputerPage.clickOnAddToCartButton();

            String expectedCartMessage = "The product has been added to your shopping cart";
            Assert.assertEquals(buildYourOwnComputerPage.actualCartMessage(),expectedCartMessage, "message pf product added to shopping card not displayed");

            buildYourOwnComputerPage.clickOnCrossSign();

            buildYourOwnComputerPage.mouseHoverOnShoppingCartAndClickOnGoToCartButton();

            String expectedTitleOfShoppingCart = "Shopping cart";
            Assert.assertEquals(shoppingCartPage.verifyThetitleMessageFromShoppingCartPage(),expectedTitleOfShoppingCart,  "Title message in shopping cart not displayed");

            shoppingCartPage.clearAndChangeQtyInShoppingCart();
            shoppingCartPage.clickOnButtonUpdateShoppingCart();

            String expectedTotalInCart = "$2,950.00";
            Assert.assertEquals(shoppingCartPage.verifyTheTotalInShoppingCart(), expectedTotalInCart,  "in shopping cart total not displayed");

            shoppingCartPage.tickTheCheckBoxOfTermsAndConditions();

            shoppingCartPage.clickOnCheckoutButton();

            String expectedPageTitleOfCheckoutPage = "Welcome, Please Sign In!";
            Assert.assertEquals(checkOutPage.verifyThePageTitleTextOfCheckOutPage(), expectedPageTitleOfCheckoutPage, "check out page title not displayed");

            checkOutPage.clickOnButtonCheckOutAsGuest();

            checkOutAsGuestPage.fillInFirstName();
            checkOutAsGuestPage.fillInLastName();
            checkOutAsGuestPage.fillInEmail();
            checkOutAsGuestPage.selectCountry();
            checkOutAsGuestPage.fillInCity();
            checkOutAsGuestPage.fillInAddress1();
            checkOutAsGuestPage.fillInPostalCode();
            checkOutAsGuestPage.fillInBillingNewAddressPhoneNumber();

            checkOutAsGuestPage.clickOnButtonContinueFromBillingAddress();

            checkOutAsGuestPage.clickOnRadioButtonNextDayAir();

            checkOutAsGuestPage.clickOnButtonContinueFromShippingMethod();

            checkOutAsGuestPage.clickOnRadioButtonCreditCard();
            checkOutAsGuestPage.clickOnButtonContinueFromPaymentMethod();

            checkOutAsGuestPage.clickOnDropDownSelectCard();

           checkOutAsGuestPage.fillInCardHolderNameInputBox();
            checkOutAsGuestPage.fillInCardNumberInputBox();
            checkOutAsGuestPage.selectDropDownExpiryDateMonth();
            checkOutAsGuestPage.selectDropDownExpiryDateYear();
            checkOutAsGuestPage.fillInCardCodeInputBox();

            checkOutAsGuestPage.clickOnButtonContinueFromPaymentInformation();

            String expectedTextOfCardMethod = "Credit Card";
            Assert.assertEquals(checkOutAsGuestPage.verifyActualTextOfCardMethod(), expectedTextOfCardMethod, "Text of type of payment method not displayed");

            String expectedTextOfShippingMethod = "Next Day Air";
            Assert.assertEquals(checkOutAsGuestPage.verifyActualTextOfShippingMethod(), expectedTextOfShippingMethod, "Text of shipping method not displayed");

            String expectedTotalFinalPrice = "$2,950.00";
            Assert.assertEquals(checkOutAsGuestPage.verifyActualTotalFinalPrice(), expectedTotalFinalPrice, "total final price not displayed");

            checkOutAsGuestPage.clickOnButtonConfirm();


            String expectedPageTitleMessageAfterPayment = "Thank you";
            Assert.assertEquals(afterPaymentPage.verifyActualPageTitleMessageAfterPayment(), expectedPageTitleMessageAfterPayment, "after payment page title not displayed");

            String expectedOrderSuccessfulMessage = "Your order has been successfully processed!";
            Assert.assertEquals(afterPaymentPage.verifyActualOrderSuccessfulMessage(), expectedOrderSuccessfulMessage, "After payment successfull message not displayed");

            afterPaymentPage.clickOnButtonContinueFromAfterPaymentPage();


            String expectedTitleMessageOfHomePage = "Welcome to our store";
            Assert.assertEquals(homePage.actualTextOfWelcomeToOurStoreFromHomePage(), expectedTitleMessageOfHomePage,"home page welcome message not displayed");
        }
    }*/

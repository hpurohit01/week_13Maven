package com.demo.nopcommerce.testsuite;

import com.demo.nopcommerce.pages.*;
import com.demo.nopcommerce.testbase.TestBase;
import org.testng.annotations.Test;

public class ElectronicPageTest extends TestBase {


    @Test

    public void clickOnMenuElectronicsLink() {
        electronicsPage.getTitleTextFromElectronicsPage();
    }


    HomePage homePage = new HomePage();
    ElectronicPage electronicsPage = new ElectronicPage();
    CellPhonePage cellPhonePage = new CellPhonePage();
    NokiaLumiaPage nokiaLumia1020Page = new NokiaLumiaPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    //  CheckOutPage checkOutPage = new CheckOutPage();
    RegisterPage registerPage = new RegisterPage();
    RegistrationSuccessfullPage registrationSuccessfullPage = new RegistrationSuccessfullPage();
    //  CheckOutAfterRegistrationsPage checkOutAfterRegistrationPage = new CheckOutAfterRegistrationsPage();
    AfterPaymentPage afterPaymentPage = new AfterPaymentPage();

    @Test
    public void verifyTheCellPhonePageNavigationSuccessfully() {


        homePage.hoverToElectronicsAndClickOnCellPhoneLink();
        String expectedMessage = "Cell phones";
        // Assert.assertEquals(, expectedMessage, "cell phone page title not matched");
    }
}
 /*   @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {
        homePage.hoverToElectronicsAndClickOnCellPhoneLink();

        String expectedMessage = "Cell phones";
        //  Assert.assertEquals(actualMessage, expectedMessage, "cell phone page title not matched");

        // cellPhonePage.clickOnListViewIcon();

        // cellPhonePage.clickOnProductNokiaLumia1020();

        String expectedTextOfNokiaLumia1020Page = "Nokia Lumia 1020";
        //Assert.assertEquals(cellPhonePage.actualPageTitleTextOfCellPhonePage(), expectedTextOfNokiaLumia1020Page, "Nokia Lumia 1020 page title text not matched");

        String expectedPriceOfNokiaLumia1020 = "$349.00";
        Assert.assertEquals(nokiaLumia1020Page.actualPriceOfProductNokiaLumia1020(), expectedPriceOfNokiaLumia1020, "Price of nokia lumia 1020 not matched");

        nokiaLumia1020Page.clearAndUpdateQtyOfProductNokiaLumia1020();

        nokiaLumia1020Page.clickOnButtonAddToCartFromPageNokiaLumia1020();

        String expectedMessageOfProductBeingInShoppingCart = "The product has been added to your shopping cart";
        Assert.assertEquals(nokiaLumia1020Page.actualMessageOfProductBeingInShoppingCart(), expectedMessageOfProductBeingInShoppingCart, "message 'The product has been added to your shopping cart' not displayed");

        //After that close the bar clicking on the cross button.
        nokiaLumia1020Page.clickOnCrossFromMessage();

        //2.11 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        nokiaLumia1020Page.hoverToShoppingCartAndClickOnAddToCart();

        //2.12 Verify the message "Shopping cart"
        String expectedShoppingCartTitleMessage = "Shopping cart";
        Assert.assertEquals(shoppingCartPage.verifyThetitleMessageFromShoppingCartPage(), expectedShoppingCartTitleMessage, "Shopping cart title message not displayed");

        String expectedQty = "2";
        Assert.assertEquals(shoppingCartPage.actualQtyInShoppingCart(), expectedQty, "Qty of Nokia lumia in shopping cart not matched");

        String expectedTotalAmount = "$698.00";
        Assert.assertEquals(shoppingCartPage.verifyTheTotalInShoppingCart(), expectedTotalAmount, "Total amount not matched");


        //2.16 Click on checkout
        shoppingCartPage.clickOnCheckoutButton();

        String expectedPageTitleOfCheckoutPage = "Welcome, Please Sign In!";
        // Assert.assertEquals(checkOutPage.verifyThePageTitleTextOfCheckOutPage(), expectedPageTitleOfCheckoutPage, "check out page title not displayed");

        // checkOutPage.clickOnButtonRegister();

        String expectedPageTitleOfRegisterPage = "Register";
        Assert.assertEquals(registerPage.actualTitleTextOfRegisterPage(), expectedPageTitleOfRegisterPage, "Title of register page not matched");

        registerPage.fillInFirstName();
        registerPage.fillInLastName();
        registerPage.fillInEmail();
        registerPage.fillInPassword();
        registerPage.fillInConfirmPassword();

        registerPage.clickOnButtonRegister();
        String expectedMessageOfSuccessfulRegistration = "Your registration completed";
      //  Assert.assertEquals(registrationSuccessfullPage.actualMessageOfSuccessfulRegistration(), expectedMessageOfSuccessfulRegistration, "Successful registration message not displayed");

        registrationSuccessfullPage.clickOnButtonContinue();

       // String expectedShoppingCartTitleMessage1 = "Shopping cart";
      //  Assert.assertEquals(shoppingCartPage.verifyThetitleMessageFromShoppingCartPage(), expectedShoppingCartTitleMessage1, "Shopping cart title message not displayed");

        //  shoppingCartPage.tickTheCheckBoxOfTermsAndConditions();

      //  shoppingCartPage.clickOnCheckoutButton();


       /*checkOutAfterRegistrationPage.fillInLastName();
        checkOutAfterRegistrationPage.fillInEmail();
        checkOutAfterRegistrationPage.selectCountry();
        checkOutAfterRegistrationPage.fillInCity();
        checkOutAfterRegistrationPage.fillInAddress1();
        checkOutAfterRegistrationPage.fillInPostalCode();
        checkOutAfterRegistrationPage.fillInBillingNewAddressPhoneNumber();

        checkOutAfterRegistrationPage.clickOnButtonContinueFromBillingAddress();

        checkOutAfterRegistrationPage.clickOnRadioButton2ndDayAir();

        checkOutAfterRegistrationPage.clickOnButtonContinueFromShippingMethod();

        checkOutAfterRegistrationPage.clickOnRadioButtonCreditCard();
        checkOutAfterRegistrationPage.clickOnButtonContinueFromPaymentMethod();

        checkOutAfterRegistrationPage.fillInCardHolderNameInputBox();
        checkOutAfterRegistrationPage.fillInCardNumberInputBox();
        checkOutAfterRegistrationPage.selectDropDownExpiryDateMonth();
        checkOutAfterRegistrationPage.selectDropDownExpiryDateYear();
        checkOutAfterRegistrationPage.fillInCardCodeInputBox();

        checkOutAfterRegistrationPage.clickOnButtonContinueFromPaymentInformation();


        String expectedTextOfCardMethod = "Credit Card";
    //    Assert.assertEquals(checkOutAfterRegistrationPage.verifyActualTextOfCardMethod(), expectedTextOfCardMethod, "Text of type of payment method not displayed");


        String expectedTextOfShippingMethod = "Next Day Air";
      //  Assert.assertEquals(checkOutAfterRegistrationPage.verifyActualTextOfShippingMethod(), expectedTextOfShippingMethod, "Text of shipping method not displayed");


        String expectedTotalFinalPrice = "$698.00";
       // Assert.assertEquals(checkOutAfterRegistrationPage.verifyActualTotalFinalPrice(), expectedTotalFinalPrice, "total final price not displayed");

      //  checkOutAfterRegistrationPage.clickOnButtonConfirm();

        String expectedPageTitleMessageAfterPayment = "Thank you";
        Assert.assertEquals(afterPaymentPage.verifyActualPageTitleMessageAfterPayment(), expectedPageTitleMessageAfterPayment, "after payment page title not displayed");


        String expectedOrderSuccessfulMessage = "Your order has been successfully processed!";
        Assert.assertEquals(afterPaymentPage.verifyActualOrderSuccessfulMessage(), expectedOrderSuccessfulMessage, "After payment successfull message not displayed");

        afterPaymentPage.clickOnButtonContinueFromAfterPaymentPage();


        String expectedTitleMessageOfHomePage = "Welcome to our store";
        Assert.assertEquals(homePage.actualTextOfWelcomeToOurStoreFromHomePage(), expectedTitleMessageOfHomePage, "home page welcome message not displayed");

        clickOnElement(By.xpath("//a[normalize-space()='Log out']"));
        Thread.sleep(2000);

        String actualCurrentUrl = getCurrentUrl();
        String expectedCurrentUrl = "https://demo.nopcommerce.com/";
        org.junit.Assert.assertEquals(expectedCurrentUrl, actualCurrentUrl);

    }

}*/
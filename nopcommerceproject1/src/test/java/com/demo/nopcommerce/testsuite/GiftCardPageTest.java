package com.demo.nopcommerce.testsuite;

import com.demo.nopcommerce.pages.GiftCardsPage;
import com.demo.nopcommerce.testbase.TestBase;
import org.testng.annotations.Test;

public class GiftCardPageTest extends TestBase {


    GiftCardsPage giftCardsPage= new GiftCardsPage();

    @Test
    public void clickOnMenuApparelLink(){
        giftCardsPage.getTitleTextFromGiftCardsPage();
    }
}

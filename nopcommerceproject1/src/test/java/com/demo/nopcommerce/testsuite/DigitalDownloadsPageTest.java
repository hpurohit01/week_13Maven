package com.demo.nopcommerce.testsuite;

import com.demo.nopcommerce.pages.DigitalDownloadsPage;
import com.demo.nopcommerce.testbase.TestBase;
import org.testng.annotations.Test;

public class DigitalDownloadsPageTest extends TestBase {

    DigitalDownloadsPage digitalDownloadsPage= new DigitalDownloadsPage();

    @Test

    public void clickOnMenuDigitalDownloadLink() {
        digitalDownloadsPage.getTitleTextFromDigitalDownloadsPage();




    }



}
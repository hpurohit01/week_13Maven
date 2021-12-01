package com.demo.nopcommerce.testsuite;

import com.demo.nopcommerce.pages.ApparelPage;
import com.demo.nopcommerce.testbase.TestBase;
import org.testng.annotations.Test;

public class ApparelPageTest extends TestBase {

    ApparelPage apparelPage= new ApparelPage();

    @Test
    public void clickOnMenuApparelLink(){
        apparelPage.getTitleTextFromApparelPage();
    }

}

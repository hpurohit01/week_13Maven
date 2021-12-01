package com.demo.nopcommerce.testsuite;

import com.demo.nopcommerce.pages.LoginPage;
import com.demo.nopcommerce.testbase.TestBase;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {

    LoginPage loginPage=new LoginPage();

    @Test

        public void clickOnLoginButton(){

        loginPage.clickOnLoginButton();

        }
        }






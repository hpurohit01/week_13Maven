package com.demo.nopcommerce.testsuite;

import com.demo.nopcommerce.pages.BooksPage;
import com.demo.nopcommerce.testbase.TestBase;
import org.testng.annotations.Test;

public class BooksPageTest extends TestBase {

    BooksPage booksPage = new BooksPage();

    @Test

    public void clickOnMenuBooksLink() {

        booksPage.getTitleTextFromBooksPage();
    }


}




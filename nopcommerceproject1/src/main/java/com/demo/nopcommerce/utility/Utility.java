package com.demo.nopcommerce.utility;

import com.demo.nopcommerce.drivermanager.DriverManager;
import com.google.common.base.Function;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.Random;


public class Utility extends DriverManager {


    // customized method to eliminate repetitive contents when declaring x-path using find element and clicking on it.

    /**
     * ********************************* Basic Elements handling methods ******************************
     */
    // * This method will click on element
    public void clickOnElement(By by) {
        WebElement loginLink = driver.findElement(by);
        loginLink.click();
    }

    //  * This method will get text from element
    public String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    //  * This method will send text on element
    public void sendTextToElement(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    // method to clear value
    public void clearValue(By by) {
        driver.findElement(by).clear();
    }

    /**
     * ********************************** Select Methods **********************************************
     */

    // dropdown selection- select by visible text
    public void selectByVisibleTextFromDropDown(By by, String text) {
        WebElement dropDown = driver.findElement(by);
        Select select = new Select(dropDown);
        select.selectByVisibleText(text);
    }

    // dropdown selection - select by value
    public void selectByValueFromDropDown(By by, String text) {
        WebElement dropDown = driver.findElement(by);
        Select select = new Select(dropDown);
        select.selectByValue(text);
    }

    // dropdown selection - select by index
    public void selectByIndexFromDropdown(By by, int index) {
        WebElement dropdown = driver.findElement(by);
        Select select = new Select(dropdown);
        select.selectByIndex(index);
    }

    /**
     * ********************************** Action Methods **********************************************
     */

    // mouse hover to element
    public void mouseHoverToElement(By by) {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(by)).build().perform();
    }

    // mouse hover to element and return target element
    public WebElement mouseHoverToElementAndReturnTargetWebElement(By by) {
        Actions actions = new Actions(driver);
        WebElement targetWebElement = driver.findElement(by);
        actions.moveToElement(targetWebElement).moveToElement(driver.findElement(by)).click().build().perform();
        return targetWebElement;
    }

    // method to mouse hover and click element
    public void mouseHoeverAndClickOnElement(By by) {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(by)).click().build().perform();
    }

    // mouse hover on destination 1 then moved to destination 2 and click on destination 2
    public void mouseHoverOnFirstThenSecondAndClick(By by1, By by2) {
        Actions hover = new Actions(driver);
        WebElement destination1 = driver.findElement(by1);
        WebElement destination2 = driver.findElement(by2);
        hover.moveToElement(destination1).moveToElement(destination2).click().build().perform();

    }

    // This method performs a Right Click Mouse Action at the current mouse location

    public void rightClick(By by) {
        Actions rightClick = new Actions(driver);
        WebElement a = driver.findElement(by);
        rightClick.contextClick().build().perform();
    }

    // Moves the slider from its current position to the desired position
    public void sliderMovement(By sliderBar, By sliderBox, int xAxis, int yAxis) {
        Actions moveSlider = new Actions(driver);
        WebElement mainSlider = driver.findElement(sliderBar);
        WebElement slider = driver.findElement(sliderBox);
        moveSlider.dragAndDropBy(slider, xAxis, yAxis).build().perform();
    }

    /**
     * ********************************** Alert Handling Methods *********************************************
     */
    // method to switch to alert and accept --> meaning click on 'ok' button
    public void switchToAlertAndAccept(By by) {
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    // this method will switch to alert and click on 'cancel' button
    public void switchToAlertAndDismiss() {
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
    }

    // this method will switch to alert and send keys (text in text (String) field --> within alert)
    public void sendTextToAlert(String text) {
        Alert alert = driver.switchTo().alert();
        alert.sendKeys(text);
    }

    // this methid will switch to alert and get text
    public String getTextFromAlert() {
        Alert alert = driver.switchTo().alert();
        return alert.getText();
    }

    /**
     * ****************************** Get URL methods ************************************************
     */
    // method to get current URL
    public String getCurrentUrl() {
        String currentUrl = driver.getCurrentUrl();
        return currentUrl;
    }


     // *************************** OTHER methods ****************************************************



    // random email generator
    public String randomEmailGenerator() {
        String chars = "abcdefghijklmnopqrstuvwxyz1234567890";
        StringBuilder email = new StringBuilder();
        Random randomEmail = new Random();
        while (email.length() < 10) {
            int index = (int) (randomEmail.nextFloat() * chars.length());
            email.append(chars.charAt(index));
        }
        String saltStr = (email.toString() + "@gmail.com");
        return saltStr;
    }

    /**
     * ***************************** Wait Methods ***************************************************
     */

    // returning web element so return type is webelement
    public WebElement waitUntilVisibilityOfElementLocated(By by, int time) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    // wait before click on element --> wait until visibility of web element
    public void waitUntilVisibilityOfElementLocatedAndthenClickOnElement(By by, int time) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        waitUntilVisibilityOfElementLocated(by, time).click(); // will use wait until visibility of element located method mentioned above and then click
    }

    // wait before click on element --> wait until visibility of web element
    public void waitUntilVisibilityOfElementToBeClickableAndthenClickOnElement(By by, int time) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.elementToBeClickable(by)).click();
    }

    // wait for element with Fluent Wait
    public WebElement waitForElementWithFluentWait(By by, int time, int pollingTime) {
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(time))
                .pollingEvery(Duration.ofSeconds(pollingTime))
                .ignoring(NoSuchElementException.class);

        WebElement element = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(by);
            }
        });
        return element;
    }

    // the expected condition waits for an element to be clickable i.e. it should be present/displayed/visible on the screen as well as enabled
    public WebElement waitUntilElementToBeClickable(By by, int time) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        return wait.until(ExpectedConditions.elementToBeClickable(by));
    }

}
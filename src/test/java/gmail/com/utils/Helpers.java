package gmail.com.utils;

import gmail.com.tests.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Helpers {

    public static void waitForElementVisibility(By locator) {
        new WebDriverWait(BaseTest.getWebDriverInstance(), 30).until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static void waitForElementToBeClickable(By locator) {
        new WebDriverWait(BaseTest.getWebDriverInstance(), 30).until(ExpectedConditions.elementToBeClickable(locator));
    }

    public static void waitForMessage(By locator) {
        new WebDriverWait(BaseTest.getWebDriverInstance(), 10).until(webDriver -> {
            return BaseTest.getWebDriverInstance().findElement(locator).getText().equals("Message sent.");
        });
    }
}
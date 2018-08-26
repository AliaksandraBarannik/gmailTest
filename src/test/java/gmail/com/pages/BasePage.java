package gmail.com.pages;

import gmail.com.tests.BaseTest;
import gmail.com.utils.Helpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class BasePage {
    private final By lastMessage = By.cssSelector("div.UI tr");
    private final By writeEmailButton = By.cssSelector("div.aic div div");

    protected WebDriver driver;

    public BasePage() {
        this.driver = BaseTest.getWebDriverInstance();
    }

    public NewMessageWindow createMessage() {
        driver.findElement(writeEmailButton).click();
        return new NewMessageWindow();
    }

    public void openMessage() {
        Helpers.waitForElementToBeClickable(lastMessage);
        driver.findElement(lastMessage).click();
    }

}

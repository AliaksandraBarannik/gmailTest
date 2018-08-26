package gmail.com.pages;

import gmail.com.utils.Helpers;
import org.openqa.selenium.By;

public class PasswordPage extends BasePage {

    private final By passwordField = By.xpath("//input[@name='password']");
    private final By nextButton = By.id("passwordNext");

    public PasswordPage() {
        super();
    }

    public void inputPasswordField(String password) {
        Helpers.waitForElementVisibility(passwordField);
        driver.findElement(passwordField).clear();
        driver.findElement(passwordField).sendKeys(password);
    }

    public InboxPage clickNextButton() {
        driver.findElement(nextButton).click();
        return new InboxPage();
    }
}

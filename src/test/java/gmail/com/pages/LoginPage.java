package gmail.com.pages;

import gmail.com.utils.Helpers;
import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    private final By loginField = By.id("identifierId");
    private final By nextButton = By.id("identifierNext");

    public LoginPage() {
        super();
    }

    public void inputLoginField(String eMail) {
        Helpers.waitForElementVisibility(loginField);
        driver.findElement(loginField).clear();
        driver.findElement(loginField).sendKeys(eMail);
    }

    public PasswordPage clickNextButton() {
        driver.findElement(nextButton).click();
        return new PasswordPage();
    }
}

package gmail.com.pages;

import gmail.com.utils.Helpers;
import org.openqa.selenium.By;

public class InboxPage extends BasePage {

    private final By messageBody = By.cssSelector("div.gs div[dir=\"ltr\"]");

    public InboxPage() {
        super();
    }

    public String getMessageBody() {
        Helpers.waitForElementVisibility(messageBody);
        return driver.findElement(messageBody).getText();
    }
}

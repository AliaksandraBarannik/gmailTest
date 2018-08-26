package gmail.com.pages;

import gmail.com.utils.Helpers;
import org.openqa.selenium.By;

public class NewMessageWindow extends BasePage {

    private final By receiverField = By.name("to");
    private final By headerField = By.name("subjectbox");
    private final By inputTextOfEmailField = By.cssSelector("div[aria-label='Message Body']");
    private final By sendButton = By.cssSelector("tr.btC div[role='button']");
    private final By messageSent = By.cssSelector("span.bAq");

    public NewMessageWindow() {
        super();
    }

    public void inputReceiver(String receiverEmail) {
        Helpers.waitForElementVisibility(receiverField);
        driver.findElement(receiverField).clear();
        driver.findElement(receiverField).sendKeys(receiverEmail);
    }

    public void inputHeader(String headerOfAMessage) {
        Helpers.waitForElementVisibility(headerField);
        driver.findElement(headerField).clear();
        driver.findElement(headerField).sendKeys(headerOfAMessage);
    }

    public void inputTextEmail(String textOfAMessage) {
        driver.findElement(inputTextOfEmailField).clear();
        driver.findElement(inputTextOfEmailField).sendKeys(textOfAMessage);
    }

    public InboxPage sendEmail() {
        Helpers.waitForElementToBeClickable(sendButton);
        driver.findElement(sendButton).click();
        return new InboxPage();
    }

    public void waitForMessageToBeSent() {
        Helpers.waitForMessage(messageSent);
    }

    public InboxPage openInboxPage() {
        return new InboxPage();
    }

}

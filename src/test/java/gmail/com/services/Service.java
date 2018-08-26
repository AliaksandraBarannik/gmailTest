package gmail.com.services;

import gmail.com.businessObjects.User;
import gmail.com.pages.*;

public class Service {

    NewMessageWindow newMessagePage;
    InboxPage inboxPage;
    LoginPage loginPage;
    BasePage basePage;
    PasswordPage passwordPage;

    public void login(User user) {
        basePage = new BasePage();
        loginPage = new LoginPage();
        loginPage.inputLoginField(user.getLogin());
        passwordPage = loginPage.clickNextButton();
        passwordPage.inputPasswordField(user.getPassword());
        inboxPage = passwordPage.clickNextButton();
    }

    public void createNewMessage(String receiver, String header, String textOfMessage) {
        newMessagePage = inboxPage.createMessage();
        newMessagePage.inputReceiver(receiver);
        newMessagePage.inputHeader(header);
        newMessagePage.inputTextEmail(textOfMessage);
    }

    public void sendMessage() {
        newMessagePage.sendEmail();
    }

    public boolean waitForMessageToBeSent() {
        newMessagePage.waitForMessageToBeSent();
        newMessagePage.openInboxPage();
        return true;
    }

    public void openMessage() {
        basePage.openMessage();
    }

    public String getMessageBody() {
        return inboxPage.getMessageBody();
    }
}

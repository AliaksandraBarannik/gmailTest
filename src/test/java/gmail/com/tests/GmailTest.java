package gmail.com.tests;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class GmailTest extends BaseTest {

    @Test
    public void testEmailWasDelivered() {
        service.createNewMessage(receiverOfEmail, headerOfMessage, textOfMessage);
        service.sendMessage();
        assert (service.waitForMessageToBeSent());
        service.openMessage();
        assertThat(service.getMessageBody(), Matchers.equalTo("Hello world!"));
    }
}


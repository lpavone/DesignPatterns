package ChainOfResponsability;

import org.junit.Test;

/**
 * Created by leonardo on 15/11/17.
 */
public class ChainTest {

    @Test
    public void test(){
        ChainHandlerBuilder emailHandler = new ChainHandlerBuilder();
        emailHandler.handleRequest(new EmailRequest(EmailType.SPAM, "Win the lotto!"));
        emailHandler.handleRequest(new EmailRequest(EmailType.COMPLAINT, "Complaint number 324333"));
        emailHandler.handleRequest(new EmailRequest(EmailType.USER_CREATION, "User lpavone has been created"));
    }
}

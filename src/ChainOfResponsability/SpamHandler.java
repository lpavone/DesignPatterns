package ChainOfResponsability;

/**
 * Spam email's handler.
 * Created by leonardo on 15/11/17.
 */
public class SpamHandler extends EmailRequestHandler {

    public SpamHandler(EmailRequestHandler handler) {
        super(handler);
    }

    @Override
    public void handleRequest(EmailRequest emailRequest) {
        if (emailRequest.getEmailType().equals(EmailType.SPAM)) {
            printHandling(emailRequest);
            emailRequest.markHandled();
        } else {
            super.handleRequest(emailRequest);
        }
    }

    @Override
    protected void printHandling(EmailRequest emailRequest) {
        super.printHandling(emailRequest);
    }

    @Override
    public String toString() {
        return "Spam Handler";
    }
}

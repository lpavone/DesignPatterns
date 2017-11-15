package ChainOfResponsability;

/**
 * Complaint emails handler.
 * Created by leonardo on 15/11/17.
 */
public class ComplaintHandler extends EmailRequestHandler {

    public ComplaintHandler(EmailRequestHandler handler) {
        super(handler);
    }

    @Override
    public void handleRequest(EmailRequest emailRequest) {
        if (emailRequest.getEmailType().equals(EmailType.COMPLAINT)) {
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
        return "Complaint Handler";
    }
}

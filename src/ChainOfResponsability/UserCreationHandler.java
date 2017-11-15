package ChainOfResponsability;

/**
 * User creation emails handler.
 * Created by leonardo on 15/11/17.
 */
public class UserCreationHandler extends EmailRequestHandler {

    public UserCreationHandler(EmailRequestHandler handler) {
        super(handler);
    }

    @Override
    public void handleRequest(EmailRequest emailRequest) {
        if (emailRequest.getEmailType().equals(EmailType.USER_CREATION)) {
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
        return "User Creation";
    }
}

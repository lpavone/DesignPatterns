package ChainOfResponsability;

/**
 * Request handler hierarchy
 * Created by leonardo on 15/11/17.
 */
public abstract class EmailRequestHandler {

    private EmailRequestHandler next;

    public EmailRequestHandler(EmailRequestHandler next) {
        this.next = next;
    }

    public void handleRequest(EmailRequest emailRequest) {
        if (next != null) {
            next.handleRequest(emailRequest);
        }
    }

    protected void printHandling(EmailRequest emailRequest) {
        System.out.println(this + " handling request: " + emailRequest);
    }

    @Override
    public abstract String toString();
}

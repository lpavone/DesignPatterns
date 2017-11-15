package ChainOfResponsability;

/**
 * Create the chain.
 * Created by leonardo on 15/11/17.
 */
public class ChainHandlerBuilder {

    EmailRequestHandler chain;

    public ChainHandlerBuilder() {
        buildChain();
    }

    private void buildChain() {
        chain = new SpamHandler(
                    new ComplaintHandler(
                        new UserCreationHandler(null)));
    }

    public void handleRequest(EmailRequest req) {
        chain.handleRequest(req);
    }
}
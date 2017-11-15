package ChainOfResponsability;

import java.util.Objects;

/**
 * Email requests to be handled.
 *
 * Created by leonardo on 15/11/17.
 */
public class EmailRequest {

    private final EmailType emailType;
    private final String content;
    private boolean handled;

    public EmailRequest(final EmailType emailType, final String content) {
        this.emailType = Objects.requireNonNull(emailType);
        this.content = Objects.requireNonNull(content);
    }

    public String getContent() {
        return content;
    }

    public EmailType getEmailType() {
        return emailType;
    }

    public void markHandled() {
        this.handled = true;
    }

    public boolean isHandled() {
        return this.handled;
    }

    @Override
    public String toString() {
        return getContent();
    }
}
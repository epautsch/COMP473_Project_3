package ObserverPattern;

/* This class is an immutable state class for messages between the concrete Subject and Observers */

public class Message {

    final String messageContent;

    public Message (String m) {
        messageContent = m;
    }

    public String getMessage() {
        return messageContent;
    }
}

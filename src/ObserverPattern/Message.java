package ObserverPattern;

public class Message {

    final String messageContent;

    public Message (String m) {
        messageContent = m;
    }

    public String getMessage() {
        return messageContent;
    }
}

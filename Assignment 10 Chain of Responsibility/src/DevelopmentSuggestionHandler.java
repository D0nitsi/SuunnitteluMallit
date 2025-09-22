public class DevelopmentSuggestionHandler extends Handler {
    @Override
    public void handle(Message message) {
        if (message.getType() == MessageType.DEVELOPMENT_SUGGESTION) {
            System.out.println("Development suggestion logged: " + message.getContent());
        } else if (next != null) {
            next.handle(message);
        }
    }
}

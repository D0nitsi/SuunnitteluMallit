public class GeneralFeedbackHandler extends Handler {
    @Override
    public void handle(Message message) {
        if (message.getType() == MessageType.GENERAL_FEEDBACK) {
            System.out.println("General feedback analyzed: " + message.getContent());
        } else if (next != null) {
            next.handle(message);
        }
    }
}

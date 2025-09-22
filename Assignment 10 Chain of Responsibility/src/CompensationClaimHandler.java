public class CompensationClaimHandler extends Handler {
    @Override
    public void handle(Message message) {
        if (message.getType() == MessageType.COMPENSATION_CLAIM) {
            System.out.println("Compensation claim reviewed: " + message.getContent());
        } else if (next != null) {
            next.handle(message);
        }
    }
}

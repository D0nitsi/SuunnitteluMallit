public class ContactRequestHandler extends Handler {
    @Override
    public void handle(Message message) {
        if (message.getType() == MessageType.CONTACT_REQUEST) {
            System.out.println("Contact request forwarded: " + message.getContent());
        } else if (next != null) {
            next.handle(message);
        }
    }
}

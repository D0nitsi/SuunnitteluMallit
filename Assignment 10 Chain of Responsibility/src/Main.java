public class Main {
    public static void main(String[] args) {
        Handler compensationHandler = new CompensationClaimHandler();
        Handler contactHandler = new ContactRequestHandler();
        Handler suggestionHandler = new DevelopmentSuggestionHandler();
        Handler feedbackHandler = new GeneralFeedbackHandler();

        compensationHandler.setNext(contactHandler);
        contactHandler.setNext(suggestionHandler);
        suggestionHandler.setNext(feedbackHandler);

        Message[] messages = {
                new Message(MessageType.COMPENSATION_CLAIM, "Requesting refund for damaged product.", "alice@example.com"),
                new Message(MessageType.CONTACT_REQUEST, "Please call me regarding my order.", "bob@example.com"),
                new Message(MessageType.DEVELOPMENT_SUGGESTION, "Add dark mode to the app.", "carol@example.com"),
                new Message(MessageType.GENERAL_FEEDBACK, "Great service!", "dave@example.com")
        };

        for (Message msg : messages) {
            compensationHandler.handle(msg);
        }
    }
}

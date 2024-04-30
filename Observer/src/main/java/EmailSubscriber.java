public class EmailSubscriber implements Subscriber {

    private String email;

    public EmailSubscriber(String email) {
        this.email = email;
    }

    @Override
    public void update(String eventType, String message) {
        System.out.println("Email to: " + email 
                + "\n We're glad to send you the invitation to our " + eventType 
                + " and we send you this notification to inform you that " + message);
    }
}

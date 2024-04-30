public class Main {
    public static void main(String[] args) {
        
        EventManager eventManager = new EventManager("newsletter");
        
        eventManager.subscribe("newsletter", new EmailSubscriber("example@mail.com"));
        
        eventManager.notify("newsletter", "there's a new issue!");
    }
}

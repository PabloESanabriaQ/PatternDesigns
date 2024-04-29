public class BasketPlayer implements Player {
    
    String name;
    
    public BasketPlayer() {
        
    }
    
    public BasketPlayer(String name) {
        this.name = name;
    }
    @Override
    public String getPlayerName() {
        return this.name;
    }
}

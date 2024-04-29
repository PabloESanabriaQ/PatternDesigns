public class PlayerFactory extends Factory {
    
    @Override
    public Player createPlayer(String sport, String name) {
        if(sport.equals("basketball")) return new BasketPlayer(name);
        return new FootballPlayer(name);
    }
}

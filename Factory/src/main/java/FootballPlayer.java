public class FootballPlayer implements Player{
    
    private String name;

    public FootballPlayer(){
        
    }

    public FootballPlayer(String name){
        this.name = name;
    }
    @Override
    public String getPlayerName() {
        return this.name;
    }
}

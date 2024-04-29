public class Main {

    public static void main(String[] args) {
        Factory pepito = new PlayerFactory();
        Player laArania;
        Player theGoat;
        
        laArania = pepito.createPlayer("football", "Julian Alvarez");
        theGoat = pepito.createPlayer("basketball", "Michael Jordan");

        System.out.println(laArania.getPlayerName());
        System.out.println(laArania);
        System.out.println(laArania);

        System.out.println(theGoat.getPlayerName());
        System.out.println(theGoat);
    }
}

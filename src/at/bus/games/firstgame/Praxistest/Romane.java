package at.bus.games.firstgame.Praxistest;

public class Romane extends AbstractBooks {
    private int id;
    private String Titel;
    private int Preis;
    private String Description;
    public String Genre;

    public Romane(int id, String titel, int preis, String description) {
        super(id, titel, preis, description);
    }
}

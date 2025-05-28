package at.bus.games.firstgame.Praxistest;

public class Audiobooks extends AbstractBooks {
    private int id;
    private String Titel;
    private int Preis;
    private String Beschreibung;

    public Audiobooks(int id, String titel, int preis, String description) {
        super(id, titel, preis, description);
    }

    public void playSample() {
        System.out.println("hfjhdjfhjd");
    }
}
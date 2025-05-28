package at.bus.games.firstgame.Praxistest;

public class AbstractBooks implements Books {
    private int id;
    private String Titel;
    private int Preis;
    private String Description;


    public AbstractBooks(int id, String titel, int preis, String description) {
        this.id = id;
        Titel = titel;
        Preis = preis;
        Description = description;
    }

    @Override
    public int getid() {
        return this.id;
    }

    @Override
    public String getTitel() {
        return this.Titel;
    }

    @Override
    public int getPreis() {
        return this.Preis;
    }

    @Override
    public String getDescription() {
        return this.Description;
    }
}

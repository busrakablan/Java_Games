package at.bus.games.firstgame.Products;

public class Shoe implements Product{
    private int ID;
    private int Price;
    private String Title;
    private String Description;

    @Override
    public int getID() {
        return this.ID;
    }

    @Override
    public int getPrice() {
        return this.Price;
    }

    @Override
    public String getTitle() {
        return this.Title;
    }

    @Override
    public String getDescription() {
        return this.Description;
    }
}

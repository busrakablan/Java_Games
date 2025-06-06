package at.bus.games.firstgame.Products;

public class Phone implements Product{
    private int ID;
    private int Price;
    private String Title;
    private String Description;

    public Phone(int ID, String title) {
        this.ID = ID;
        Title = title;
    }

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

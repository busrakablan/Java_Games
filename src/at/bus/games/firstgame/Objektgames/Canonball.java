package at.bus.games.firstgame.Objektgames;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class Canonball implements Actor{
    private float x,y;

    public Canonball(float x, float y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void render(Graphics graphics) {
        graphics.fillOval(this.x,this.y,10,10);
    }

    @Override
    public void update(GameContainer gameContainer, int delta) {
    this.y--;
    }
}

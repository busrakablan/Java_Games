package at.bus.games.firstgame.Snowworld;

import org.newdawn.slick.Graphics;

public interface Actor {
    public void render(Graphics graphics);

    public void update(int delta);
}

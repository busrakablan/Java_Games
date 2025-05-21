package at.bus.games.firstgame.Objektgames;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public interface Actor {
    public void render(Graphics graphics);


    void update(GameContainer gameContainer, int delta);
}

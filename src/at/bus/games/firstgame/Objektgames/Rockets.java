package at.bus.games.firstgame.Objektgames;

import org.newdawn.slick.*;

public class Rockets implements Actor {
    private Image rocketImage;
    private float x,y;

    public Rockets() throws SlickException {
        Image tmp = new Image("testdata/rocket.jpg");
        this.rocketImage = tmp.getScaledCopy(50,50);
        this.x = 100;
        this.y = 100;

    }

    @Override
    public void render(Graphics graphics) {
       rocketImage.draw(this.x,this.y);
    }

    @Override
    public void update(int delta) {

    }

    @Override
    public void update(GameContainer gameContainer, int delta) {
        if (gameContainer.getInput().isKeyDown(Input.KEY_RIGHT)) {
            this.x++;
        }

        if (gameContainer.getInput().isKeyDown(Input.KEY_LEFT)) {
            this.x--;
        }
    }
}

//4:37
package at.bus.games.firstgame.Aufgabe1;

import org.newdawn.slick.Graphics;

public class Rectangle implements Actor {
    private enum DIRECTION {RIGHT, DOWN, LEFT, UP};
    private float x;
    private float y;
    private float speed;
    private boolean isFlyingToTheRight = true;




    public Rectangle(int x, int y, float speed) {
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.isFlyingToTheRight=isFlyingToTheRight;
    }

    public void render(Graphics graphics) {
        graphics.drawRect(this.x,this.y,10,10);
    }

    public void update(int delta){
        if (isFlyingToTheRight) {
            this.x -= (float) delta / this.speed;
        } else {
            this.x += (float) delta / this.speed;
        }

        if (this.x > 600) {
            this.x = 0;
        }
    }
}


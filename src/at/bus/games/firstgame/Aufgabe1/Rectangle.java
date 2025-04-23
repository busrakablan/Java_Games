package at.bus.games.firstgame.Aufgabe1;

import org.newdawn.slick.Graphics;

public class Rectangle implements Actor {
    private enum DIRECTION {RIGHT, DOWN, LEFT, UP};
    private float x;
    private float y;
    private float speed;
    private boolean leftToRight;


    public Rectangle(int x, int y, float speed) {
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.leftToRight= leftToRight;
    }

    public void render(Graphics graphics) {
        graphics.drawRect(this.x,this.y,10,10);
    }

    public void update(int delta){
        this.x += (float)delta/this.speed;
        if(this.x>600) {
            this.x = 0;
        }

        if (leftToRight) {
            x += delta / (float) speed;
            if (x > 800) x = -10;
        } else {
            x -= delta / (float) speed;
            if (x < -10) x = 800;
        }

    }
}


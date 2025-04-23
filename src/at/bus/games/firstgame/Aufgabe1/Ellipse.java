package at.bus.games.firstgame.Aufgabe1;

import org.newdawn.slick.Graphics;

public class Ellipse implements Actor {
    private float x, y;
    private float speed;

    public Ellipse(int x, int y) {
        this.x = x;
        this.y = y;
        this.speed = 5;
    }

    public void render(Graphics graphics) {
        graphics.drawOval(this.x, this.y, 50, 10);
    }

    public void update(int delta) {
        this.y += (float) delta / this.speed;
        this.x += (float) delta / this.speed;
    }
}





package at.bus.games.firstgame.Objektgames;

import org.newdawn.slick.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;



public class ObjektsGame extends BasicGame {
    private List<Actor> actors;
    private Rockets rockets;
    private Rectangle rectangle2;


    public ObjektsGame(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.actors = new ArrayList<>();
        Random random = new Random();

        Rockets rocket = new Rockets();
        this.rockets = rockets;
        this.actors.add(rocket);

        for (int i = 0; i < 100; i++) {
            Rectangle rectangle = new Rectangle(random.nextInt(600), random.nextInt(600), random.nextInt(50));
            this.actors.add(rectangle);
        }

        for (int i = 0; i < 50; i++) {
            Circle circle = new Circle();
            this.actors.add(circle);

        }

        for (int i = 0; i < 5; i++) {
            Ellipse ellipse = new Ellipse(random.nextInt(800), random.nextInt(600));
            this.actors.add(ellipse);
        }




    }


    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        for (Actor actor : this.actors) {
            actor.update(gameContainer,delta);

        }



    }


    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        for (Actor actor : this.actors) {
            actor.render(graphics);

        }

    }

    @Override
    public void keyPressed(int key, char c) {
        System.out.println(key);
        if (key ==Input.KEY_SPACE){
            Canonball cb = new Canonball(this.rockets.getX(), this.rockets.getY());
            this.actors.add(cb);
        }

    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new at.bus.games.firstgame.Objektgames.ObjektsGame("Objektsgame"));
            container.setDisplayMode(800, 600, false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}









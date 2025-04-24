package at.bus.games.firstgame.Aufgabe1;

import org.newdawn.slick.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


    public class Games extends BasicGame {
        private List<at.bus.games.firstgame.Aufgabe1.Actor> actors;
        private at.bus.games.firstgame.Aufgabe1.Rectangle rectangle2;
        private double diameter;




        public Games(String title) {
            super(title);
        }

        @Override
        public void init(GameContainer gameContainer) throws SlickException {
            this.actors = new ArrayList<>();
            Random random = new Random();
            for (int i = 0; i < 10; i++) {
                at.bus.games.firstgame.Aufgabe1.Rectangle rectangle = new Rectangle(random.nextInt(600), random.nextInt(600), random.nextInt(50));
                this.actors.add(rectangle);
            }

            for (int i = 0; i < 10; i++) {
                at.bus.games.firstgame.Aufgabe1.Circle circle = new Circle();
                this.actors.add(circle);

            }

            for (int i = 0; i < 10; i++) {
                at.bus.games.firstgame.Aufgabe1.Ellipse ellipse = new Ellipse(random.nextInt(800), random.nextInt(600));
                this.actors.add(ellipse);
            }
        }

        @Override
        public void update(GameContainer gameContainer, int delta) throws SlickException {


            for (at.bus.games.firstgame.Aufgabe1.Actor actor : this.actors) {
                actor.update(delta);

            }



        }

        @Override
        public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
            for (Actor actor : this.actors) {
                actor.render(graphics);

            }

        }

        public static void main(String[] argv) {
            try {
                AppGameContainer container = new AppGameContainer(new at.bus.games.firstgame.Aufgabe1.Games("Games"));
                container.setDisplayMode(800, 600, false);
                container.start();
            } catch (SlickException e) {
                e.printStackTrace();
            }
        }
    }



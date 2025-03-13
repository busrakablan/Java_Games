package at.bus.games.firstgame;

import org.newdawn.slick.*;

public class Objekts extends BasicGame {
        private float x;
        private float y;
        private float speed;
        public void Rectangles(String title) {

        }

    public Objekts(String title) {
        super(title);
    }

    @Override
        public void init(GameContainer gameContainer) throws SlickException {
            this.x = 100;
            this.y= 100;
            this.speed=50.0f;

        }

        @Override
        public void update(GameContainer gameContainer, int delta) throws SlickException {


            this.x-=(float)delta/this.speed;
            this.y-=(float)delta/this.speed;

            if(this.x<0) this.x = 800;
            if(this.y<0) this.y = 600;
        }

        @Override
        public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
            graphics.drawRect(this.x,this.y,100,100);
            graphics.drawString("Hello you!",50,50);
            graphics.drawOval(500,100,50,25);
            graphics.drawOval(100,this.y,100,100);
        }



        public static void main(String[] argv) {
            try {
                AppGameContainer container = new AppGameContainer(new at.bus.games.firstgame.Rectangles("Objekts"));
                container.setDisplayMode(800,600,false);
                container.start();
            } catch (SlickException e) {
                e.printStackTrace();
            }
        }
    }


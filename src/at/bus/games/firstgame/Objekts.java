package at.bus.games.firstgame;

import org.newdawn.slick.*;

public class Objekts extends BasicGame {
        private float x;
        private float y;
        private float speedX;
        private float speedY;
        private float x1;
        private float y1;
        private float speedX1;
        private float speedY1;
        private float x2;
        private float y2;
        private float speed2;
        public void Rectangles(String title) {

        }

    public Objekts(String title) {
        super(title);
    }

    @Override
        public void init(GameContainer gameContainer) throws SlickException {
            this.x = 100;
            this.y= 100;
            this.speedX=5.0f;
            this.speedY = 5.0f;

            this.x1 = 400;
            this.y1=100;
            this.speedX1=3.0f;
            this.speedY1 = 3.0f;

        }

        @Override
        public void update(GameContainer gameContainer, int delta) throws SlickException {

            if (this.x < 600 && this.y == 100) {
                this.x += (float) delta / this.speedX;
            }
            else if (this.x >= 600 && this.y < 400) {
                this.y += (float) delta / this.speedY;
            }
            else if (this.y >= 400 && this.x > 100) {
                this.x -= (float) delta / this.speedX;
            }
            else if (this.x <= 100 && this.y > 100) {
                this.y -= (float) delta / this.speedY;
            }


            if (this.x <= 100 && this.y <= 100) {
                this.x = 100;
                this.y = 100;
            }



            this.x1 -= (float) delta / this.speedX1;
            if (this.x1 <= 100) {
                this.x1 = 400;
            }
        }

        @Override
        public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
            graphics.drawRect(this.x,this.y,100,100);
            graphics.drawString("Hello you!",50,50);
            graphics.drawOval(this.x1,this.y1,50,25);
            graphics.drawOval(100,this.y,100,100);
        }



        public static void main(String[] argv) {
            try {
                AppGameContainer container = new AppGameContainer(new at.bus.games.firstgame.Objekts("Objekts"));
                container.setDisplayMode(800,600,false);
                container.start();
            } catch (SlickException e) {
                e.printStackTrace();
            }
        }
    }


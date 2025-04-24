package at.bus.games.firstgame.Snowworld;

import java.util.Random;

public class Snowflake implements Actor{
    public enum SIZE {BIG,SMALL,MEDIUM};
    private float x,y;
    private int size;
    private int speed;
    private Random random;


    public Snowflake(SIZE size) {
        this.random = new Random();
        if(size==SIZE.BIG){
            this.size=12;
            this.speed=2;
        }

        if(size==SIZE.MEDIUM){
            this.size=8;
            this.speed=5;
        }

        if(size==SIZE.MEDIUM){
            this.size=4;
            this.speed=10;
        }

        setRandomPosition();
    }
}

//1.09 Video 2
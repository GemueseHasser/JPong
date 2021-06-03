package de.jonas.jpong.object;

import de.jonas.JPong;
import de.jonas.jpong.Entity;
import de.jonas.jpong.constant.RacketType;
import de.jonas.jpong.gui.JPongGUI;

import java.util.Timer;
import java.util.TimerTask;

public final class Ball extends Entity {


    private static final int SIZE = 20;


    private int directionX = 1;
    private int directionY = 1;

    public Ball() {
        super(SIZE, SIZE);
    }

    public void startMoving() {
        final Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                updateDirection();

                final int x = Ball.super.getX();
                final int y = Ball.super.getY();

                Ball.super.setX(x + directionX);
                Ball.super.setY(y + directionY);
            }
        }, 0, 50);
    }

    private void updateDirection() {
        final int x = super.getX();
        final int y = super.getY();

        final Racket player = JPong.JPONG.getPlayerRacket();
        final Racket computer = JPong.JPONG.getComputerRacket();

        if (x < player.getX() + super.getWidth() + 15) {
            if (y > player.getY() && y < player.getY() + player.getHeight()) {
                directionX = 1;
            } else {
                System.out.println("lose");
            }
        }

        if (x > computer.getX() - super.getWidth()) {
            if (y > computer.getY() && y < computer.getY() + computer.getHeight()) {
                directionX = -1;
            } else {
                System.out.println("win");
            }
        }

        if (y < 1) {
            directionY = 1;
        }

        if (y > JPongGUI.WINDOW_TYPE.getHeight() - super.getHeight() * 3) {
            directionY = -1;
        }
    }

}

package de.jonas.jpong.object;

import de.jonas.jpong.Entity;
import de.jonas.jpong.constant.RacketType;
import lombok.Getter;
import org.jetbrains.annotations.NotNull;

public final class Racket extends Entity {

    private static final int WIDTH = 30;
    private static final int HEIGHT = 150;


    @Getter
    private int points;


    public Racket(@NotNull final RacketType type) {
        super(WIDTH, HEIGHT);

        super.setX(type.getX());
        super.setY(type.getStartPositionY());
    }


    public void incrementPoints() {
        this.points++;
    }

}

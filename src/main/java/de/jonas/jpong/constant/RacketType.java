package de.jonas.jpong.constant;

import lombok.Getter;
import org.jetbrains.annotations.Range;

public enum RacketType {

    PLAYER(
        50
    ),
    COMPUTER(
        620
    );


    private static final int START_POSITION_Y = 150;


    @Getter
    private final int x;
    @Getter
    private final int startPositionY;


    RacketType(
        @Range(from = 0, to = Integer.MAX_VALUE) final int x
    ) {
        this.x = x;
        this.startPositionY = START_POSITION_Y;
    }

}

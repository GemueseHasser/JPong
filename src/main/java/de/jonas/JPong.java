package de.jonas;

import de.jonas.jpong.constant.RacketType;
import de.jonas.jpong.gui.JPongGUI;
import de.jonas.jpong.object.Racket;
import lombok.Getter;

public class JPong {

    public static final JPong JPONG = new JPong();

    @Getter
    private Racket playerRacket;
    @Getter
    private Racket computerRacket;

    public static void main(String[] args) {
        final Racket playerRacket = new Racket(RacketType.PLAYER);
        final Racket computerRacket = new Racket(RacketType.COMPUTER);

        JPONG.playerRacket = playerRacket;
        JPONG.computerRacket = computerRacket;

        final JPongGUI gui = new JPongGUI();
        gui.open();
    }

}

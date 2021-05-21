package de.jonas.jpong.gui;

import de.jonas.JPong;
import de.jonas.japplication.graphics.GUI;
import de.jonas.japplication.graphics.WindowType;
import org.jetbrains.annotations.NotNull;

import java.awt.Color;
import java.awt.Graphics;

public final class JPongGUI extends GUI {


    private static final String TITLE = "JPong";
    private static final int WIDTH = 700;
    private static final int HEIGHT = 499;

    private static final WindowType WINDOW_TYPE = new WindowType(
        TITLE,
        WIDTH,
        HEIGHT,
        true,
        true
    );

    private static final int NET_PART_SIZE = 15;
    private static final int NET_PART_MARGIN = 10;
    private static final int NET_PART_AMOUNT = 19;
    private static final int NET_MARGIN_LEFT = 340;


    public JPongGUI() {
        super(WINDOW_TYPE);
    }


    @Override
    protected void draw(@NotNull final Graphics graphics) {
        // draw background
        graphics.fillRect(0, 0, WIDTH, HEIGHT);

        // draw net
        graphics.setColor(Color.WHITE);
        for (int i = 0; i < NET_PART_AMOUNT; i++) {
            final int marginTop = i * (NET_PART_SIZE + NET_PART_MARGIN);
            graphics.fillRect(NET_MARGIN_LEFT, marginTop, NET_PART_SIZE, NET_PART_SIZE);
        }

        // draw rackets
        JPong.JPONG.getPlayerRacket().draw(graphics);
        JPong.JPONG.getComputerRacket().draw(graphics);
    }
}

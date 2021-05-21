package de.jonas.jpong;

import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Range;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Entity {

    @Getter
    private final int width;
    @Getter
    private final int height;

    @Getter
    @Setter
    private int x;

    @Getter
    @Setter
    private int y;


    public Entity(
        @Range(from = 0, to = Integer.MAX_VALUE) final int width,
        @Range(from = 0, to = Integer.MAX_VALUE) final int height
    ) {
        this.width = width;
        this.height = height;
    }

    public void draw(@NotNull final Graphics graphics) {
        graphics.setColor(Color.WHITE);
        graphics.fillRect(this.x, this.y, this.width, this.height);
    }

    public abstract void move();

}

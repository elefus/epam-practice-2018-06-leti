package com.etu.game.model;

import java.util.Scanner;

public class CheckPoint {

    private Point position;
    private boolean checked = false;

    public CheckPoint(Point position) {
        this(position, false);
    }

    private CheckPoint(Point position, boolean checked) {
        this.checked = checked;
        this.position = position;
    }

    public static CheckPoint restore(Scanner input) {
        Point point = Point.restore(input);
        boolean checked = input.nextBoolean();
        return new CheckPoint(point, checked);
    }

    public Point getPosition() {
        return position;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }
}

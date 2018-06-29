package com.etu.game.model;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Model {

    private Field field;
    private CheckPoint finish;
    private Point ball;
    private Set<CheckPoint> bonuses;

    private Model(Field field, CheckPoint finish, Point ball, Set<CheckPoint> bonuses) {
        this.field = field;
        this.finish = finish;
        this.ball = ball;
        this.bonuses = bonuses;
    }

    public static Model restore(Scanner input) {
        Field field = Field.restore(input);
        CheckPoint finish = new CheckPoint(Point.restore(input));
        Point ball = Point.restore(input);

        Set<CheckPoint> checkPoints = new HashSet<>();
        int numberCheckPoints = input.nextInt();
        for (int i = 0; i < numberCheckPoints; ++i) {
            checkPoints.add(CheckPoint.restore(input));
        }

        return new Model(field, finish, ball, checkPoints);
    }

    public boolean thereIsWallOn(int x, int y) {
        return field.getSector(x, y) == Field.Sector.WALL;
    }

    public void moveUp() {
        ball.setX(ball.getX() - 1);
    }

    public void moveRight() {
        ball.setY(ball.getY() + 1);
    }

    public void moveDown() {
        ball.setX(ball.getX() + 1);
    }

    public void moveLeft() {
        ball.setY(ball.getY() - 1);
    }


    public Field getField() {
        return field;
    }

    public CheckPoint getFinish() {
        return finish;
    }

    public Point getBall() {
        return ball;
    }

    public Set<CheckPoint> getBonuses() {
        return bonuses;
    }
}

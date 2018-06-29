package com.etu.game.controller;

import com.etu.game.view.View;
import com.etu.game.model.CheckPoint;
import com.etu.game.model.Field;
import com.etu.game.model.Model;
import com.etu.game.model.Point;

import java.util.Set;

public class Controller {

    private final Model model;
    private final View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void viewUpdated() {
        view.draw(model);
    }

    public void moveLeft() {
        Point ball = model.getBall();
        if (ball.getY() == 0 || model.thereIsWallOn(ball.getX(), ball.getY() - 1)) {
            return;
        }
        model.moveLeft();
        view.draw(model);
        checkEvents();
    }

    public void moveRight() {
        Field field = model.getField();
        Point ball = model.getBall();
        if (ball.getY() == field.getNumColumns() - 1 || model.thereIsWallOn(ball.getX(), ball.getY() + 1)) {
            return;
        }
        model.moveRight();
        view.draw(model);
        checkEvents();
    }

    public void moveUp() {
        Point ball = model.getBall();
        if (ball.getX() == 0 || model.thereIsWallOn(ball.getX() - 1, ball.getY())) {
            return;
        }
        model.moveUp();
        view.draw(model);
        checkEvents();
    }

    public void moveDown() {
        Field field = model.getField();
        Point ball = model.getBall();
        if (ball.getX() == field.getNumRows() - 1 || model.thereIsWallOn(ball.getX() + 1, ball.getY())) {
            return;
        }
        model.moveDown();
        view.draw(model);
        checkEvents();
    }

    private void checkEvents() {
        int bonusesTaken = 0;
        Set<CheckPoint> bonuses = model.getBonuses();
        for (CheckPoint bonus : bonuses) {
            if (bonus.getPosition().equals(model.getBall())) {
                bonus.setChecked(true);
            }
            if (bonus.isChecked()) {
                ++bonusesTaken;
            }
        }
        if (model.getFinish().getPosition().equals(model.getBall())) {
            if (bonusesTaken == bonuses.size()) {
                view.showCongratsDialog();
            } else {
                view.showNeedMoreBonusesDialog();
            }
        }
    }
}

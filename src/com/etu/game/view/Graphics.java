package com.etu.game.view;

public interface Graphics {

    void drawRect(int x, int y, int width, int height, int rgb);
    void drawOval(int x, int y, int width, int height, int rgb);
    void drawText(int x, int y, String text, int rgb);
    void showCongratsDialog();
    void showNeedMoreBonusesDialog();
}

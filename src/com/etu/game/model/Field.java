package com.etu.game.model;

import java.io.OutputStream;
import java.util.Scanner;

public class Field {

    private final Sector[][] field;

    private Field(Sector[][] field) {
        this.field = field;
    }

    public int getNumRows() {
        return field.length;
    }

    public int getNumColumns() {
        return field[0].length;
    }

    public Sector getSector(int x, int y) {
        return field[x][y];
    }

    /**
     *   0 1 2 3 4 Y
     * 0 . . . . .
     * 1 . . . . .
     * 2 . . w w .
     * 3 . . . w .
     * 4 . . . w .
     * 5 . . . w .
     * X
     */
    // TODO подумать над выделением в отдельный класс (стратегия?)
    public static Field restore(Scanner input) {
        int numRows = input.nextInt();
        int numColumns = input.nextInt();

        Sector[][] field = new Sector[numRows][numColumns];
        for (int x = 0; x < numRows; ++x) {
            for (int y = 0; y < numColumns; ++y) {
                field[x][y] = input.next().equals("w") ? Sector.WALL : Sector.GROUND;
            }
        }
        return new Field(field);
    }

    public enum Sector {
        WALL,
        GROUND
    }
}

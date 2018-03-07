package fr.isima.service;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import fr.isima.controllers.GridSerializer;

import java.util.HashMap;
import java.util.Map;

@JsonSerialize(using = GridSerializer.class)
public class GameOfLifeGrid {
    private final Map<Point, Boolean> grid = new HashMap<>();
    private final int width;
    private final int height;
    private final int id;
    private static int compteur = 0;


    public GameOfLifeGrid(int larg, int haut) {
        this.id = compteur;
        compteur++;
        this.width = larg;
        this.height = haut;
        for (int i = 0; i < larg; i++) {
            for (int j = 0; j < haut; j++) {
                grid.put(new Point(i, j), false);
            }
        }
    }

    public void living(int i, int j) {
        if (grid.containsKey(new Point(i, j))) {
            grid.put(new Point(i, j), true);
        } else {
            throw new IllegalArgumentException();
        }

    }

    public boolean alive(int i, int j) {
        Boolean res = grid.get(new Point(i, j));
        return res == null ? false : res;
    }

    public Map<Point, Boolean> getGrid() {
        return grid;
    }



    public int numberLivingNeighboor(int i, int j) {
        int tot = 0;
        final Point me = new Point(i, j);
        for (int k = i - 1; k <= i + 1; k++) {
            for (int m = j - 1; m <= j + 1; m++) {
                final Point current = new Point(k, m);
                if (!current.equals(me) && alive(k, m)) {
                    tot++;
                }
            }
        }
        return tot;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getId() {
        return id;
    }
}

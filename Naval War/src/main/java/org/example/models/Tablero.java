package org.example.models;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public abstract class Tablero {
    protected int width;
    protected int heigh;
    protected Map<Position, Celda> cells;

    public Tablero(int width, int heigh) {
        this.width = width;
        this.heigh = heigh;
        this.cells = new HashMap<>();
        generateCells();
    }

    protected abstract void generateCells();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tablero tablero = (Tablero) o;
        return cells.equals(tablero.cells);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cells);
    }
}

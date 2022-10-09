package org.example.models;

import java.util.ArrayList;
import java.util.List;

public class TableroNaval extends Tablero {

    private static final List<Character> COLUMNAS = new ArrayList();

    static {
        COLUMNAS.add('A');
        COLUMNAS.add('B');
        COLUMNAS.add('C');
        COLUMNAS.add('D');
        COLUMNAS.add('E');
        COLUMNAS.add('F');
        COLUMNAS.add('G');
        COLUMNAS.add('H');
        COLUMNAS.add('I');
        COLUMNAS.add('J');
    }
    public TableroNaval() {
        super(10, 10);
    }

    @Override
    protected void generateCells() {
        for(Character columna : COLUMNAS) {
            for(int fila = 0; fila <= 10; fila++) {
                cells.put(new Position(fila + 1, columna.charValue()), new Celda(TipoCelda.AGUA));
            }
        }
    }
}

package org.example.models;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TableroNaval extends Tablero {

    public static final List<Character> COLUMNAS = new LinkedList<>();

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

    public void aniadirBarco(Position posicionInical, boolean horizontal, TipoCelda tipoCelda) {
        cells.replace(posicionInical, new Celda(tipoCelda));
        {
            if (horizontal) {
                int indexInicial = COLUMNAS.indexOf(posicionInical.getColumn()) + 1;
                int indexFinal = tipoCelda.getCellNumber() - 1;
                List<Character> subList = COLUMNAS.subList(indexInicial, indexInicial + indexFinal);
                for (Character columna : subList) {
                    Position position = new Position(posicionInical.getRow(), columna.charValue());
                    cells.replace(position, new Celda(tipoCelda));
                }
            } else {
                int filaIncial = posicionInical.getRow() + 1;
                int filaFinal = posicionInical.getRow() + tipoCelda.getCellNumber();
                for (int fila = filaIncial; fila < filaFinal; fila++) {
                    Position position = new Position(fila, posicionInical.getColumn());
                    cells.replace(position, new Celda(tipoCelda));
                }

            }
        }

    }

    @Override
    protected void generateCells() {
        for(Character columna : COLUMNAS) {
            for(int fila = 0; fila < heigh; fila++) {
                cells.put(new Position(fila + 1, columna.charValue()), new Celda(TipoCelda.AGUA));
            }
        }
    }
}

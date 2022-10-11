package org.example.models;

public enum TipoCelda {
    AGUA('-', 1),
    PORTA_AVIONES('P', 5),
    ACORAZADO('A',4),
    CRUCERO('C',3),
    SUBMARINO('S',3),
    DESTRUCTOR('D',2);

    private final char symbol;
    private final int cellNumber;

    private TipoCelda(char symbol, int cellNumber) {
        this.symbol = symbol;
        this.cellNumber = cellNumber;
    }

    public char getSymbol() {
        return symbol;
    }

    public int getCellNumber() {
        return cellNumber;
    }
}

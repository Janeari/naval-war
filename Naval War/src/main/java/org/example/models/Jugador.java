package org.example.models;

public class Jugador {
    private String nombre;
    private TableroNaval miTablero;
    private TableroNaval tableroEnemigo;

    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TableroNaval getMiTablero() {
        return miTablero;
    }

    public void setMiTablero(TableroNaval miTablero) {
        this.miTablero = miTablero;
    }

    public TableroNaval getTableroEnemigo() {
        return tableroEnemigo;
    }

    public void setTableroEnemigo(TableroNaval tableroEnemigo) {
        this.tableroEnemigo = tableroEnemigo;
    }
}

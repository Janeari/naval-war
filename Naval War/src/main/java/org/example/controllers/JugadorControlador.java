package org.example.controllers;

import org.example.models.Jugador;
import org.example.models.TableroNaval;

public class JugadorControlador {

    public JugadorControlador() {
    }

    public Jugador crearJugador(String nombre) {
        Jugador jugador = new Jugador(nombre);
        TableroNaval miTablero = new TableroNaval();
        TableroNaval tableroEnemigo = new TableroNaval();
        jugador.setMiTablero(miTablero);
        jugador.setTableroEnemigo(tableroEnemigo);
        return jugador;
    }
}

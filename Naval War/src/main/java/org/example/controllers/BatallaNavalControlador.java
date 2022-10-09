package org.example.controllers;

import org.example.models.BatallaNaval;
import org.example.models.Jugador;

public class BatallaNavalControlador {
    private BatallaNaval batallaNaval;
    private JugadorControlador jugadorControlador;

    public BatallaNavalControlador() {
        this.jugadorControlador = new JugadorControlador();
    }

    public void crearNuevoJuego(String nombreJugador1, String nombreJugador2) {
        Jugador jugador1 = jugadorControlador.crearJugador(nombreJugador1);
        Jugador jugador2 = jugadorControlador.crearJugador(nombreJugador2);
        batallaNaval = new BatallaNaval(jugador1, jugador2);
    }

    public void iniciarJuego() {
        batallaNaval.iniciar();
    }
}

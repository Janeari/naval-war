package org.example.controllers;

import org.example.models.BatallaNaval;
import org.example.models.Jugador;
import org.example.models.Position;
import org.example.models.TipoCelda;

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
        //batallaNaval.iniciar();
    }
    public BatallaNaval getBatallaNaval() {
        return batallaNaval;
    }

    private void aniadirBarco(Jugador jugador, String pos, boolean horizontal, TipoCelda portaAviones) {
        Position positionIncial = new Position(Integer.valueOf(pos.charAt(1)).intValue(), pos.charAt(0));


    }

    public void aniadirBarcoJugador1(String pos, boolean b, TipoCelda portaAviones) {
    }
}

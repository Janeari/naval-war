package org.example.views;

import org.example.controllers.BatallaNavalControlador;
import org.example.controllers.JugadorControlador;
import org.example.models.Jugador;
import org.example.models.Position;
import org.example.models.TableroNaval;
import org.example.models.TipoCelda;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BatallaNavalVista {
    private static final Scanner SCANNER = new Scanner(new InputStreamReader(System.in));

    private BatallaNavalControlador batallaNavalControlador;

    public BatallaNavalVista(BatallaNavalControlador batallaNavalControlador) {
        this.batallaNavalControlador = batallaNavalControlador;
    }

    public void ejecutar() {
        String jugador1 = ingresarJugador();
        String jugador2 = ingresarJugador();
        batallaNavalControlador.crearNuevoJuego(jugador1, jugador2);
        ingresarTableros();

    }

    private void ingresarTableros() {
        imprimirTableroVacio();
        aniadirBarco("Portaaviones", TipoCelda.PORTA_AVIONES, true);
        aniadirBarco("Acorazado", TipoCelda.ACORAZADO, true);
        aniadirBarco("Crucero", TipoCelda.CRUCERO, true);
        aniadirBarco("Submarino", TipoCelda.SUBMARINO, true);
        aniadirBarco("Destructor", TipoCelda.DESTRUCTOR, true);
        aniadirBarco("Portaaviones", TipoCelda.PORTA_AVIONES, false);
        aniadirBarco("Acorazado", TipoCelda.ACORAZADO, false);
        aniadirBarco("Crucero", TipoCelda.CRUCERO, false);
        aniadirBarco("Submarino", TipoCelda.SUBMARINO, false);
        aniadirBarco("Destructor", TipoCelda.DESTRUCTOR, false);


    }

    private void aniadirBarco(String tipo, TipoCelda tipoCelda, boolean jugador1) {
        System.out.println(String.format("Ingresar coordenadas para %s:", tipo));
        String pos = SCANNER.next().toUpperCase();
        System.out.println("Ingresar orientacion:");
        System.out.println("1.- Horizontal");
        System.out.println("2.- Vertical");
        int orientacion = SCANNER.nextInt();
        if (jugador1) {
            batallaNavalControlador.aniadirBarcoJugador1(pos, orientacion == 1, tipoCelda);
            imprimirTablero(batallaNavalControlador.getBatallaNaval().getJugador1());
        } else {
            batallaNavalControlador.aniadirBarcoJugador2(pos, orientacion == 1, tipoCelda);
            imprimirTablero(batallaNavalControlador.getBatallaNaval().getJugador2());
        }
    }

    private void imprimirTablero(Jugador jugador1) {
        System.out.print(" ");
        for(Character columna : TableroNaval.COLUMNAS) {
            System.out.print(columna.toString() + "|");
        }
        System.out.println();
        for(int filas = 0; filas <= 9; filas++) {
            System.out.print(filas + 1);
            for(Character columna : TableroNaval.COLUMNAS) {
                Position pos = new Position(filas + 1, columna.charValue());
                System.out.print(jugador1.getMiTablero().getCells().get(pos).getContent().getSymbol() + "|");
            }
            System.out.println();
        }
        //System.out.println();
    }

    private void imprimirTableroVacio() {
        System.out.print(" ");
        for(Character columna : TableroNaval.COLUMNAS) {
            System.out.print(columna.toString() + "|");
        }
        System.out.println();
        for(int filas = 0; filas <= 9; filas++) {
            System.out.print(filas + 1);
            for(int columnas = 0; columnas <= 9; columnas++) {
                    System.out.print(" |");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static String ingresarJugador() {
        System.out.println("Ingrese el nombre del Jugador:");
        return SCANNER.nextLine();
    }
}

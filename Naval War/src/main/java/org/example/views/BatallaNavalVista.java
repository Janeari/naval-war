package org.example.views;

import org.example.controllers.BatallaNavalControlador;
import org.example.controllers.JugadorControlador;
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
        //System.out.println("Posiciones:" + batallaNavalControlador.getBatallaNaval().getJugador1().getMiTablero().getCells().size());
        ingresarTableros();

    }

    private void ingresarTableros() {
        imprimirTableroVacio();
        System.out.println("Ingresar coordenadas para Portaviones:");
        String pos = SCANNER.nextLine();
        System.out.println("Ingresar orientacion:");
        System.out.println("1.- Horizontal");
        System.out.println("2.- Vertical");
        int orientacion = SCANNER.nextInt();
        batallaNavalControlador.aniadirBarcoJugador1(pos, orientacion == 1, TipoCelda.PORTA_AVIONES);
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
    }

    private static String ingresarJugador() {
        System.out.println("Ingrese el nombre del Jugador:");
        return SCANNER.nextLine();
    }
}

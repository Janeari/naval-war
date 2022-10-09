package org.example.views;

import org.example.controllers.BatallaNavalControlador;
import org.example.controllers.JugadorControlador;

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
        System.out.println("Ingrese el nombre del Jugador:");
        String jugador1 = SCANNER.nextLine();
        System.out.println("Ingrese el nombre del Jugador:");
        String jugador2 = SCANNER.nextLine();
    }
}

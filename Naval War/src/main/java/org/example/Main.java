package org.example;

import org.example.controllers.BatallaNavalControlador;
import org.example.views.BatallaNavalVista;

public class Main {
    public static void main(String[] args) {
        BatallaNavalControlador batallaNavalControlador = new BatallaNavalControlador();
        BatallaNavalVista batallaNavalVista = new BatallaNavalVista(batallaNavalControlador);
        batallaNavalVista.ejecutar();
    }
}
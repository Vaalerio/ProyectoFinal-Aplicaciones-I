package com.mycompany.proyectofinal;

import View.InicioView;
import View.PantallaDeCarga;

public class Main {
    public static void main(String[] args) {
        PantallaDeCarga carga = new PantallaDeCarga();
        carga.cargarDatos();

        new Thread(() -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                carga.ocultarPantalla();
                new InicioView().setVisible(true);
            }
        }).start();
    }
}
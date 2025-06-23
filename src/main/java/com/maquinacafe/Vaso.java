package com.maquinacafe;

public class Vaso {
    private int cantidadvasos;
    private int contenido;

    public Vaso(int cantidadvasos, int contenido) {
        this.cantidadvasos = cantidadvasos;
        this.contenido = contenido;
    }

    public int getcantidadvasos() {
        return cantidadvasos;
    }

    public void setcantidadvasos(int cantidadvasos) {
        this.cantidadvasos = cantidadvasos;
    }

    public int getcontenido() {
        return contenido;
    }

    public void setcontenido(int contenido) {
        this.contenido = contenido;
    }

    public boolean hasvasos(int cantidad) {
        return this.cantidadvasos >= cantidad;
    }

    public void givevasos(int cantidad) {
        this.cantidadvasos -= cantidad;
    }
}


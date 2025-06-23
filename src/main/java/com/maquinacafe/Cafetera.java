package com.maquinacafe;

public class Cafetera {
    private int cantidadcafe;

    public Cafetera(int cantidadcafe) {
        this.cantidadcafe = cantidadcafe;
    }

    public int getcantidaddecafe() {
        return cantidadcafe;
    }

    public void setcantidaddecafe(int cantidadcafe) {
        this.cantidadcafe = cantidadcafe;
    }

    public boolean hascafe(int cantidad) {
        return this.cantidadcafe >= cantidad;
    }

    public void givecafe(int cantidad) {
        this.cantidadcafe -= cantidad;
    }
}


package com.maquinacafe;

public class Azucarero {
    private int cantidadazucar;

    public Azucarero(int cantidadazucar) {
        this.cantidadazucar = cantidadazucar;
    }

    public int getcantidaddeazucar() {
        return cantidadazucar;
    }

    public void setcantidaddeazucar(int cantidadazucar) {
        this.cantidadazucar = cantidadazucar;
    }

    public boolean hasazucar(int cantidad) {
        return this.cantidadazucar >= cantidad;
    }

    public void giveazucar(int cantidad) {
        this.cantidadazucar -= cantidad;
    }
}


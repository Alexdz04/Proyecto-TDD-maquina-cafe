package com.maquinacafe;

public class MaquinaDeCafe {
    private Cafetera cafetera;
    private Vaso vasospequenos;
    private Vaso vasosmedianos;
    private Vaso vasosgrandes;
    private Azucarero azucarero;

    public MaquinaDeCafe() {
    }

    public Cafetera getcafetera() {
        return cafetera;
    }

    public void setcafetera(Cafetera cafetera) {
        this.cafetera = cafetera;
    }

    public Vaso getvasospequenos() {
        return vasospequenos;
    }

    public void setvasospequenos(Vaso vasospequenos) {
        this.vasospequenos = vasospequenos;
    }

    public Vaso getvasosmedianos() {
        return vasosmedianos;
    }

    public void setvasosmedianos(Vaso vasosmedianos) {
        this.vasosmedianos = vasosmedianos;
    }

    public Vaso getvasosgrandes() {
        return vasosgrandes;
    }

    public void setvasosgrandes(Vaso vasosgrandes) {
        this.vasosgrandes = vasosgrandes;
    }

    public Azucarero getazucarero() {
        return azucarero;
    }

    public void setazucarero(Azucarero azucarero) {
        this.azucarero = azucarero;
    }

    public Vaso gettipodevaso(String tipo) {
        switch (tipo) {
            case "pequeno":
                return vasospequenos;
            case "mediano":
                return vasosmedianos;
            case "grande":
                return vasosgrandes;
            default:
                return null;
        }
    }

    public String getvasodecafe(String tipoVaso, int cantidadVasos, int cantidadAzucar) {
        Vaso vaso = gettipodevaso(tipoVaso);

        if (vaso == null || !vaso.hasvasos(1)) {
            return "No hay vasos";
        }

        if (!cafetera.hascafe(vaso.getcontenido())) {
            return "No hay cafe";
        }

        if (cantidadAzucar > 0 && !azucarero.hasazucar(cantidadAzucar)) {
            return "No hay azucar";
        }

        vaso.givevasos(1);
        cafetera.givecafe(vaso.getcontenido());
        if (cantidadAzucar > 0) {
            azucarero.giveazucar(cantidadAzucar);
        }

        return "Aqui tiene su cafe!!";
    }
}


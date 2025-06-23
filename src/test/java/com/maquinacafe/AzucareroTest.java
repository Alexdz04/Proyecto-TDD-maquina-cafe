package com.maquinacafe;

import org.junit.Test;
import static org.junit.Assert.*;

public class AzucareroTest {

    @Test
    public void deberia_devolver_cantidad_azucar_cuando_se_inicializa() {
        Azucarero azucarero = new Azucarero(10);
        assertEquals(10, azucarero.getcantidaddeazucar());
    }

    @Test
    public void deberia_restar_azucar_cuando_se_da_azucar() {
        Azucarero azucarero = new Azucarero(10);
        azucarero.giveazucar(5);
        assertEquals(5, azucarero.getcantidaddeazucar());
    }

    @Test
    public void deberia_devolver_true_si_hay_azucar() {
        Azucarero azucarero = new Azucarero(10);
        assertTrue(azucarero.hasazucar(5));
    }

    @Test
    public void deberia_devolver_false_si_no_hay_azucar() {
        Azucarero azucarero = new Azucarero(5);
        assertFalse(azucarero.hasazucar(10));
    }

    @Test
    public void deberia_establecer_cantidad_azucar() {
        Azucarero azucarero = new Azucarero(0);
        azucarero.setcantidaddeazucar(20);
        assertEquals(20, azucarero.getcantidaddeazucar());
    }
}


package com.maquinacafe;

import org.junit.Test;
import static org.junit.Assert.*;

public class VasoTest {

    @Test
    public void deberia_devolver_cantidad_vasos_cuando_se_inicializa() {
        Vaso vaso = new Vaso(10, 3);
        assertEquals(10, vaso.getcantidadvasos());
    }

    @Test
    public void deberia_devolver_contenido_cuando_se_inicializa() {
        Vaso vaso = new Vaso(10, 3);
        assertEquals(3, vaso.getcontenido());
    }

    @Test
    public void deberia_restar_vasos_cuando_se_da_uno() {
        Vaso vaso = new Vaso(10, 3);
        vaso.givevasos(1);
        assertEquals(9, vaso.getcantidadvasos());
    }

    @Test
    public void deberia_devolver_true_si_hay_vasos() {
        Vaso vaso = new Vaso(1, 3);
        assertTrue(vaso.hasvasos(1));
    }

    @Test
    public void deberia_devolver_false_si_no_hay_vasos() {
        Vaso vaso = new Vaso(0, 3);
        assertFalse(vaso.hasvasos(1));
    }

    @Test
    public void deberia_establecer_cantidad_vasos() {
        Vaso vaso = new Vaso(0, 3);
        vaso.setcantidadvasos(5);
        assertEquals(5, vaso.getcantidadvasos());
    }

    @Test
    public void deberia_establecer_contenido() {
        Vaso vaso = new Vaso(0, 0);
        vaso.setcontenido(7);
        assertEquals(7, vaso.getcontenido());
    }
}


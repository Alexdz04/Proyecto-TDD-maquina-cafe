package com.maquinacafe;

import org.junit.Test;
import static org.junit.Assert.*;

public class CafeteraTest {

    @Test
    public void deberia_devolver_cantidad_cafe_cuando_se_inicializa() {
        Cafetera cafetera = new Cafetera(100);
        assertEquals(100, cafetera.getcantidaddecafe());
    }

    @Test
    public void deberia_restar_cafe_cuando_se_da_cafe() {
        Cafetera cafetera = new Cafetera(100);
        cafetera.givecafe(10);
        assertEquals(90, cafetera.getcantidaddecafe());
    }

    @Test
    public void deberia_devolver_true_si_hay_cafe() {
        Cafetera cafetera = new Cafetera(10);
        assertTrue(cafetera.hascafe(5));
    }

    @Test
    public void deberia_devolver_false_si_no_hay_cafe() {
        Cafetera cafetera = new Cafetera(5);
        assertFalse(cafetera.hascafe(10));
    }

    @Test
    public void deberia_establecer_cantidad_cafe() {
        Cafetera cafetera = new Cafetera(0);
        cafetera.setcantidaddecafe(50);
        assertEquals(50, cafetera.getcantidaddecafe());
    }
}


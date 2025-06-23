package com.maquinacafe;

import org.junit.Test;
import static org.junit.Assert.*;

public class MaquinaDeCafeTest {

    
    private Vaso vasospequenos = new Vaso(5, 3);
    private Vaso vasosmedianos = new Vaso(5, 5);
    private Vaso vasosgrandes = new Vaso(5, 7);
    private Cafetera cafetera = new Cafetera(100);
    private Azucarero azucarero = new Azucarero(20);

    @Test
    public void deberia_poder_seleccionar_vaso_pequeno() {
        MaquinaDeCafe maquina = new MaquinaDeCafe();
        maquina.setvasospequenos(vasospequenos);
        maquina.setvasosmedianos(vasosmedianos);
        maquina.setvasosgrandes(vasosgrandes);
        maquina.setcafetera(cafetera);
        maquina.setazucarero(azucarero);

        assertEquals(vasospequenos, maquina.gettipodevaso("pequeno"));
    }

    @Test
    public void deberia_poder_seleccionar_vaso_mediano() {
        MaquinaDeCafe maquina = new MaquinaDeCafe();
        maquina.setvasospequenos(vasospequenos);
        maquina.setvasosmedianos(vasosmedianos);
        maquina.setvasosgrandes(vasosgrandes);
        maquina.setcafetera(cafetera);
        maquina.setazucarero(azucarero);

        assertEquals(vasosmedianos, maquina.gettipodevaso("mediano"));
    }

    @Test
    public void deberia_poder_seleccionar_vaso_grande() {
        MaquinaDeCafe maquina = new MaquinaDeCafe();
        maquina.setvasospequenos(vasospequenos);
        maquina.setvasosmedianos(vasosmedianos);
        maquina.setvasosgrandes(vasosgrandes);
        maquina.setcafetera(cafetera);
        maquina.setazucarero(azucarero);

        assertEquals(vasosgrandes, maquina.gettipodevaso("grande"));
    }

    @Test
    public void deberia_mostrar_mensaje_si_no_hay_vasos() {
        MaquinaDeCafe maquina = new MaquinaDeCafe();
        maquina.setvasospequenos(new Vaso(0, 3));
        maquina.setvasosmedianos(vasosmedianos);
        maquina.setvasosgrandes(vasosgrandes);
        maquina.setcafetera(cafetera);
        maquina.setazucarero(azucarero);

        assertEquals("No hay vasos", maquina.getvasodecafe("pequeno", 0, 0));
    }

    @Test
    public void deberia_mostrar_mensaje_si_no_hay_cafe() {
        MaquinaDeCafe maquina = new MaquinaDeCafe();
        maquina.setvasospequenos(vasospequenos);
        maquina.setvasosmedianos(vasosmedianos);
        maquina.setvasosgrandes(vasosgrandes);
        maquina.setcafetera(new Cafetera(0)); 
        maquina.setazucarero(azucarero);

        assertEquals("No hay cafe", maquina.getvasodecafe("pequeno", 0, 0));
    }

    @Test
    public void deberia_mostrar_mensaje_si_no_hay_azucar() {
        MaquinaDeCafe maquina = new MaquinaDeCafe();
        maquina.setvasospequenos(vasospequenos);
        maquina.setvasosmedianos(vasosmedianos);
        maquina.setvasosgrandes(vasosgrandes);
        maquina.setcafetera(cafetera);
        maquina.setazucarero(new Azucarero(0)); 

        assertEquals("No hay azucar", maquina.getvasodecafe("pequeno", 0, 1));
    }

    @Test
    public void deberia_preparar_cafe_con_azucar_correctamente() {
        MaquinaDeCafe maquina = new MaquinaDeCafe();
        maquina.setvasospequenos(vasospequenos);
        maquina.setvasosmedianos(vasosmedianos);
        maquina.setvasosgrandes(vasosgrandes);
        maquina.setcafetera(cafetera);
        maquina.setazucarero(azucarero);

        String result = maquina.getvasodecafe("pequeno", 0, 2);
        assertEquals("Aqui tiene su cafe!!", result);
        assertEquals(4, vasospequenos.getcantidadvasos());
        assertEquals(97, cafetera.getcantidaddecafe());
        assertEquals(18, azucarero.getcantidaddeazucar());
    }

    @Test
    public void deberia_preparar_cafe_sin_azucar_correctamente() {
        MaquinaDeCafe maquina = new MaquinaDeCafe();
        maquina.setvasospequenos(vasospequenos);
        maquina.setvasosmedianos(vasosmedianos);
        maquina.setvasosgrandes(vasosgrandes);
        maquina.setcafetera(cafetera);
        maquina.setazucarero(azucarero);

        String result = maquina.getvasodecafe("mediano", 0, 0);
        assertEquals("Aqui tiene su cafe!!", result);
        assertEquals(4, vasosmedianos.getcantidadvasos());
        assertEquals(95, cafetera.getcantidaddecafe());
        assertEquals(20, azucarero.getcantidaddeazucar());
    }
}


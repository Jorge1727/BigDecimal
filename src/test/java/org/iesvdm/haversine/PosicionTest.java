package org.iesvdm.haversine;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosicionTest {

    @Test
    public void testDistanciaKm() {
        Posicion igualada = new Posicion(41.57879F, 1.617221F);
        Posicion granada = new Posicion(37.176487F, -3.597929F);
        float distancia = Posicion.Extensiones.distanciaKm(igualada, granada);
        Assertions.assertEquals(664.0, Math.round(distancia), 0.1);
    }
}

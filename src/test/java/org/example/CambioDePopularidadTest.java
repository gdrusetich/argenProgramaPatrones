package org.example;

import org.junit.Test;

public class CambioDePopularidadTest {

    @Test
    public void unaCancionCambiaDePopularidad(){
    Cancion theScientist = new Cancion("The Scientist", "UnAlbum", "ColdPlay", 2017);
    theScientist.reproducir();

    }
}

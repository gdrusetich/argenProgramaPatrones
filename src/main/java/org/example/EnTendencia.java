package org.example;

import org.example.Cancion;
import org.example.Icono;
import org.example.Popularidad;

import java.time.LocalDateTime;

public class EnTendencia extends Popularidad {
    @Override
    public String verLeyenda(Cancion unaCancion) {
        return unaCancion.getNombre() + " - " + unaCancion.getArtista() + " (" + unaCancion.getAlbum() + " - " + unaCancion.getAnio() + ")";
    }

    @Override
    public Icono verIcono(Cancion unaCancion) {
        return null;
    }

    @Override
    public void reproducir(Cancion cancion){
        System.out.println(this.verLeyenda(cancion));
        //System.out.println(this.verIcono(cancion));
        cancion.agregarReproducciones(1);
        if(cancion.getHoraDeUltimaReproduccion().getHour() - LocalDateTime.now().getHour() < 0){
        cancion.actualizarPopularidad(new Normal());
        }
    }


}

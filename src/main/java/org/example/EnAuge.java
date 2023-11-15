package org.example;

import org.example.Cancion;
import org.example.Icono;
import org.example.Popularidad;

public class EnAuge extends Popularidad {

    @Override
    public String verLeyenda(Cancion unaCancion){
    return unaCancion.getArtista() + " - " + unaCancion.getNombre()+" (" + unaCancion.getAlbum()+" - "+unaCancion.getAnio()+")";
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
        if(this.cumpleCondicionParaEmpeorarEstado(cancion)){
        cancion.actualizarPopularidad(new Normal());
        }
        if(this.cumpleCondicionParaMejorarDeEstado(cancion)){
            cancion.actualizarPopularidad(new EnTendencia());
        }
    }

    private boolean cumpleCondicionParaMejorarDeEstado(Cancion cancion){
        return cancion.getReproducciones()>50000 && cancion.getLikes()>20000;
    }

    private boolean cumpleCondicionParaEmpeorarEstado(Cancion cancion){
return cancion.getDislikes()>4999;
    }

}

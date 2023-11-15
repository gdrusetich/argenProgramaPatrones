package org.example;

public class Normal extends Popularidad{

    @Override
    public String verLeyenda(Cancion unaCancion){

        return unaCancion.getArtista() + " - " + unaCancion.getAlbum() +" "+ unaCancion.getNombre();
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
        if(this.cumpleCondicionParaCambiarDeEstado(cancion)){
            cancion.actualizarPopularidad(new EnAuge());
        }
    }

    private boolean cumpleCondicionParaCambiarDeEstado(Cancion cancion){
        return cancion.getReproducciones()>1000;
    }
}

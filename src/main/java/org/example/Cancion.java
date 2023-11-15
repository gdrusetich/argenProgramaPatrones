package org.example;

import java.time.LocalDateTime;

public class Cancion {
    private String nombre;
    private String album;
    private Integer anio;
    private String artista;
    private Integer reproducciones;
    private Integer likes;
    private Integer dislikes;
    private Icono icono;

    private Popularidad popularidad;
    private String leyenda;

    private LocalDateTime horaDeUltimaReproduccion;

    public Cancion(String nombre, String album, String artista, Integer anio){
        this.nombre = nombre;
        this.album = album;
        this.anio = anio;
        this.artista = artista;
        this.reproducciones = 0;
        this.likes = 0;
        this.dislikes = 0;
        this.popularidad = new Normal();
    }

    public String getNombre() {
        return nombre;
    }

    public String getAlbum() {
        return album;
    }

    public Integer getAnio() {
        return anio;
    }

    public String getArtista() {
        return artista;
    }

    public Integer getReproducciones(){
        return this.reproducciones;
    }

    public Integer getLikes(){
        return this.likes;
    }

    public Integer getDislikes(){
        return this.dislikes;
    }

    public LocalDateTime getHoraDeUltimaReproduccion(){
        return this.horaDeUltimaReproduccion;
    }

    public void agregarLikes(Integer likes) {
        this.likes += likes;
    }

    public void setDislikes(Integer dislikes){
        this.dislikes = dislikes;
    }

    public void agregarReproducciones(Integer reproducciones) {
        this.reproducciones += reproducciones;
    }

    public void agregarDislikes(Integer dislikes) {
        this.dislikes += dislikes;
    }

    public void actualizarPopularidad(Popularidad popularidad) {
        this.popularidad = popularidad;
        }

        public void reproducir(){
            this.horaDeUltimaReproduccion = LocalDateTime.now();
            this.popularidad.reproducir(this);
        }

}

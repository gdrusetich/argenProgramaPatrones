package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

    Cancion theScientist = new Cancion("The Scientist", "AlbumDeColdPlay", "ColdPlay", 2017);
    theScientist.reproducir();
    theScientist.agregarReproducciones(999);
    theScientist.reproducir();
    theScientist.reproducir();
    theScientist.agregarDislikes(5000);
    theScientist.reproducir();
    theScientist.reproducir();
    theScientist.agregarLikes(20001);
    theScientist.agregarReproducciones(50000- theScientist.getReproducciones());
    theScientist.setDislikes(1000);
    theScientist.reproducir();
    theScientist.reproducir();
    theScientist.reproducir();


    }
}

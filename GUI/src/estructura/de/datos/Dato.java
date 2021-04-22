package estructura.de.datos;

public class Dato {
    public String nombre_cancion;
    public String nombre_artista;
    public int anno;
    
    public Dato(String nombre_cancion, String nombre_artista, int anno) {
        this.nombre_cancion = nombre_cancion.strip();
        this.nombre_artista = nombre_artista.strip();
        this.anno = anno;
    }
}

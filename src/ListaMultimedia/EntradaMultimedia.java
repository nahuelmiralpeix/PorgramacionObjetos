package ListaMultimedia;

public class EntradaMultimedia {
    public static void main(String[] args) {
        Coleccion coleccion = new Coleccion();
        Libro libro = new Libro(1, "Milibro", "AutorLibro", "digital", 200,
                1234, 120);
        Elemento elemento = new Libro(1, "Milibro", "AutorLibro", "digital", 200,
                1234, 120);
        Audio audio = new Audio(2, "miAudio", "AutorAudio", "digital",
                200, 120, "mp3");
        Elemento elemento2 = new Audio(2, "miAudio", "AutorAudio", "digital",
                200, 120, "mp3");
        Video video = new Video(3, "Mivideo", "AutorVideo", "fisico", 123,
                "Actor", "Director");
        coleccion.agregarElemento(libro);
        coleccion.agregarElemento(audio);
        coleccion.agregarElemento(video);
        coleccion.eliminar(1);
        coleccion.listarElementos("Libro");

    }
}

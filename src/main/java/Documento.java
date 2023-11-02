import javafx.application.*;

public class Documento {

    private String titulo;
    private String autor;
    private int añoPublicacion;
    private String genero;

    public Documento(String titulo, String autor, int añoPublicacion, String genero){
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
        this.genero = genero;

    }

    //Getters
    public String getTitulo(){

        return titulo;
    }
    public String getAutor(){

        return autor;
    }
    public int getAñoPublicacion(){

        return añoPublicacion;
    }
    public String getGenero(){
        return genero;
    }

    public String toString() {
        return "Titulo: " + titulo + ", Autor: " + autor + ", Año de Publicacion: " + añoPublicacion +
                "Genero: " + genero;
    }

}

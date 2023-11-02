import java.util.Date;

public class Revista extends Documento{
    private String tituloRevista;
    private int añosCirculando;
    private int numeroPublicacion;
    private String ciudad;
    private Date fecha;



    public Revista(String tituloRevista, int añosCirculando, int numeroPublicacion, String ciudad,
                   Date fecha, String titulo, String autor, int añoPublicacion, String genero){
        super(titulo, autor, añoPublicacion, genero);
        this.tituloRevista = tituloRevista;
        this.añosCirculando = añosCirculando;
        this.numeroPublicacion = numeroPublicacion;
        this.ciudad = ciudad;
        this.fecha = fecha;
    }

    public String getTituloRevista(){
        return tituloRevista;
    }
    public int getAñosCirculando(){
        return añosCirculando;
    }
    public int getNumeroPublicacion(){
        return numeroPublicacion;
    }
    public String getCiudad(){
        return ciudad;
    }
    public Date getFecha(){
        return fecha;
    }
    public String toString(){
        return super.toString() + "\nTitulo de la revista: " + tituloRevista + "\nAños de Circulacion: "
                + añosCirculando + "\nNumero de Publicacion: " + numeroPublicacion + "\nCiudad: "
                + ciudad + "\nFecha: " + fecha;
    }






}

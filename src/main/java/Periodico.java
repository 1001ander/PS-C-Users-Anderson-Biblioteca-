import java.util.Date;

public class Periodico extends Documento{
    private String tituloPeriodico;
    private int añosCirculando;
    private int numeroPublicacion;
    private String ciudad;
    private Date fecha;

    //Constructor
    public Periodico(String tituloPeriodico, int añosCirculando, int numeroPublicacion, String ciudad,
                     Date fecha, String titulo, String autor, int añoPublicacion, String genero) {
        super(titulo, autor, añoPublicacion, genero);
        this.tituloPeriodico = tituloPeriodico;
        this.añosCirculando = añosCirculando;
        this.numeroPublicacion = numeroPublicacion;
        this.ciudad = ciudad;
        this.fecha = fecha;
    }

    //Getters
    public String getTituloPeriodico(){
        return tituloPeriodico;
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
    public String toString() {
        return super.toString() + "\nTitulo del Periodico: " + tituloPeriodico +
                "\nAños Circulando: " + añosCirculando + "\nNumero de Publicacion: " + numeroPublicacion +
                "\nCiudad: " + ciudad + "\nFecha: " + fecha;
    }









}

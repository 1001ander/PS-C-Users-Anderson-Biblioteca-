import java.util.Date;

public class Tesis extends Documento{
    private String creador;
    private String nombre;
    private String denominacionTesis;
    private Date fecha;
    private String lugar;

    public Tesis(String creador, String nombre, String denominacionTesis, Date fecha, String lugar,
                 String titulo, String autor, int añoPublicacion, String genero){
        super(titulo, autor, añoPublicacion, genero);
        this.creador = creador;
        this.nombre = nombre;
        this.denominacionTesis = denominacionTesis;
        this.fecha = fecha;
        this.lugar = lugar;
    }
    public String getCreador(){
        return creador;
    }
    public String getNombre(){
        return nombre;
    }
    public String getDenominacionTesis(){
        return denominacionTesis;
    }
    public Date getFecha(){
        return fecha;
    }
    public String getLugar(){
        return lugar;
    }
    public String toString(){
        return super.toString() + "\nNombre del creador: " + creador + "\nNombre de la Tesis" + nombre
                + "\nDenominacion de la Tesis: " + denominacionTesis + "\nFecha: " + fecha + "\nLugar"
                + lugar;
    }
}

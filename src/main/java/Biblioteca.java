import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Libro> libros;
    private List<Enciclopedia> enciclopedias;
    private List<Revista> revistas;
    private List<Tesis> tesis;
    private List<Periodico> periodicos;

    //Constructor
    public Biblioteca(){
        libros = new ArrayList<>();
        enciclopedias = new ArrayList<>();
        revistas = new ArrayList<>();
        tesis = new ArrayList<>();
        periodicos = new ArrayList<>();
    }
    //Metodo para agregar documentos a las listas correspondintes
    public void agregarLibro(Libro libro){
        libros.add(libro);
    }
    public void agregarEnciclopedia(Enciclopedia enciclopedia){
        enciclopedias.add(enciclopedia);

    }
    public void agregarRevista(Revista revista){
        revistas.add(revista);
    }
    public void agregarTesis(Tesis tesis){
        this.tesis.add(tesis);
    }
    public void agregarPeriodico(Periodico periodico){
        periodicos.add(periodico);
    }
    public void buscaLibroPorTitulo(String titulo){
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)){
                System.out.println("Libro Encontrado: " + libro);
                return;
            }
        }
        System.out.println("Libro No Encontrado.");
    }


}

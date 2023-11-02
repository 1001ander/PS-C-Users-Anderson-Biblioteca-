import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class DBBiblioteca {
    private List<Documento> documentos;

    public DBBiblioteca(){
        documentos = new ArrayList<>();
    }
    public void agregar(Documento documento){
    }
    public void modificar(String isbn, Documento documento){
    }
    public void borrar(String isbn){
    }
    public Documento obtener(String isbn){
        return obtener(isbn);
    }
    public List<Documento> listar(){
        return listar();
    }
    public List<Libro> listarLibros(){
        return listarLibros();
    }
    public List<Enciclopedia> listarEnciclopedias(){
        return listarEnciclopedias();
    }
    public List<Revista> listarRevista(){
        return listarRevista();
    }
    public List<Tesis> listarTesis(){
        return listarTesis();
    }
    public List<Periodico> listarPeriodico(){
        return listarPeriodico();
    }
    public int cantidad() {
        return cantidad();
    }
    public int cantidadLibros(){
        return cantidadLibros();
    }
    public int cantidadEnciclopedias(){
        return cantidadEnciclopedias();
    }
    public int cantidadRevistas(){
        return cantidadRevistas();
    }
    public int cantidadTesis(){
        return cantidadTesis();
    }
    public int cantidadPeriodico(){
        return cantidadPeriodico();
    }
    public List<Documento> listarOrdenado(int opcion){
        return listarOrdenado(opcion);
    }
    public List<Libro> listarLibrosOrdenado(int opcion){
        return listarLibrosOrdenado(opcion);
    }
    public List<Enciclopedia> listarEnciclopediasOrdenado(int opcion){
        return listarEnciclopediasOrdenado(opcion);
    }
    public List<Revista> listarRevistaOrdenado(int opcion){
        return listarRevistaOrdenado(opcion);
    }
    public List<Tesis> listarTesisOrdenado(int opcion){
        return listarTesisOrdenado(opcion);
    }
    public List<Periodico> listarPeriodicoOrdenado(int opcion){
        return listarPeriodicoOrdenado(opcion);
    }






}

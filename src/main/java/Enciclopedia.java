public class Enciclopedia extends Documento{
    private String isbn;
    private String idioma;
    private String ilustrador;
    private String artistaCubierta;
    private String editorial;
    private String ciudad;
    private String pais;
    private String formato;
    private int numeroPaginas;
    private int volumen;

    //Constructor
    public Enciclopedia(String isbn, String idioma, String ilustrador, String artistaCubierta,
                        String editorial, String ciudad, String pais, String formato,int numeroPaginas,
                        int volumen, String titulo, String autor, int añoPublicacion, String genero) {
        super(titulo, autor, añoPublicacion, genero);
        this.isbn = isbn;
        this.idioma = idioma;
        this.ilustrador = ilustrador;
        this.artistaCubierta = artistaCubierta;
        this.editorial = editorial;
        this.ciudad = ciudad;
        this.pais = pais;
        this.formato = formato;
        this.numeroPaginas = numeroPaginas;
        this.volumen = volumen;

    }

    //Getters
    public String getIsbn(){
        return isbn;
    }
    public String getIdioma(){
        return idioma;
    }
    public String getIlustrador(){
        return ilustrador;
    }
    public String getArtistaCubierta(){
        return artistaCubierta;
    }
    public String getEditorial(){
        return editorial;
    }
    public String getCiudad(){
        return ciudad;
    }
    public String getPais(){
        return pais;
    }
    public String getFormato(){
        return formato;
    }
    public int getNumeroPaginas(){
        return numeroPaginas;
    }
    public int getVolumen(){
        return volumen;
    }
    //@Override
    public String toString() {
        return super.toString() + "\nISBN: " + isbn + "\nIdioma: " + idioma +
                "\nIluistador: " + ilustrador + "\nArtista de Cubierta: " + artistaCubierta +
                "\nEditorial: " + editorial + "\nCiudad: " + ciudad + "\nPais: " + pais +
                "\nFormato: " + formato + "\nNumero de Paginas: " + numeroPaginas +
                "\nVolumen: " + volumen;
    }

}

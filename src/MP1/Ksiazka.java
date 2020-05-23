package MP1;

public class Ksiazka extends ObjectPlusPlus{

    private String nazwa;
    private String wydawca;
    private String autor;
    private int cena;
    private boolean rabat;
    private Promocja promocja; //atrybut opcjonalny
    private String ISBN;
    private int dostepnaIloscSztuk;


    Ksiazka(String nazwa,
            String wydawca,
            String autor,
            int cena,
            boolean rabat,
            Promocja promocja, //atrybut opcjonalny
            String ISBN,
            int dostepnaIloscSztuk) throws inputException,notISBNException {
        super();
        if ( nazwa == null ){throw new NullPointerException("Nazwa nie może być pusta.");}
        this.nazwa = nazwa;
        if ( wydawca == null ){throw new NullPointerException("Wydawca nie może być pusty.");}
        this.wydawca = wydawca;
        if ( autor == null ){throw new NullPointerException("Autor nie może być pusty.");}
        this.autor = autor;
        if ( cena == 0 || cena < 0 ){throw new inputException();}
        this.cena = cena;
        this.rabat = rabat;
        this.promocja = promocja; //atrybut opcjonalny
        if (ISBN.length()!=13){throw new notISBNException();}
        this.ISBN = ISBN;
        if ( dostepnaIloscSztuk < 0 ){throw new inputException();}
        this.dostepnaIloscSztuk = dostepnaIloscSztuk;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        if ( nazwa == null ){throw new NullPointerException("Nazwa nie może być pusta.");}
        this.nazwa = nazwa;
    }

    public String getWydawca() {
        return wydawca;
    }

    public void setWydawca(String wydawca) {
        if ( wydawca == null ){throw new NullPointerException("Wydawca nie może być pusty.");}
        this.wydawca = wydawca;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        if ( autor == null ){throw new NullPointerException("Autor nie może być pusty.");}
        this.autor = autor;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) throws inputException{
        if ( cena == 0 || cena < 0 ){throw new inputException();}
        this.cena = cena;
    }

    public boolean getRabat() {
        return rabat;
    }

    public void setRabat(boolean rabat) {
        this.rabat = rabat;
    }

    public Promocja getPromocja() {
        return promocja;
    }

    public void setPromocja(Promocja promocja) {
        this.promocja = promocja;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) throws notISBNException{
        if (ISBN.length()!=13){throw new notISBNException();}
        this.ISBN = ISBN;
    }

    public int getDostepnaIloscSztuk() {
        return dostepnaIloscSztuk;
    }

    public void setDostepnaIloscSztuk(int dostepnaIloscSztuk) throws inputException{
        if ( dostepnaIloscSztuk < 0 ){throw new inputException();}
        this.dostepnaIloscSztuk = dostepnaIloscSztuk;
    }
}

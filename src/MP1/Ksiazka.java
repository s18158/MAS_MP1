package MP1;

import java.util.Iterator;

public class Ksiazka extends ObjectPlus{

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


    public static void main(String[] args) throws ClassNotFoundException, inputException, notISBNException{
        Iterator<Promocja> promocjaIterator = ObjectPlus.getExtent(Promocja.class).iterator();
        new Ksiazka("Przemyślenia geniusza","Stara Księgarnia","Amadeusz Mozart",49,false,null,"1108940542383",1);
        new Ksiazka("How to became Hockey Pro","NHL Canada","Weyne Gretzky",99,true,promocjaIterator.next(),"3342358344203",5);
        new Ksiazka("Best poems of this Millenia","History poems","Oliver Wilde",19,true,promocjaIterator.next(),"5546648712111",55);
        new Ksiazka("101 Chess","Chess World","Magnus Carlsen",9,false,null,"7768444367009",100);
        new Ksiazka("How Snooker rules make no sense.","Snooker GB","Ronnie o'Sollivan",10,false,null,"1132135634518",1000);
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getWydawca() {
        return wydawca;
    }

    public void setWydawca(String wydawca) {
        this.wydawca = wydawca;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
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

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getDostepnaIloscSztuk() {
        return dostepnaIloscSztuk;
    }

    public void setDostepnaIloscSztuk(int dostepnaIloscSztuk) {
        this.dostepnaIloscSztuk = dostepnaIloscSztuk;
    }
}

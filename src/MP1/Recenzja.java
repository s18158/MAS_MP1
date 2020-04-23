package MP1;

import java.util.Iterator;

public class Recenzja extends ObjectPlus {

    private String tytul;
    private int ocena;
    private String tresc; //opcjonalnie
    private Konto konto;
    private Ksiazka ksiazka;

    Recenzja(String tytul,
             int ocena,
             String tresc) throws inputException{
        super();
        if ( tytul == null ){throw new NullPointerException();}
        this.tytul = tytul;
        if ( ocena < 1 || ocena > 5 ){throw new inputException();}
        this.ocena = ocena;
        this.tresc = tresc;
    }

    public void setKontoIKsiazka(Konto konto, Ksiazka ksiazka){
        if ( konto == null ){throw new NullPointerException();}
        this.konto = konto;
        if ( ksiazka == null ){throw new NullPointerException();}
        this.ksiazka = ksiazka;
    }

    public static void main(String[] args) throws ClassNotFoundException, inputException {
        Iterator<Ksiazka> ksiazkaIterator = ObjectPlus.getExtent(Ksiazka.class).iterator();
        Iterator<Konto> kontoIterator = ObjectPlus.getExtent(Konto.class).iterator();
        new Recenzja("1",1,"1").setKontoIKsiazka(kontoIterator.next(),ksiazkaIterator.next());
        new Recenzja("2",2,"2").setKontoIKsiazka(kontoIterator.next(),ksiazkaIterator.next());
        new Recenzja("3",3,"3").setKontoIKsiazka(kontoIterator.next(),ksiazkaIterator.next());
        new Recenzja("4",4,"4").setKontoIKsiazka(kontoIterator.next(),ksiazkaIterator.next());
        new Recenzja("5",5,"5").setKontoIKsiazka(kontoIterator.next(),ksiazkaIterator.next());
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        if ( tytul == null ){throw new NullPointerException();}
        this.tytul = tytul;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) throws inputException{
        if ( ocena < 1 || ocena > 5 ){throw new inputException();}
        this.ocena = ocena;
    }

    public String getTresc() {
        return tresc;
    }

    public void setTresc(String tresc) {
        this.tresc = tresc;
    }

    public Konto getKonto() {
        return konto;
    }

    public void setKonto(Konto konto) {
        this.konto = konto;
    }

    public Ksiazka getKsiazka() {
        return ksiazka;
    }

    public void setKsiazka(Ksiazka ksiazka) {
        this.ksiazka = ksiazka;
    }
}

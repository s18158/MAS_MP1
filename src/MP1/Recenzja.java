package MP1;

import java.util.Iterator;

public class Recenzja extends ObjectPlus {

    private String tytul;
    private int ocena;
    private String tresc;
    private Konto konto;
    private Ksiazka ksiazka;

    Recenzja(String tytul,
             int ocena,
             String tresc){
        super();
        this.tytul = tytul;
        this.ocena = ocena;
        this.tresc = tresc;
    }

    public void setKonto(Konto konto) {
        this.konto = konto;
    }

    public void setKsiazka(Ksiazka ksiazka) {
        this.ksiazka = ksiazka;
    }

    public void setKontoIKsiazka(Konto konto, Ksiazka ksiazka){
        this.konto = konto;
        this.ksiazka = ksiazka;
    }

    public Konto getKonto() {
        return konto;
    }

    public Ksiazka getKsiazka() {
        return ksiazka;
    }

    public static void main(String[] args) throws ClassNotFoundException {
        Iterator<Ksiazka> ksiazkaIterator = ObjectPlus.getExtent(Ksiazka.class).iterator();
        Iterator<Konto> kontoIterator = ObjectPlus.getExtent(Konto.class).iterator();
        new Recenzja("1",1,"1").setKontoIKsiazka(kontoIterator.next(),ksiazkaIterator.next());
        new Recenzja("2",2,"2").setKontoIKsiazka(kontoIterator.next(),ksiazkaIterator.next());
        new Recenzja("3",3,"3").setKontoIKsiazka(kontoIterator.next(),ksiazkaIterator.next());
        new Recenzja("4",4,"4").setKontoIKsiazka(kontoIterator.next(),ksiazkaIterator.next());
        new Recenzja("5",5,"5").setKontoIKsiazka(kontoIterator.next(),ksiazkaIterator.next());
    }
}

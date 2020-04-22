package MP1;

import java.util.Iterator;

public class Okladka extends ObjectPlus{

    private String sciezkaDoZdjeciaOkladki;
    private Ksiazka ksiazka;

    private Okladka(String sciezkaDoZdjeciaOkladki,
                    Ksiazka ksiazka){
        super();
        if (sciezkaDoZdjeciaOkladki == null) { throw new NullPointerException("Ścieżka do okladki nie moze byc pusta.");}
        this.sciezkaDoZdjeciaOkladki = sciezkaDoZdjeciaOkladki;
        //atrybut opcjonalny
        this.ksiazka = ksiazka;
    }

    public static void main(String[] args) throws ClassNotFoundException {
        Iterator<Ksiazka> ksiazkaIterator = ObjectPlus.getExtent(Ksiazka.class).iterator();
        new Okladka("Okladki/o1.jpg",ksiazkaIterator.next());
        new Okladka("Okladki/o2.jpg",ksiazkaIterator.next());
        new Okladka("Okladki/o3.jpg",ksiazkaIterator.next());
        new Okladka("Okladki/o4.jpg",ksiazkaIterator.next());
        new Okladka("Okladki/o5.jpg",ksiazkaIterator.next());
    }

    public String getSciezkaDoZdjeciaOkladki() {
        return sciezkaDoZdjeciaOkladki;
    }

    public void setSciezkaDoZdjeciaOkladki(String sciezkaDoZdjeciaOkladki) {
        this.sciezkaDoZdjeciaOkladki = sciezkaDoZdjeciaOkladki;
    }

    public Ksiazka getKsiazka() {
        return ksiazka;
    }

    public void setKsiazka(Ksiazka ksiazka) {
        this.ksiazka = ksiazka;
    }
}

package MP1;

public class Okladka extends ObjectPlusPlus{

    private String sciezkaDoZdjeciaOkladki;
    private Ksiazka ksiazka;

    Okladka(String sciezkaDoZdjeciaOkladki,
                    Ksiazka ksiazka){
        super();
        if (sciezkaDoZdjeciaOkladki == null) { throw new NullPointerException("Ścieżka do okladki nie moze byc pusta.");}
        this.sciezkaDoZdjeciaOkladki = sciezkaDoZdjeciaOkladki;
        //atrybut opcjonalny
        this.ksiazka = ksiazka;
    }

    public String getSciezkaDoZdjeciaOkladki() {
        return sciezkaDoZdjeciaOkladki;
    }

    public void setSciezkaDoZdjeciaOkladki(String sciezkaDoZdjeciaOkladki) {
        if (sciezkaDoZdjeciaOkladki == null) { throw new NullPointerException("Ścieżka do okladki nie moze byc pusta.");}
        this.sciezkaDoZdjeciaOkladki = sciezkaDoZdjeciaOkladki;
    }

    public Ksiazka getKsiazka() {
        return ksiazka;
    }

    public void setKsiazka(Ksiazka ksiazka) {
        this.ksiazka = ksiazka;
    }
}

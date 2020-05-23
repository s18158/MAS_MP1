package MP1;

public class SprzedanaKsiazka extends Ksiazka {

    private int ID;
    private Data dataSprzedarzy;

    SprzedanaKsiazka(String nazwa,
                     String wydawca,
                     String autor,
                     int cena,
                     boolean rabat,
                     Promocja promocja,
                     String ISBN,
                     int dostepnaIloscSztuk,
                     int ID,
                     Data dataSprzedarzy) throws inputException, notISBNException{
        super(nazwa, wydawca, autor, cena, rabat, promocja, ISBN, dostepnaIloscSztuk);
        if ( ID == 0 ){throw new inputException();}
        this.ID = ID;
        if ( dataSprzedarzy == null ){throw new NullPointerException();}
        this.dataSprzedarzy = dataSprzedarzy;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) throws inputException{
        if ( ID == 0 ){throw new inputException();}
        this.ID = ID;
    }

    public Data getDataSprzedarzy() {
        return dataSprzedarzy;
    }

    public void setDataSprzedarzy(Data dataSprzedarzy) {
        if ( dataSprzedarzy == null ){throw new NullPointerException();}
        this.dataSprzedarzy = dataSprzedarzy;
    }
}

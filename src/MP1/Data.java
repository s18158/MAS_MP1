package MP1;

class Data extends ObjectPlusPlus{

    private int dzien;
    private int miesiac;
    private int rok;
    private int godzina;
    private int minuta;

    Data(int dzien,
         int miesiac,
         int rok,
         int godzina,
         int minuta) throws inputException{
        super();
        if (dzien < 0 || dzien > 31){throw new inputException("Niepoprawny format dnia.");}
        this.dzien = dzien;
        if (miesiac < 0 || miesiac > 12){throw new inputException("Niepoprawny format miesiaca.");}
        this.miesiac = miesiac;
        if (rok < 0 || rok > 9999){throw new inputException("Niepoprawny format roku.");}
        this.rok = rok;
        if (godzina < 0 || godzina > 24){throw new inputException("Niepoprawny format godziny.");}
        this.godzina = godzina;
        if (minuta < 0 || minuta > 60){throw new inputException("Niepoprawny format minuty.");}
        this.minuta = minuta;
    }

    public String toString(){
        return "" + dzien + miesiac + rok + godzina + minuta;
    }

    public String toFormatedString(){
        return "["  + dzien + "/"+ miesiac + "/"+ rok + "] ["+ godzina + ":"+ minuta + "]";
    }

    public void printData(){
        System.out.println(toFormatedString());
    }

    public int getDzien() {
        return dzien;
    }

    public void setDzien(int dzien) throws inputException{
        if (dzien < 0 || dzien > 31){throw new inputException("Niepoprawny format dnia.");}
        this.dzien = dzien;
    }

    public int getMiesiac() {
        return miesiac;
    }

    public void setMiesiac(int miesiac) throws inputException{
        if (miesiac < 0 || miesiac > 12){throw new inputException("Niepoprawny format miesiaca.");}
        this.miesiac = miesiac;
    }

    public int getRok() {
        return rok;
    }

    public void setRok(int rok) throws inputException{
        if (rok < 0 || rok > 9999){throw new inputException("Niepoprawny format roku.");}
        this.rok = rok;
    }

    public int getGodzina() {
        return godzina;
    }

    public void setGodzina(int godzina) throws inputException{
        if (godzina < 0 || godzina > 24){throw new inputException("Niepoprawny format godziny.");}
        this.godzina = godzina;
    }

    public int getMinuta() {
        return minuta;
    }

    public void setMinuta(int minuta) throws inputException{
        if (minuta < 0 || minuta > 60){throw new inputException("Niepoprawny format minuty.");}
        this.minuta = minuta;
    }
}

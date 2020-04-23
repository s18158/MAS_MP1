package MP1;

class Data extends ObjectPlus{

    private int dzien;
    private int miesiac;
    private int rok;
    private int godzina;
    private int minuta;

    private Data(int dzien,
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

    public static void main(String[] args){
        try {
            new Data(1, 1, 1999, 23, 59);
            new Data(9, 11, 2001, 11, 9);
            new Data(19, 4, 2020, 0, 1);
            new Data(6, 12, 2019, 14, 23);
            new Data(9, 11, 966, 12, 0);
        } catch (inputException ie){
            ie.printStackTrace();
        }
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

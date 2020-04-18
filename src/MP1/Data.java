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
         int minuta){
        super();
        this.dzien = dzien;
        this.miesiac = miesiac;
        this.rok = rok;
        this.godzina = godzina;
        this.minuta = minuta;
        sprawdzDzien(dzien);
        sprawdzMiesiac(miesiac);
        sprawdzRok(rok);
        sprawdzGodzine(godzina);
        sprawdzMinute(minuta);
    }

    private void sprawdzDzien(int i){
        try{
            if (i<0||i>31){throw new notProperDataException();}
        } catch (notProperDataException e){
            System.out.println(e.getMessage());
        }
    }

    private void sprawdzMiesiac(int i){
        try{
            if (i<0||i>12){throw new notProperDataException();}
        } catch (notProperDataException e){
            System.out.println(e.getMessage());
        }
    }

    private void sprawdzRok(int i){
        try{
            if (i<0||i>9999){throw new notProperDataException();}
        } catch (notProperDataException e){
            System.out.println(e.getMessage());
        }
    }

    private void sprawdzGodzine(int i){
        try{
            if (i<0||i>24){throw new notProperDataException();}
        } catch (notProperDataException e){
            System.out.println(e.getMessage());
        }
    }

    private void sprawdzMinute(int i){
        try{
            if (i<0||i>60){throw new notProperDataException();}
        } catch (notProperDataException e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args){
        new Data(1,1,1999,23,59);
        new Data(9,11,2001,11,9);
        new Data(19,4,2020,0,1);
        new Data(6,12,2019,14,23);
        new Data(9,11,966,12,0);
    }
}

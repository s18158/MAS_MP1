package MP1;

import java.util.Iterator;

class Promocja {

    Data odKiedy;
    Data doKiedy;
    int rabatWProcentach;
    int rabat;

    Promocja(Data odKiedy,
             Data doKiedy,
             int rabatWProcentach,
             int rabat){
        this.odKiedy = odKiedy;
        this.doKiedy = doKiedy;
        this.rabatWProcentach = rabatWProcentach;
        this.rabat = rabat;
        sprawdzCzyRabatWProcentachPoprawny(rabatWProcentach);
        sprawdzCzyDodatnie(rabat);
        tylkoJedenRodzajRabatu(rabat, rabatWProcentach);
    }

    private void sprawdzCzyRabatWProcentachPoprawny(int i){
        try{
            if (i<0||i>100){throw new properPercentSaleException();}
        } catch (properPercentSaleException e){
            System.out.println(e.getMessage());
        }
    }

    private void sprawdzCzyDodatnie(int i){
        try{
            if (i<0){throw new positiveNumberException();}
        } catch (positiveNumberException e){
            System.out.println(e.getMessage());
        }
    }

    private void tylkoJedenRodzajRabatu(int i1, int i2){
        try{
            if ((i1 == 0) == (i2 == 0)){throw new onlyOneKindOfSaleException();}
        } catch (onlyOneKindOfSaleException e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) throws ClassNotFoundException{
        Iterator<Data> dataIterator = ObjectPlus.getExtent(Data.class).iterator();
        new Promocja(dataIterator.next(),dataIterator.next(),60,0);
        new Promocja(dataIterator.next(),dataIterator.next(),0,500);
        new Promocja(dataIterator.next(),dataIterator.next(),0,1000);
        new Promocja(dataIterator.next(),dataIterator.next(),10,0);
        new Promocja(dataIterator.next(),dataIterator.next(),80,0);
    }
}

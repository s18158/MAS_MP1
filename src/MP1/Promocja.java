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
             int rabat) throws inputException,properPercentSaleException{
        if ( odKiedy == null ){throw new inputException();}
        this.odKiedy = odKiedy;
        if ( doKiedy == null ){throw new inputException();}
        this.doKiedy = doKiedy;
        if (rabatWProcentach<0||rabatWProcentach>100){throw new properPercentSaleException();}
        this.rabatWProcentach = rabatWProcentach;
        if (rabat<0){throw new inputException();}
        this.rabat = rabat;
        tylkoJedenRodzajRabatu(rabat, rabatWProcentach);
    }

    private void tylkoJedenRodzajRabatu(int i1, int i2){
        try{
            if ((i1 == 0) == (i2 == 0)){throw new onlyOneKindOfSaleException();}
        } catch (onlyOneKindOfSaleException e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) throws ClassNotFoundException,inputException,properPercentSaleException{
        Iterator<Data> dataIterator = ObjectPlus.getExtent(Data.class).iterator();
        new Promocja(dataIterator.next(),dataIterator.next(),60,0);
        new Promocja(dataIterator.next(),dataIterator.next(),0,500);
        new Promocja(dataIterator.next(),dataIterator.next(),0,1000);
        new Promocja(dataIterator.next(),dataIterator.next(),10,0);
        new Promocja(dataIterator.next(),dataIterator.next(),80,0);
    }

    public Data getOdKiedy() {
        return odKiedy;
    }

    public void setOdKiedy(Data odKiedy) {
        this.odKiedy = odKiedy;
    }

    public Data getDoKiedy() {
        return doKiedy;
    }

    public void setDoKiedy(Data doKiedy) {
        this.doKiedy = doKiedy;
    }

    public int getRabatWProcentach() {
        return rabatWProcentach;
    }

    public void setRabatWProcentach(int rabatWProcentach) {
        this.rabatWProcentach = rabatWProcentach;
    }

    public int getRabat() {
        return rabat;
    }

    public void setRabat(int rabat) {
        this.rabat = rabat;
    }
}

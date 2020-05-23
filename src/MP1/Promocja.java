package MP1;

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
            if (i1 != 0 && i2 != 0){throw new onlyOneKindOfSaleException();}
        } catch (onlyOneKindOfSaleException e){
            System.out.println(e.getMessage());
        }
    }

    public Data getOdKiedy() {
        return odKiedy;
    }

    public void setOdKiedy(Data odKiedy) throws inputException{
        if ( odKiedy == null ){throw new inputException();}
        this.odKiedy = odKiedy;
    }

    public Data getDoKiedy() {
        return doKiedy;
    }

    public void setDoKiedy(Data doKiedy) throws inputException{
        if ( doKiedy == null ){throw new inputException();}
        this.doKiedy = doKiedy;
    }

    public int getRabatWProcentach() {
        return rabatWProcentach;
    }

    public void setRabatWProcentach(int rabatWProcentach) throws properPercentSaleException{
        if (rabatWProcentach<0||rabatWProcentach>100){throw new properPercentSaleException();}
        tylkoJedenRodzajRabatu(this.rabat, this.rabatWProcentach);
        this.rabatWProcentach = rabatWProcentach;
    }

    public int getRabat() {
        return rabat;
    }

    public void setRabat(int rabat) throws inputException{
        if (rabat<0){throw new inputException();}
        tylkoJedenRodzajRabatu(this.rabat, this.rabatWProcentach);
        this.rabat = rabat;
    }
}

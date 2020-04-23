package MP1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Bestsellery extends ObjectPlus{

    private Data odKiedy;
    private Data doKiedy;
    private Set<Ksiazka> zestawKsiazek;

    private Bestsellery(Data odKiedy,
                    Data doKiedy,
                    Set<Ksiazka> zestawKsiazek){
        super();
        if ( odKiedy == null ){throw new NullPointerException();}
        this.odKiedy = odKiedy;
        if ( doKiedy == null ){throw new NullPointerException();}
        this.doKiedy = doKiedy;
        if ( zestawKsiazek == null ){throw new NullPointerException();}
        this.zestawKsiazek = zestawKsiazek;
    }

    public static void main(String[] args) throws ClassNotFoundException {
        Iterator<Data> dataIterator = ObjectPlus.getExtent(Data.class).iterator();
        Iterator<Ksiazka> ksiazkaIterator = ObjectPlus.getExtent(Ksiazka.class).iterator();
        Set<Ksiazka> zestawKsiazek = new HashSet<>();
        Random random = new Random();
        zestawKsiazek.clear();
        for (int i=0; i< random.nextInt()%10; i++){
            zestawKsiazek.add(ksiazkaIterator.next());
        }
        new Bestsellery(dataIterator.next(),dataIterator.next(),zestawKsiazek);
        zestawKsiazek.clear();
        for (int i=0; i< random.nextInt()%10; i++){
            zestawKsiazek.add(ksiazkaIterator.next());
        }
        new Bestsellery(dataIterator.next(),dataIterator.next(),zestawKsiazek);
        zestawKsiazek.clear();
        for (int i=0; i< random.nextInt()%10; i++){
            zestawKsiazek.add(ksiazkaIterator.next());
        }
        new Bestsellery(dataIterator.next(),dataIterator.next(),zestawKsiazek);

    }

    public Data getOdKiedy() {
        return odKiedy;
    }

    public void setOdKiedy(Data odKiedy) {
        if ( odKiedy == null ){throw new NullPointerException();}
        this.odKiedy = odKiedy;
    }

    public Data getDoKiedy() {
        return doKiedy;
    }

    public void setDoKiedy(Data doKiedy) {
        if ( doKiedy == null ){throw new NullPointerException();}
        this.doKiedy = doKiedy;
    }

    public Set<Ksiazka> getZestawKsiazek() {
        return zestawKsiazek;
    }

    public void setZestawKsiazek(Set<Ksiazka> zestawKsiazek) {
        if ( zestawKsiazek == null ){throw new NullPointerException();}
        this.zestawKsiazek = zestawKsiazek;
    }
}

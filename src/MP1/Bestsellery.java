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
        this.odKiedy = odKiedy;
        this.doKiedy = doKiedy;
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
}

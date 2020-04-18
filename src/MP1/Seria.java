package MP1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Seria extends ObjectPlus{

    private String tytulSerii;
    private Set<Ksiazka> zestawKsiazek;

    private Seria(String tytulSerii,
                  Set<Ksiazka> zestawKsiazek){
        super();
        this.tytulSerii = tytulSerii;
        this.zestawKsiazek = zestawKsiazek;
    }

    int getSeriesSize(){
        return zestawKsiazek.size();
    }

    public static void main(String[] args) throws ClassNotFoundException {
        Iterator<Ksiazka> ksiazkaIterator = ObjectPlus.getExtent(Ksiazka.class).iterator();
        Set<Ksiazka> zestawKsiazek = new HashSet<>();
        Random random = new Random();
        zestawKsiazek.clear();
        for (int i=0; i< random.nextInt()%10; i++){
            zestawKsiazek.add(ksiazkaIterator.next());
        }
        new Seria("LOTR",zestawKsiazek);
        zestawKsiazek.clear();
        for (int i=0; i< random.nextInt()%10; i++){
            zestawKsiazek.add(ksiazkaIterator.next());
        }
        new Seria("Star Wars: Clone Wars",zestawKsiazek);
        zestawKsiazek.clear();
        for (int i=0; i< random.nextInt()%10; i++){
            zestawKsiazek.add(ksiazkaIterator.next());
        }
        new Seria("Warriors",zestawKsiazek);
        zestawKsiazek.clear();
        for (int i=0; i< random.nextInt()%10; i++){
            zestawKsiazek.add(ksiazkaIterator.next());
        }
        new Seria("Harry Potter",zestawKsiazek);
        zestawKsiazek.clear();
        for (int i=0; i< random.nextInt()%10; i++){
            zestawKsiazek.add(ksiazkaIterator.next());
        }
        new Seria("50 Shades of Grey",zestawKsiazek);
    }
}

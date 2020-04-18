package MP1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Wystawa extends ObjectPlus{

    private String motywPrzewodni;
    private String komentarz;

    private Wystawa(String motywPrzewodni,
                    String komentarz,
                    Set<Ksiazka> zestawKsiazek){
        super();
        this.motywPrzewodni = motywPrzewodni;
        this.komentarz = komentarz;
    }

    public static void main(String[] args) throws ClassNotFoundException {
        Iterator<Ksiazka> ksiazkaIterator = ObjectPlus.getExtent(Ksiazka.class).iterator();
        Set<Ksiazka> zestawKsiazek = new HashSet<>();
        Random random = new Random();
        zestawKsiazek.clear();
        for (int i=0; i< random.nextInt()%10; i++){
            zestawKsiazek.add(ksiazkaIterator.next());
        }
        new Wystawa("Noc Horrorow","Sposrod najwybitniejszych tytulow z garunku horror, jestem zaszczycony aby przedstawic Panstwu wybrane przeze mnie, szczegolnie na te okazje, jedne z najwybitniejszych ksiazek tego roku.",zestawKsiazek);
        zestawKsiazek.clear();
        for (int i=0; i< random.nextInt()%10; i++){
            zestawKsiazek.add(ksiazkaIterator.next());
        }
        new Wystawa("Patrzac na zachod...","Kolekcja ta jest specjalnie wybrana kolekcja ksiazek o genezie zachodniej.",zestawKsiazek);
        zestawKsiazek.clear();
        for (int i=0; i< random.nextInt()%10; i++){
            zestawKsiazek.add(ksiazkaIterator.next());
        }
        new Wystawa("Niespotykane historie","Kolekcja najbardziej szczegolowych ksiazek historycznych.",zestawKsiazek);

    }
}

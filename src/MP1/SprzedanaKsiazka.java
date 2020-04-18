package MP1;

import java.util.Iterator;
import java.util.Random;

public class SprzedanaKsiazka extends Ksiazka {

    private int ID;
    private Data dataSprzedarzy;

    SprzedanaKsiazka(String nazwa,
                     String wydawca,
                     String autor,
                     int cena,
                     boolean rabat,
                     Promocja promocja,
                     String ISBN,
                     int dostepnaIloscSztuk,
                     int ID,
                     Data dataSprzedarzy){
        super(nazwa, wydawca, autor, cena, rabat, promocja, ISBN, dostepnaIloscSztuk);
        this.ID = ID;
        this.dataSprzedarzy = dataSprzedarzy;
    }

    public Data getDataSprzedarzy() {
        return dataSprzedarzy;
    }

    public static void main(String[] args) throws ClassNotFoundException {
        Iterator<Promocja> promocjaIterator = ObjectPlus.getExtent(Promocja.class).iterator();
        Iterator<Data> dataIterator = ObjectPlus.getExtent(Data.class).iterator();
        Random random = new Random();
        new SprzedanaKsiazka("Przemyślenia geniusza","Stara Księgarnia","Amadeusz Mozart",49,false,null,"1108940542383",1,random.nextInt(), dataIterator.next());
        new SprzedanaKsiazka("How to became Hockey Pro","NHL Canada","Weyne Gretzky",99,true,promocjaIterator.next(),"3342358344203",5, random.nextInt(), dataIterator.next());
        new SprzedanaKsiazka("Best poems of this Millenia","History poems","Oliver Wilde",19,true,promocjaIterator.next(),"5546648712111",55, random.nextInt(), dataIterator.next());
        new SprzedanaKsiazka("101 Chess","Chess World","Magnus Carlsen",9,false,null,"7768444367009",100, random.nextInt(), dataIterator.next());
        new SprzedanaKsiazka("How Snooker rules make no sense.","Snooker GB","Ronnie o'Sollivan",10,false,null,"1132135634518",1000, random.nextInt(), dataIterator.next());
    }
}

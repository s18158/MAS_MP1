package MP1;

import java.util.Iterator;

public class Ksiazka extends ObjectPlus{

    private String nazwa;
    private String wydawca;
    private String autor;
    private int cena;
    private boolean rabat;
    private Promocja promocja;
    private String ISBN;
    private int dostepnaIloscSztuk;


    private Ksiazka(String nazwa,
            String wydawca,
            String autor,
            int cena,
            boolean rabat,
            Promocja promocja,
            String ISBN,
            int dostepnaIloscSztuk){
        super();
        this.nazwa = nazwa;
        this.wydawca = wydawca;
        this.autor = autor;
        this.cena = cena;
        this.rabat = rabat;
        this.promocja = promocja;
        this.ISBN = ISBN;
        this.dostepnaIloscSztuk = dostepnaIloscSztuk;
        sprawdzCzyStringNotNull(nazwa);
        sprawdzCzyStringNotNull(wydawca);
        sprawdzCzyStringNotNull(autor);
        sprawdzCzyDodatnie(cena);
        sprawdzCzyJestPromocja(rabat, promocja);
        sprawdzCzyDodatnie(dostepnaIloscSztuk);
        sprawdzCzyISBNPoprawny(ISBN);


    }

    private void sprawdzCzyDodatnie(int i){
        try{
            if (i<0){throw new positiveNumberException();}
        } catch (positiveNumberException e){
            System.out.println(e.getMessage());
        }
    }

    private void sprawdzCzyISBNPoprawny(String i){
        try{
            if (i.length()!=13){throw new notISBNException();}
        } catch (notISBNException e){
            System.out.println(e.getMessage());
        }
    }

    private void sprawdzCzyStringNotNull(String s){
        try{
            if (s.isEmpty()){throw new stringNotNullException();}
        } catch (stringNotNullException e){
            System.out.println(e.getMessage());
        }
    }

    private void sprawdzCzyJestPromocja(boolean rabat, Promocja promocja){
        try{
            if (rabat&&(promocja == null)){throw new missingPromotionException();}
        } catch (missingPromotionException e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) throws ClassNotFoundException{
        Iterator<Promocja> promocjaIterator = ObjectPlus.getExtent(Promocja.class).iterator();
        new Ksiazka("Przemyślenia geniusza","Stara Księgarnia","Amadeusz Mozart",49,false,null,"1108940542383",1);
        new Ksiazka("How to became Hockey Pro","NHL Canada","Weyne Gretzky",99,true,promocjaIterator.next(),"3342358344203",5);
        new Ksiazka("Best poems of this Millenia","History poems","Oliver Wilde",19,true,promocjaIterator.next(),"5546648712111",55);
        new Ksiazka("101 Chess","Chess World","Magnus Carlsen",9,false,null,"7768444367009",100);
        new Ksiazka("How Snooker rules make no sense.","Snooker GB","Ronnie o'Sollivan",10,false,null,"1132135634518",1000);
    }
}

package MP1;

import java.io.*;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws inputException,
                                                    ClassNotFoundException,
                                                    properPercentSaleException,
                                                    notISBNException,
                                                    validPhoneNumerException{

        //wczytuje to co było ostatnio zapisane
        if(new File("daneFirmowe").isFile())
        {
            try
            {
                //miejsce docelowe pliku w workspace
                FileInputStream fileInput = new FileInputStream("daneFirmowe");
                ObjectInputStream streamInput = new ObjectInputStream(fileInput);
                //odczyt z dysku do pliku "daneFirmowe"
                ObjectPlus.readExtents(streamInput);
                streamInput.close();
                fileInput.close();
            }
            catch(IOException i){
                i.printStackTrace();
                return;
            }
            catch(ClassNotFoundException c){
                System.out.println("Nie znaleziono klasy.");
                c.printStackTrace();
                return;
            }
        }

        Iterator<Data> dataIterator = ObjectPlus.getExtent(Data.class).iterator();
        Iterator<Promocja> promocjaIterator = ObjectPlus.getExtent(Promocja.class).iterator();
        Iterator<Ksiazka> ksiazkaIterator = ObjectPlus.getExtent(Ksiazka.class).iterator();
        Iterator<Konto> kontoIterator = ObjectPlus.getExtent(Konto.class).iterator();
        Set<SprzedanaKsiazka> sprzedanaKsiazka = new HashSet<>();
        Iterator<SprzedanaKsiazka> sprzedanaKsiazkaIterator = ObjectPlus.getExtent(SprzedanaKsiazka.class).iterator();
        Set<Ksiazka> zestawKsiazek = new HashSet<>();
        Random random = new Random();
        zestawKsiazek.clear();

        new Data(1, 1, 1999, 23, 59);
        new Data(9, 11, 2001, 11, 9);
        new Data(19, 4, 2020, 0, 1);
        new Data(6, 12, 2019, 14, 23);
        new Data(9, 11, 966, 12, 0);

        new Promocja(dataIterator.next(),dataIterator.next(),60,0);
        new Promocja(dataIterator.next(),dataIterator.next(),0,500);
        new Promocja(dataIterator.next(),dataIterator.next(),0,1000);
        new Promocja(dataIterator.next(),dataIterator.next(),10,0);
        new Promocja(dataIterator.next(),dataIterator.next(),80,0);

        new Ksiazka("Przemyślenia geniusza","Stara Księgarnia","Amadeusz Mozart",49,false,null,"1108940542383",1);
        new Ksiazka("How to became Hockey Pro","NHL Canada","Weyne Gretzky",99,true,promocjaIterator.next(),"3342358344203",5);
        new Ksiazka("Best poems of this Millenia","History poems","Oliver Wilde",19,true,promocjaIterator.next(),"5546648712111",55);
        new Ksiazka("101 Chess","Chess World","Magnus Carlsen",9,false,null,"7768444367009",100);
        new Ksiazka("How Snooker rules make no sense.","Snooker GB","Ronnie o'Sollivan",10,false,null,"1132135634518",1000);


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

        new Klient(random.nextInt(),"Marta","Martowska","mm1@gmail.com",dataIterator.next(),123123123,"1","1",random.nextInt(),random.nextLong());
        new Klient(random.nextInt(),"Marcin","Marciniuk","mm2@gmail.com",dataIterator.next(),123123111,"2","2",random.nextInt(),random.nextLong());
        new Klient(random.nextInt(),"Mariusz","Mariuszewski","mm3@gmail.com",dataIterator.next(),123112233,"3","3",random.nextInt(),random.nextLong());
        new Klient(random.nextInt(),"Maciek","Maciejewski","mm4@gmail.com",dataIterator.next(),123332211,"4","4",random.nextInt(),random.nextLong());
        new Klient(random.nextInt(),"Mateusz","Mateuszczyk","mm5@gmail.com", dataIterator.next(),123123321,"5","5",random.nextInt(),random.nextLong());

        new Konto(random.nextInt(),"Marta","Martowska","mm1@gmail.com",dataIterator.next(),123123123,"1","1");
        new Konto(random.nextInt(),"Marcin","Marciniuk","mm2@gmail.com",dataIterator.next(),123123111,"2","2");
        new Konto(random.nextInt(),"Mariusz","Mariuszewski","mm3@gmail.com",dataIterator.next(),123112233,"3","3");
        new Konto(random.nextInt(),"Maciek","Maciejewski","mm4@gmail.com",dataIterator.next(),123332211,"4","4");
        new Konto(random.nextInt(),"Mateusz","Mateuszczyk","mm5@gmail.com", dataIterator.next(),123123321,"5","5");

        new Okladka("Okladki/o1.jpg",ksiazkaIterator.next());
        new Okladka("Okladki/o2.jpg",ksiazkaIterator.next());
        new Okladka("Okladki/o3.jpg",ksiazkaIterator.next());
        new Okladka("Okladki/o4.jpg",ksiazkaIterator.next());
        new Okladka("Okladki/o5.jpg",ksiazkaIterator.next());

        new Pracownik(random.nextInt(),"Marta","Martowska","mm1@gmail.com",dataIterator.next(),123123123,"1","1",random.nextInt(),Pracownik.Stopien.ADMINISTRATOR,"sm1@gmail.com",123123123);
        new Pracownik(random.nextInt(),"Marcin","Marciniuk","mm2@gmail.com",dataIterator.next(),123123111,"2","2",random.nextInt(),Pracownik.Stopien.DYREKTOR,"sm2@gmail.com",123123111);
        new Pracownik(random.nextInt(),"Mariusz","Mariuszewski","mm3@gmail.com",dataIterator.next(),123112233,"3","3",random.nextInt(),Pracownik.Stopien.KIEROWNIK_GRUPY,"sm3@gmail.com",123112233);
        new Pracownik(random.nextInt(),"Maciek","Maciejewski","mm4@gmail.com",dataIterator.next(),123332211,"4","4",random.nextInt(),Pracownik.Stopien.MENAGER,"sm4@gmail.com",123332211);
        new Pracownik(random.nextInt(),"Mateusz","Mateuszczyk","mm5@gmail.com", dataIterator.next(),123123321,"5","5",random.nextInt(),Pracownik.Stopien.PRACOWNIK,"sm5@gmail.com",123123321);

        new Recenzja("1",1,"1").setKontoIKsiazka(kontoIterator.next(),ksiazkaIterator.next());
        new Recenzja("2",2,"2").setKontoIKsiazka(kontoIterator.next(),ksiazkaIterator.next());
        new Recenzja("3",3,"3").setKontoIKsiazka(kontoIterator.next(),ksiazkaIterator.next());
        new Recenzja("4",4,"4").setKontoIKsiazka(kontoIterator.next(),ksiazkaIterator.next());
        new Recenzja("5",5,"5").setKontoIKsiazka(kontoIterator.next(),ksiazkaIterator.next());

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

        new SprzedanaKsiazka("Przemyślenia geniusza","Stara Księgarnia","Amadeusz Mozart",49,false,null,"1108940542383",1,random.nextInt(), dataIterator.next());
        new SprzedanaKsiazka("How to became Hockey Pro","NHL Canada","Weyne Gretzky",99,true,promocjaIterator.next(),"3342358344203",5, random.nextInt(), dataIterator.next());
        new SprzedanaKsiazka("Best poems of this Millenia","History poems","Oliver Wilde",19,true,promocjaIterator.next(),"5546648712111",55, random.nextInt(), dataIterator.next());
        new SprzedanaKsiazka("101 Chess","Chess World","Magnus Carlsen",9,false,null,"7768444367009",100, random.nextInt(), dataIterator.next());
        new SprzedanaKsiazka("How Snooker rules make no sense.","Snooker GB","Ronnie o'Sollivan",10,false,null,"1132135634518",1000, random.nextInt(), dataIterator.next());

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

        sprzedanaKsiazka.clear();
        for (int i=0; i< random.nextInt()%10; i++){
            sprzedanaKsiazka.add(sprzedanaKsiazkaIterator.next());
        }
        new Zamowienie(random.nextInt(),"Adres 1",123112233,Zamowienie.enumMetodaPlatnosci.KARTA,Zamowienie.enumStatus.W_REALIZACJI).addSoldBook(sprzedanaKsiazka);
        sprzedanaKsiazka.clear();
        for (int i=0; i< random.nextInt()%10; i++){
            sprzedanaKsiazka.add(sprzedanaKsiazkaIterator.next());
        }
        new Zamowienie(random.nextInt(),"Adres 2",123123111,Zamowienie.enumMetodaPlatnosci.KOD_PROMOCYJNY,Zamowienie.enumStatus.ANULOWANY).addSoldBook(sprzedanaKsiazka);
        new Zamowienie(random.nextInt(),"Adres 3",321321321,Zamowienie.enumMetodaPlatnosci.KARTA,Zamowienie.enumStatus.ANULOWANY).addSoldBook(sprzedanaKsiazkaIterator.next());
        new Zamowienie(random.nextInt(),"Adres 4",123123123,Zamowienie.enumMetodaPlatnosci.GOTOWKA,Zamowienie.enumStatus.ZREALIZOWANY).addSoldBook(sprzedanaKsiazkaIterator.next());
        new Zamowienie(random.nextInt(),"Adres 5",111222333,Zamowienie.enumMetodaPlatnosci.KARTA,Zamowienie.enumStatus.W_REALIZACJI).addSoldBook(sprzedanaKsiazkaIterator.next());


        //zapis ekstenscji do pliku
        //TRWAła Ekstensja

        try
        {
            //miejsce docelowe pliku w workspace
            //zapis z dysku do pliku "daneFirmowe"
            FileOutputStream fileOutput = new FileOutputStream("daneFirmy");
            ObjectOutputStream StreamOutput = new ObjectOutputStream(fileOutput);
            ObjectPlus.writeExtents(StreamOutput);
            StreamOutput.close();
            fileOutput.close();
        }
        catch(IOException i)
        {
            i.printStackTrace();
        }

    }
}

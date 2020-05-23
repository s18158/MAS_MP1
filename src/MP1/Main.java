package MP1;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws inputException,
                                                    ClassNotFoundException,
                                                    properPercentSaleException,
                                                    notISBNException,
                                                    validPhoneNumerException{

        if(new File("daneFirmowe").isFile())
        {
            try
            {
                FileInputStream fileInput = new FileInputStream("daneFirmowe");
                ObjectInputStream streamInput = new ObjectInputStream(fileInput);
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

        Set<SprzedanaKsiazka> sprzedanaKsiazka = new HashSet<>();
        Set<Ksiazka> zestawKsiazek = new HashSet<>();
        Random random = new Random();
        zestawKsiazek.clear();


            new Data(1, 1, 1999, 23, 59);
            new Data(9, 11, 2001, 11, 9);
            new Data(19, 4, 2020, 0, 1);
            new Data(6, 12, 2019, 14, 23);
            new Data(9, 11, 966, 12, 0);

            Iterator<Data> dataIterator = ObjectPlus.getExtent(Data.class).iterator();
            List<Data> dataList = new ArrayList<>();
            dataIterator.forEachRemaining(dataList::add);
            //dataList.get(random.nextInt(dataList.size()))

            new Promocja(dataList.get(random.nextInt(dataList.size())), dataList.get(random.nextInt(dataList.size())), 60, 0);
            new Promocja(dataList.get(random.nextInt(dataList.size())), dataList.get(random.nextInt(dataList.size())), 0, 500);
            new Promocja(dataList.get(random.nextInt(dataList.size())), dataList.get(random.nextInt(dataList.size())), 0, 100);
            new Promocja(dataList.get(random.nextInt(dataList.size())), dataList.get(random.nextInt(dataList.size())), 10, 0);
            new Promocja(dataList.get(random.nextInt(dataList.size())), dataList.get(random.nextInt(dataList.size())), 80, 0);

            Iterator<Promocja> promocjaIterator = ObjectPlus.getExtent(Promocja.class).iterator();
            List<Promocja> promocjaList = new ArrayList<>();
            promocjaIterator.forEachRemaining(promocjaList::add);
            //promocjaList.get(random.nextInt(promocjaList.size()))

            new Ksiazka("Przemyślenia geniusza", "Stara Księgarnia", "Amadeusz Mozart", 49, false, null, "1108940542383", 1);
            new Ksiazka("How to became Hockey Pro", "NHL Canada", "Weyne Gretzky", 99, true, promocjaList.get(random.nextInt(promocjaList.size())), "3342358344203", 5);
            new Ksiazka("Best poems of this Millenia", "History poems", "Oliver Wilde", 19, true, promocjaList.get(random.nextInt(promocjaList.size())), "5546648712111", 55);
            new Ksiazka("101 Chess", "Chess World", "Magnus Carlsen", 9, false, null, "7768444367009", 100);
            new Ksiazka("How Snooker rules make no sense.", "Snooker GB", "Ronnie o'Sollivan", 10, false, null, "1132135634518", 1000);

            Iterator<Ksiazka> ksiazkaIterator = ObjectPlus.getExtent(Ksiazka.class).iterator();
            List<Ksiazka> ksiazkaList = new ArrayList<>();
            ksiazkaIterator.forEachRemaining(ksiazkaList::add);
            //ksiazkaList.get(random.nextInt(ksiazkaList.size()))

            for (int i = 0; i < random.nextInt() % 10; i++) {
                zestawKsiazek.add(ksiazkaList.get(random.nextInt(ksiazkaList.size())));
            }
            new Bestsellery(dataList.get(random.nextInt(dataList.size())), dataList.get(random.nextInt(dataList.size())), zestawKsiazek);
            zestawKsiazek.clear();
            for (int i = 0; i < random.nextInt() % 10; i++) {
                zestawKsiazek.add(ksiazkaList.get(random.nextInt(ksiazkaList.size())));
            }
            new Bestsellery(dataList.get(random.nextInt(dataList.size())), dataList.get(random.nextInt(dataList.size())), zestawKsiazek);
            zestawKsiazek.clear();
            for (int i = 0; i < random.nextInt() % 10; i++) {
                zestawKsiazek.add(ksiazkaList.get(random.nextInt(ksiazkaList.size())));
            }
            new Bestsellery(dataList.get(random.nextInt(dataList.size())), dataList.get(random.nextInt(dataList.size())), zestawKsiazek);

            new Klient(random.nextInt(), "Marta", "Martowska", "mm1@gmail.com", dataList.get(random.nextInt(dataList.size())), 123123123, "1", "1", random.nextInt(), random.nextLong());
            new Klient(random.nextInt(), "Marcin", "Marciniuk", "mm2@gmail.com", dataList.get(random.nextInt(dataList.size())), 123123111, "2", "2", random.nextInt(), random.nextLong());
            new Klient(random.nextInt(), "Mariusz", "Mariuszewski", "mm3@gmail.com", dataList.get(random.nextInt(dataList.size())), 123112233, "3", "3", random.nextInt(), random.nextLong());
            new Klient(random.nextInt(), "Maciek", "Maciejewski", "mm4@gmail.com", dataList.get(random.nextInt(dataList.size())), 123332211, "4", "4", random.nextInt(), random.nextLong());
            new Klient(random.nextInt(), "Mateusz", "Mateuszczyk", "mm5@gmail.com", dataList.get(random.nextInt(dataList.size())), 123123321, "5", "5", random.nextInt(), random.nextLong());

            new Konto(random.nextInt(), "Marta", "Martowska", "mm1@gmail.com", dataList.get(random.nextInt(dataList.size())), 123123123, "1", "1");
            new Konto(random.nextInt(), "Marcin", "Marciniuk", "mm2@gmail.com", dataList.get(random.nextInt(dataList.size())), 123123111, "2", "2");
            new Konto(random.nextInt(), "Mariusz", "Mariuszewski", "mm3@gmail.com", dataList.get(random.nextInt(dataList.size())), 123112233, "3", "3");
            new Konto(random.nextInt(), "Maciek", "Maciejewski", "mm4@gmail.com", dataList.get(random.nextInt(dataList.size())), 123332211, "4", "4");
            new Konto(random.nextInt(), "Mateusz", "Mateuszczyk", "mm5@gmail.com", dataList.get(random.nextInt(dataList.size())), 123123321, "5", "5");

            Iterator<Konto> kontoIterator = ObjectPlus.getExtent(Konto.class).iterator();
            List<Konto> kontoList = new ArrayList<>();
            kontoIterator.forEachRemaining(kontoList::add);
            //kontoList.get(random.nextInt(kontoList.size()))

            new Ksiazka.Okladka("Okladki/o1.jpg");
            new Ksiazka.Okladka("Okladki/o2.jpg");
            new Ksiazka.Okladka("Okladki/o3.jpg");
            new Ksiazka.Okladka("Okladki/o4.jpg");
            new Ksiazka.Okladka("Okladki/o5.jpg");

            new Pracownik(random.nextInt(), "Marta", "Martowska", "mm1@gmail.com", dataList.get(random.nextInt(dataList.size())), 123123123, "1", "1", random.nextInt(), Pracownik.Stopien.ADMINISTRATOR, "sm1@gmail.com", 123123123);
            new Pracownik(random.nextInt(), "Marcin", "Marciniuk", "mm2@gmail.com", dataList.get(random.nextInt(dataList.size())), 123123111, "2", "2", random.nextInt(), Pracownik.Stopien.DYREKTOR, "sm2@gmail.com", 123123111);
            new Pracownik(random.nextInt(), "Mariusz", "Mariuszewski", "mm3@gmail.com", dataList.get(random.nextInt(dataList.size())), 123112233, "3", "3", random.nextInt(), Pracownik.Stopien.KIEROWNIK_GRUPY, "sm3@gmail.com", 123112233);
            new Pracownik(random.nextInt(), "Maciek", "Maciejewski", "mm4@gmail.com", dataList.get(random.nextInt(dataList.size())), 123332211, "4", "4", random.nextInt(), Pracownik.Stopien.MENAGER, "sm4@gmail.com", 123332211);
            new Pracownik(random.nextInt(), "Mateusz", "Mateuszczyk", "mm5@gmail.com", dataList.get(random.nextInt(dataList.size())), 123123321, "5", "5", random.nextInt(), Pracownik.Stopien.PRACOWNIK, "sm5@gmail.com", 123123321);

            new Recenzja("1", 1, "1").setKontoIKsiazka(kontoList.get(random.nextInt(kontoList.size())), ksiazkaList.get(random.nextInt(ksiazkaList.size())));
            new Recenzja("2", 2, "2").setKontoIKsiazka(kontoList.get(random.nextInt(kontoList.size())), ksiazkaList.get(random.nextInt(ksiazkaList.size())));
            new Recenzja("3", 3, "3").setKontoIKsiazka(kontoList.get(random.nextInt(kontoList.size())), ksiazkaList.get(random.nextInt(ksiazkaList.size())));
            new Recenzja("4", 4, "4").setKontoIKsiazka(kontoList.get(random.nextInt(kontoList.size())), ksiazkaList.get(random.nextInt(ksiazkaList.size())));
            new Recenzja("5", 5, "5").setKontoIKsiazka(kontoList.get(random.nextInt(kontoList.size())), ksiazkaList.get(random.nextInt(ksiazkaList.size())));

            zestawKsiazek.clear();
            for (int i = 0; i < random.nextInt() % 10; i++) {
                zestawKsiazek.add(ksiazkaList.get(random.nextInt(ksiazkaList.size())));
            }
            new Seria("LOTR", zestawKsiazek);
            zestawKsiazek.clear();
            for (int i = 0; i < random.nextInt() % 10; i++) {
                zestawKsiazek.add(ksiazkaList.get(random.nextInt(ksiazkaList.size())));
            }
            new Seria("Star Wars: Clone Wars", zestawKsiazek);
            zestawKsiazek.clear();
            for (int i = 0; i < random.nextInt() % 10; i++) {
                zestawKsiazek.add(ksiazkaList.get(random.nextInt(ksiazkaList.size())));
            }
            new Seria("Warriors", zestawKsiazek);
            zestawKsiazek.clear();
            for (int i = 0; i < random.nextInt() % 10; i++) {
                zestawKsiazek.add(ksiazkaList.get(random.nextInt(ksiazkaList.size())));
            }
            new Seria("Harry Potter", zestawKsiazek);
            zestawKsiazek.clear();
            for (int i = 0; i < random.nextInt() % 10; i++) {
                zestawKsiazek.add(ksiazkaList.get(random.nextInt(ksiazkaList.size())));
            }
            new Seria("50 Shades of Grey", zestawKsiazek);

            new SprzedanaKsiazka("Przemyślenia geniusza", "Stara Księgarnia", "Amadeusz Mozart", 49, false, null, "1108940542383", 1, random.nextInt(), dataList.get(random.nextInt(dataList.size())));
            new SprzedanaKsiazka("How to became Hockey Pro", "NHL Canada", "Weyne Gretzky", 99, true, promocjaList.get(random.nextInt(promocjaList.size())), "3342358344203", 5, random.nextInt(), dataList.get(random.nextInt(dataList.size())));
            new SprzedanaKsiazka("Best poems of this Millenia", "History poems", "Oliver Wilde", 19, true, promocjaList.get(random.nextInt(promocjaList.size())), "5546648712111", 55, random.nextInt(), dataList.get(random.nextInt(dataList.size())));
            new SprzedanaKsiazka("101 Chess", "Chess World", "Magnus Carlsen", 9, false, null, "7768444367009", 100, random.nextInt(), dataList.get(random.nextInt(dataList.size())));
            new SprzedanaKsiazka("How Snooker rules make no sense.", "Snooker GB", "Ronnie o'Sollivan", 10, false, null, "1132135634518", 1000, random.nextInt(), dataList.get(random.nextInt(dataList.size())));

            Iterator<SprzedanaKsiazka> sprzedanaKsiazkaIterator = ObjectPlus.getExtent(SprzedanaKsiazka.class).iterator();
            List<SprzedanaKsiazka> sprzedanaKsiazkaList = new ArrayList<>();
            sprzedanaKsiazkaIterator.forEachRemaining(sprzedanaKsiazkaList::add);
            //sprzedanaKsiazkaList.get(random.nextInt(sprzedanaKsiazkaList.size()))

            zestawKsiazek.clear();
            for (int i = 0; i < random.nextInt() % 10; i++) {
                zestawKsiazek.add(ksiazkaList.get(random.nextInt(ksiazkaList.size())));
            }
            new Wystawa("Noc Horrorow", "Sposrod najwybitniejszych tytulow z garunku horror, jestem zaszczycony aby przedstawic Panstwu wybrane przeze mnie, szczegolnie na te okazje, jedne z najwybitniejszych ksiazek tego roku.", zestawKsiazek);
            zestawKsiazek.clear();
            for (int i = 0; i < random.nextInt() % 10; i++) {
                zestawKsiazek.add(ksiazkaList.get(random.nextInt(ksiazkaList.size())));
            }
            new Wystawa("Patrzac na zachod...", "Kolekcja ta jest specjalnie wybrana kolekcja ksiazek o genezie zachodniej.", zestawKsiazek);
            zestawKsiazek.clear();
            for (int i = 0; i < random.nextInt() % 10; i++) {
                zestawKsiazek.add(ksiazkaList.get(random.nextInt(ksiazkaList.size())));
            }
            new Wystawa("Niespotykane historie", "Kolekcja najbardziej szczegolowych ksiazek historycznych.", zestawKsiazek);

            sprzedanaKsiazka.clear();
            for (int i = 0; i < random.nextInt() % 10; i++) {
                sprzedanaKsiazka.add(sprzedanaKsiazkaList.get(random.nextInt(sprzedanaKsiazkaList.size())));
            }
            new Zamowienie(random.nextInt(), "Adres 1", 123112233, Zamowienie.enumMetodaPlatnosci.KARTA, Zamowienie.enumStatus.W_REALIZACJI).addSoldBook(sprzedanaKsiazka);
            sprzedanaKsiazka.clear();
            for (int i = 0; i < random.nextInt() % 10; i++) {
                sprzedanaKsiazka.add(sprzedanaKsiazkaList.get(random.nextInt(sprzedanaKsiazkaList.size())));
            }
            new Zamowienie(random.nextInt(), "Adres 2", 123123111, Zamowienie.enumMetodaPlatnosci.KOD_PROMOCYJNY, Zamowienie.enumStatus.ANULOWANY).addSoldBook(sprzedanaKsiazka);
            new Zamowienie(random.nextInt(), "Adres 3", 321321321, Zamowienie.enumMetodaPlatnosci.KARTA, Zamowienie.enumStatus.ANULOWANY).addSoldBook(sprzedanaKsiazkaList.get(random.nextInt(sprzedanaKsiazkaList.size())));
            new Zamowienie(random.nextInt(), "Adres 4", 123123123, Zamowienie.enumMetodaPlatnosci.GOTOWKA, Zamowienie.enumStatus.ZREALIZOWANY).addSoldBook(sprzedanaKsiazkaList.get(random.nextInt(sprzedanaKsiazkaList.size())));
            new Zamowienie(random.nextInt(), "Adres 5", 111222333, Zamowienie.enumMetodaPlatnosci.KARTA, Zamowienie.enumStatus.W_REALIZACJI).addSoldBook(sprzedanaKsiazkaList.get(random.nextInt(sprzedanaKsiazkaList.size())));


            ksiazkaList.get(random.nextInt(ksiazkaList.size())).addLink("wystawa","ksiazka",ObjectPlus.getExtent(Wystawa.class).iterator().next());

            ObjectPlus.getExtent(Zamowienie.class).iterator().next().addLink("sprzedanaKsiazka","zamowienie",ObjectPlus.getExtent(SprzedanaKsiazka.class).iterator().next(),ObjectPlus.getExtent(SprzedanaKsiazka.class).iterator().next().getID());



        try
        {
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

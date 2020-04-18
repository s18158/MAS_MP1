package MP1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Zamowienie extends ObjectPlus {

    enum enumMetodaPlatnosci { KARTA, GOTOWKA, KOD_PROMOCYJNY}
    enum enumStatus { W_REALIZACJI, ZREALIZOWANY, ANULOWANY}

    private int ID;
    private String adres;
    private int numerTelefonu;
    private enumMetodaPlatnosci metodaPlatnosci;
    private enumStatus status;
    private Set<SprzedanaKsiazka> zamowioneKsiazki = new HashSet<>();

    Zamowienie(int ID,
               String adres,
               int numerTelefonu,
               enumMetodaPlatnosci metodaPlatnosci,
               enumStatus status){
        super();
        this.ID = ID;
        this.adres = adres;
        this.numerTelefonu = numerTelefonu;
        this.metodaPlatnosci = metodaPlatnosci;
        this.status = status;
        sprawdzCzyNumerTelefonuJestPoprawny(numerTelefonu);
    }

    public void addSoldBook(SprzedanaKsiazka sk){
        zamowioneKsiazki.add(sk);
    }

    public void addSoldBook(Set<SprzedanaKsiazka> sk){
        zamowioneKsiazki.addAll(sk);
    }

    public Set<SprzedanaKsiazka> getZamowioneKsiazki() {
        return zamowioneKsiazki;
    }

    private void sprawdzCzyNumerTelefonuJestPoprawny(int i){
        try{
            if (String.valueOf(i).length()!=9){throw new validPhoneNumerException();}
        } catch (validPhoneNumerException e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) throws  ClassNotFoundException {
        Iterator<SprzedanaKsiazka> sprzedanaKsiazkaIterator = ObjectPlus.getExtent(SprzedanaKsiazka.class).iterator();
        Set<SprzedanaKsiazka> sprzedanaKsiazka = new HashSet<>();
        Random random = new Random();
        sprzedanaKsiazka.clear();
        for (int i=0; i< random.nextInt()%10; i++){
            sprzedanaKsiazka.add(sprzedanaKsiazkaIterator.next());
        }
        new Zamowienie(random.nextInt(),"Adres 1",123112233,enumMetodaPlatnosci.KARTA,enumStatus.W_REALIZACJI).addSoldBook(sprzedanaKsiazka);
        sprzedanaKsiazka.clear();
        for (int i=0; i< random.nextInt()%10; i++){
            sprzedanaKsiazka.add(sprzedanaKsiazkaIterator.next());
        }
        new Zamowienie(random.nextInt(),"Adres 2",123123111,enumMetodaPlatnosci.KOD_PROMOCYJNY,enumStatus.ANULOWANY).addSoldBook(sprzedanaKsiazka);
        new Zamowienie(random.nextInt(),"Adres 3",321321321,enumMetodaPlatnosci.KARTA,enumStatus.ANULOWANY).addSoldBook(sprzedanaKsiazkaIterator.next());
        new Zamowienie(random.nextInt(),"Adres 4",123123123,enumMetodaPlatnosci.GOTOWKA,enumStatus.ZREALIZOWANY).addSoldBook(sprzedanaKsiazkaIterator.next());
        new Zamowienie(random.nextInt(),"Adres 5",111222333,enumMetodaPlatnosci.KARTA,enumStatus.W_REALIZACJI).addSoldBook(sprzedanaKsiazkaIterator.next());

    }
}

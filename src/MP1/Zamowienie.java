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
               enumStatus status) throws inputException, validPhoneNumerException{
        super();
        if ( ID == 0 ){throw new inputException();}
        this.ID = ID;
        if ( adres == null ){throw new NullPointerException();}
        this.adres = adres;
        if (String.valueOf(numerTelefonu).length()!=9){throw new validPhoneNumerException();}
        this.numerTelefonu = numerTelefonu;
        if ( metodaPlatnosci == null ){throw new NullPointerException();}
        this.metodaPlatnosci = metodaPlatnosci;
        if ( status == null ){throw new NullPointerException();}
        this.status = status;
    }

    public void addSoldBook(SprzedanaKsiazka sk){
        zamowioneKsiazki.add(sk);
    }

    public void addSoldBook(Set<SprzedanaKsiazka> sk){
        zamowioneKsiazki.addAll(sk);
    }

    public static void main(String[] args) throws  ClassNotFoundException, inputException, validPhoneNumerException {
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

    public int getID() {
        return ID;
    }

    public void setID(int ID) throws inputException{
        if ( ID == 0 ){throw new inputException();}
        this.ID = ID;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        if ( adres == null ){throw new NullPointerException();}
        this.adres = adres;
    }

    public int getNumerTelefonu() {
        return numerTelefonu;
    }

    public void setNumerTelefonu(int numerTelefonu) throws validPhoneNumerException{
        if (String.valueOf(numerTelefonu).length()!=9){throw new validPhoneNumerException();}
        this.numerTelefonu = numerTelefonu;
    }

    public enumMetodaPlatnosci getMetodaPlatnosci() {
        return metodaPlatnosci;
    }

    public void setMetodaPlatnosci(enumMetodaPlatnosci metodaPlatnosci) {
        if ( metodaPlatnosci == null ){throw new NullPointerException();}
        this.metodaPlatnosci = metodaPlatnosci;
    }

    public enumStatus getStatus() {
        return status;
    }

    public void setStatus(enumStatus status) {
        if ( status == null ){throw new NullPointerException();}
        this.status = status;
    }

    public Set<SprzedanaKsiazka> getZamowioneKsiazki() {
        return zamowioneKsiazki;
    }

    public void setZamowioneKsiazki(Set<SprzedanaKsiazka> zamowioneKsiazki) {

        this.zamowioneKsiazki = zamowioneKsiazki;
    }
}

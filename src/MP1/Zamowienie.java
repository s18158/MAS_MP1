package MP1;

import java.util.HashSet;
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

package MP1;

import java.util.Iterator;
import java.util.Random;

public class Pracownik extends Konto {

    enum Stopien {DYREKTOR, MENAGER, ADMINISTRATOR, KIEROWNIK_GRUPY, PRACOWNIK}

    private int IDPracownika;
    private Stopien stopienWFirmie;
    private String mailSluzbowy;
    private int firmowyNrTelefonu;

    Pracownik(int ID,
              String imie,
              String nazwisko,
              String mail,
              Data dataUrodzenia,
              int numerTelefonu,
              String login,
              String haslo,
              int IDPracownika,
              Stopien stopienWFirmie,
              String mailSluzbowy,
              int firmowyNrTelefonu) throws validPhoneNumerException, inputException {
        super(ID, imie, nazwisko, mail, dataUrodzenia, numerTelefonu, login, haslo);
        if (IDPracownika == 0) { throw new inputException("ID Pracownika nie może być puste.");}
        this.IDPracownika = IDPracownika;
        if (stopienWFirmie == null) { throw new NullPointerException("Stopien nie może być pusty.");}
        this.stopienWFirmie = stopienWFirmie;
        if (mailSluzbowy == null) { throw new NullPointerException("Mail nie możeby być pusty.");}
        this.mailSluzbowy = mailSluzbowy;
        if (firmowyNrTelefonu == 0) { throw new inputException("Firmowy nr telefonu nie moze byc pusty.");}
        this.firmowyNrTelefonu = firmowyNrTelefonu;
    }

    public int getIDPracownika() {
        return IDPracownika;
    }

    public void setIDPracownika(int IDPracownika) throws inputException{
        if (IDPracownika == 0) { throw new inputException("ID Pracownika nie może być puste.");}
        this.IDPracownika = IDPracownika;
    }

    public Stopien getStopienWFirmie() {
        return stopienWFirmie;
    }

    public void setStopienWFirmie(Stopien stopienWFirmie) {
        if (stopienWFirmie == null) { throw new NullPointerException("Stopien nie może być pusty.");}
        this.stopienWFirmie = stopienWFirmie;
    }

    public String getMailSluzbowy() {
        return mailSluzbowy;
    }

    public void setMailSluzbowy(String mailSluzbowy) {
        if (mailSluzbowy == null) { throw new NullPointerException("Mail nie możeby być pusty.");}
        this.mailSluzbowy = mailSluzbowy;
    }

    public int getFirmowyNrTelefonu() {
        return firmowyNrTelefonu;
    }

    public void setFirmowyNrTelefonu(int firmowyNrTelefonu) throws inputException {
        if (firmowyNrTelefonu == 0) { throw new inputException("Firmowy nr telefonu nie moze byc pusty.");}
        this.firmowyNrTelefonu = firmowyNrTelefonu;
    }
}

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

    public static void main(String[] args) throws ClassNotFoundException,NullPointerException, inputException, validPhoneNumerException {
        Iterator<Data> dataIterator = ObjectPlus.getExtent(Data.class).iterator();
        Random random = new Random();
        new Pracownik(random.nextInt(),"Marta","Martowska","mm1@gmail.com",dataIterator.next(),123123123,"1","1",random.nextInt(),Stopien.ADMINISTRATOR,"sm1@gmail.com",123123123);
        new Pracownik(random.nextInt(),"Marcin","Marciniuk","mm2@gmail.com",dataIterator.next(),123123111,"2","2",random.nextInt(),Stopien.DYREKTOR,"sm2@gmail.com",123123111);
        new Pracownik(random.nextInt(),"Mariusz","Mariuszewski","mm3@gmail.com",dataIterator.next(),123112233,"3","3",random.nextInt(),Stopien.KIEROWNIK_GRUPY,"sm3@gmail.com",123112233);
        new Pracownik(random.nextInt(),"Maciek","Maciejewski","mm4@gmail.com",dataIterator.next(),123332211,"4","4",random.nextInt(),Stopien.MENAGER,"sm4@gmail.com",123332211);
        new Pracownik(random.nextInt(),"Mateusz","Mateuszczyk","mm5@gmail.com", dataIterator.next(),123123321,"5","5",random.nextInt(),Stopien.PRACOWNIK,"sm5@gmail.com",123123321);
    }

    public int getIDPracownika() {
        return IDPracownika;
    }

    public void setIDPracownika(int IDPracownika) {
        this.IDPracownika = IDPracownika;
    }

    public Stopien getStopienWFirmie() {
        return stopienWFirmie;
    }

    public void setStopienWFirmie(Stopien stopienWFirmie) {
        this.stopienWFirmie = stopienWFirmie;
    }

    public String getMailSluzbowy() {
        return mailSluzbowy;
    }

    public void setMailSluzbowy(String mailSluzbowy) {
        this.mailSluzbowy = mailSluzbowy;
    }

    public int getFirmowyNrTelefonu() {
        return firmowyNrTelefonu;
    }

    public void setFirmowyNrTelefonu(int firmowyNrTelefonu) {
        this.firmowyNrTelefonu = firmowyNrTelefonu;
    }
}

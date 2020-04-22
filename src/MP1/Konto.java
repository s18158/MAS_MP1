package MP1;

import java.util.Iterator;
import java.util.Random;

public class Konto extends ObjectPlus {

    private int ID;
    private String imie;
    private String nazwisko;
    private String mail;
    private Data dataUrodzenia;
    private Data dataUtworzeniaKonta;//atrybut wyliczalny
    private int numerTelefonu;
    private String login;
    private String haslo;//pozniej dodam hashowanie

    Konto(int ID,
          String imie,
          String nazwisko,
          String mail,
          Data dataUrodzenia,
          int numerTelefonu,
          String login,
          String haslo) throws validPhoneNumerException, inputException{
        super();
        if (ID == 0 ) {throw new inputException("ID nie moze byc puste.");}
        this.ID = ID;
        if (imie == null ){throw new NullPointerException("Okno Imię nie może być puste.");}
        this.imie = imie;
        if (nazwisko == null ){throw new NullPointerException("Okno Nazwisko nie może być puste.");}
        this.nazwisko = nazwisko;
        if (mail == null ){throw new NullPointerException("Mail nie może być pusty.");}
        this.mail = mail;
        this.dataUrodzenia = dataUrodzenia;
        if (String.valueOf(numerTelefonu).length()!=9){throw new validPhoneNumerException();}
        this.numerTelefonu = numerTelefonu;
        if (login == null ){throw new NullPointerException("Login nie może być pusty.");}
        this.login = login;
        if (haslo == null ){throw new NullPointerException("Hasło nie może być puste.");}
        this.haslo = haslo;
    }

    public static void main(String[] args) throws ClassNotFoundException, validPhoneNumerException, inputException {
        Iterator<Data> dataIterator = ObjectPlus.getExtent(Data.class).iterator();
        Random random = new Random();
        new Konto(random.nextInt(),"Marta","Martowska","mm1@gmail.com",dataIterator.next(),123123123,"1","1");
        new Konto(random.nextInt(),"Marcin","Marciniuk","mm2@gmail.com",dataIterator.next(),123123111,"2","2");
        new Konto(random.nextInt(),"Mariusz","Mariuszewski","mm3@gmail.com",dataIterator.next(),123112233,"3","3");
        new Konto(random.nextInt(),"Maciek","Maciejewski","mm4@gmail.com",dataIterator.next(),123332211,"4","4");
        new Konto(random.nextInt(),"Mateusz","Mateuszczyk","mm5@gmail.com", dataIterator.next(),123123321,"5","5");
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Data getDataUrodzenia() {
        return dataUrodzenia;
    }

    public void setDataUrodzenia(Data dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
    }

    public Data getDataUtworzeniaKonta() {
        return dataUtworzeniaKonta;
    }

    public void setDataUtworzeniaKonta(Data dataUtworzeniaKonta) throws inputException{
        if (dataUtworzeniaKonta == null ){throw new inputException();}
        this.dataUtworzeniaKonta = dataUtworzeniaKonta;
    }

    public int getNumerTelefonu() {
        return numerTelefonu;
    }

    public void setNumerTelefonu(int numerTelefonu) {
        this.numerTelefonu = numerTelefonu;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getHaslo() {
        return haslo;
    }

    public void setHaslo(String haslo) {
        this.haslo = haslo;
    }
}

package MP1;

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
        if (dataUrodzenia == null ){throw new NullPointerException("Data utowrzenia konta nie może być pusta.");}
        this.dataUrodzenia = dataUrodzenia;
        if (String.valueOf(numerTelefonu).length()!=9){throw new validPhoneNumerException();}
        this.numerTelefonu = numerTelefonu;
        if (login == null ){throw new NullPointerException("Login nie może być pusty.");}
        this.login = login;
        if (haslo == null ){throw new NullPointerException("Hasło nie może być puste.");}
        this.haslo = haslo;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) throws inputException{
        if (ID == 0 ) {throw new inputException("ID nie moze byc puste.");}
        this.ID = ID;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        if (imie == null ){throw new NullPointerException("Okno Imię nie może być puste.");}
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        if (nazwisko == null ){throw new NullPointerException("Okno Nazwisko nie może być puste.");}
        this.nazwisko = nazwisko;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        if (mail == null ){throw new NullPointerException("Mail nie może być pusty.");}
        this.mail = mail;
    }

    public Data getDataUrodzenia() {
        return dataUrodzenia;
    }

    public void setDataUrodzenia(Data dataUrodzenia) {
        if (dataUrodzenia == null ){throw new NullPointerException("Data utowrzenia konta nie może być pusta.");}
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

    public void setNumerTelefonu(int numerTelefonu) throws validPhoneNumerException{
        if (String.valueOf(numerTelefonu).length()!=9){throw new validPhoneNumerException();}
        this.numerTelefonu = numerTelefonu;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        if (login == null ){throw new NullPointerException("Login nie może być pusty.");}
        this.login = login;
    }

    public String getHaslo() {
        return haslo;
    }

    public void setHaslo(String haslo) {
        if (haslo == null ){throw new NullPointerException("Hasło nie może być puste.");}
        this.haslo = haslo;
    }
}

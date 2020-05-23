package MP1;

public class Klient extends Konto {

    private int IDKlienta;
    private long numerKontaBankowego;

    Klient(int ID,
          String imie,
          String nazwisko,
          String mail,
          Data dataUrodzenia,
          int numerTelefonu,
          String login,
          String haslo,
          int IDKlienta,
          long numerKontaBankowego) throws validPhoneNumerException, inputException{
        super(ID, imie, nazwisko, mail, dataUrodzenia, numerTelefonu, login, haslo);
        if (IDKlienta == 0 ){throw new NullPointerException("ID Klienta nie może być puste.");}
        this.IDKlienta = IDKlienta;
        if (numerKontaBankowego == 0 ){throw new NullPointerException("Numer konta bankowego nie może być pusty.");}
        this.numerKontaBankowego = numerKontaBankowego;
    }

    public int getIDKlienta() {
        return IDKlienta;
    }

    public void setIDKlienta(int IDKlienta) {
        if (IDKlienta == 0 ){throw new NullPointerException("ID Klienta nie może być puste.");}
        this.IDKlienta = IDKlienta;
    }

    public long getNumerKontaBankowego() {
        return numerKontaBankowego;
    }

    public void setNumerKontaBankowego(long numerKontaBankowego) {
        if (numerKontaBankowego == 0 ){throw new NullPointerException("Numer konta bankowego nie może być pusty.");}
        this.numerKontaBankowego = numerKontaBankowego;
    }
}

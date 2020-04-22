package MP1;

import java.util.Iterator;
import java.util.Random;

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

    public static void main(String[] args) throws ClassNotFoundException, NullPointerException, validPhoneNumerException, inputException {
        Iterator<Data> dataIterator = ObjectPlus.getExtent(Data.class).iterator();
        Random random = new Random();
        new Klient(random.nextInt(),"Marta","Martowska","mm1@gmail.com",dataIterator.next(),123123123,"1","1",random.nextInt(),random.nextLong());
        new Klient(random.nextInt(),"Marcin","Marciniuk","mm2@gmail.com",dataIterator.next(),123123111,"2","2",random.nextInt(),random.nextLong());
        new Klient(random.nextInt(),"Mariusz","Mariuszewski","mm3@gmail.com",dataIterator.next(),123112233,"3","3",random.nextInt(),random.nextLong());
        new Klient(random.nextInt(),"Maciek","Maciejewski","mm4@gmail.com",dataIterator.next(),123332211,"4","4",random.nextInt(),random.nextLong());
        new Klient(random.nextInt(),"Mateusz","Mateuszczyk","mm5@gmail.com", dataIterator.next(),123123321,"5","5",random.nextInt(),random.nextLong());
    }

    public int getIDKlienta() {
        return IDKlienta;
    }

    public void setIDKlienta(int IDKlienta) {
        this.IDKlienta = IDKlienta;
    }

    public long getNumerKontaBankowego() {
        return numerKontaBankowego;
    }

    public void setNumerKontaBankowego(long numerKontaBankowego) {
        this.numerKontaBankowego = numerKontaBankowego;
    }
}

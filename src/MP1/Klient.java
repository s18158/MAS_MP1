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
          Data dataUtworzeniaKonta,
          int numerTelefonu,
          String login,
          String haslo,
          int IDKlienta,
          long numerKontaBankowego){
        super(ID, imie, nazwisko, mail, dataUrodzenia, dataUtworzeniaKonta, numerTelefonu, login, haslo);
        this.IDKlienta = IDKlienta;
        this.numerKontaBankowego = numerKontaBankowego;
    }

    public static void main(String[] args) throws ClassNotFoundException {
        Iterator<Data> dataIterator = ObjectPlus.getExtent(Data.class).iterator();
        Random random = new Random();
        new Pracownik(random.nextInt(),"Marta","Martowska","mm1@gmail.com",dataIterator.next(),dataIterator.next(),123123123,"1","1",random.nextInt(),random.nextLong());
        new Pracownik(random.nextInt(),"Marcin","Marciniuk","mm2@gmail.com",dataIterator.next(),dataIterator.next(),123123111,"2","2",random.nextInt(),random.nextLong());
        new Pracownik(random.nextInt(),"Mariusz","Mariuszewski","mm3@gmail.com",dataIterator.next(),dataIterator.next(),123112233,"3","3",random.nextInt(),random.nextLong());
        new Pracownik(random.nextInt(),"Maciek","Maciejewski","mm4@gmail.com",dataIterator.next(),dataIterator.next(),123332211,"4","4",random.nextInt(),random.nextLong());
        new Pracownik(random.nextInt(),"Mateusz","Mateuszczyk","mm5@gmail.com", dataIterator.next(), dataIterator.next(),123123321,"5","5",random.nextInt(),random.nextLong());
    }
}
package MP1;

import java.util.Iterator;
import java.util.Random;

public class Pracownik extends Konto {

    enum Stopien {DYREKTOR, MENAGER, ADMINISTRATOR, KIEROWNIK_GRUPY, PRACOWNIK}

    private int IDPracownika;
    private Stopien stopienWFirmie;
    private String mailSluzbowy;
    private int numerTelefonuSluzbowy;
    private int firmowyNrTelefonu;

    Pracownik(int ID,
              String imie,
              String nazwisko,
              String mail,
              Data dataUrodzenia,
              Data dataUtworzeniaKonta,
              int numerTelefonu,
              String login,
              String haslo,
              int IDPracownika,
              Stopien stopienWFirmie,
              String mailSluzbowy,
              int numerTelefonuSluzbowy,
              int firmowyNrTelefonu){
        super(ID, imie, nazwisko, mail, dataUrodzenia, dataUtworzeniaKonta, numerTelefonu, login, haslo);
        this.IDPracownika = IDPracownika;
        this.stopienWFirmie = stopienWFirmie;
        this.mailSluzbowy = mailSluzbowy;
        this.numerTelefonuSluzbowy = numerTelefonuSluzbowy;
        this.firmowyNrTelefonu = firmowyNrTelefonu;
    }

    public static void main(String[] args) throws ClassNotFoundException {
        Iterator<Data> dataIterator = ObjectPlus.getExtent(Data.class).iterator();
        Random random = new Random();
        new Pracownik(random.nextInt(),"Marta","Martowska","mm1@gmail.com",dataIterator.next(),dataIterator.next(),123123123,"1","1",random.nextInt(),Stopien.ADMINISTRATOR,"sm1@gmail.com",123123123,random.nextInt());
        new Pracownik(random.nextInt(),"Marcin","Marciniuk","mm2@gmail.com",dataIterator.next(),dataIterator.next(),123123111,"2","2",random.nextInt(),Stopien.DYREKTOR,"sm2@gmail.com",123123111,random.nextInt());
        new Pracownik(random.nextInt(),"Mariusz","Mariuszewski","mm3@gmail.com",dataIterator.next(),dataIterator.next(),123112233,"3","3",random.nextInt(),Stopien.KIEROWNIK_GRUPY,"sm3@gmail.com",123112233,random.nextInt());
        new Pracownik(random.nextInt(),"Maciek","Maciejewski","mm4@gmail.com",dataIterator.next(),dataIterator.next(),123332211,"4","4",random.nextInt(),Stopien.MENAGER,"sm4@gmail.com",123332211,random.nextInt());
        new Pracownik(random.nextInt(),"Mateusz","Mateuszczyk","mm5@gmail.com", dataIterator.next(), dataIterator.next(),123123321,"5","5",random.nextInt(),Stopien.PRACOWNIK,"sm5@gmail.com",123123321,random.nextInt());
    }
}

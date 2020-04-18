package MP1;

import java.util.Iterator;
import java.util.Random;

public class Konto extends ObjectPlus {

    private int ID;
    private String imie;
    private String nazwisko;
    private String mail;
    private Data dataUrodzenia;
    private Data dataUtworzeniaKonta;
    private int numerTelefonu;
    private String login;
    private String haslo;//pozniej dodam hashowanie

    Konto(int ID,
          String imie,
          String nazwisko,
          String mail,
          Data dataUrodzenia,
          Data dataUtworzeniaKonta,
          int numerTelefonu,
          String login,
          String haslo){
        super();
        this.ID = ID;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.mail = mail;
        this.dataUrodzenia = dataUrodzenia;
        this.dataUtworzeniaKonta = dataUtworzeniaKonta;
        this.numerTelefonu = numerTelefonu;
        this.login = login;
        this.haslo = haslo;
        sprawdzCzyNumerTelefonuJestPoprawny(numerTelefonu);
    }

    private void sprawdzCzyNumerTelefonuJestPoprawny(int i){
        try{
            if (String.valueOf(i).length()!=9){throw new validPhoneNumerException();}
        } catch (validPhoneNumerException e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) throws ClassNotFoundException {
        Iterator<Data> dataIterator = ObjectPlus.getExtent(Data.class).iterator();
        Random random = new Random();
        new Konto(random.nextInt(),"Marta","Martowska","mm1@gmail.com",dataIterator.next(),dataIterator.next(),123123123,"1","1");
        new Konto(random.nextInt(),"Marcin","Marciniuk","mm2@gmail.com",dataIterator.next(),dataIterator.next(),123123111,"2","2");
        new Konto(random.nextInt(),"Mariusz","Mariuszewski","mm3@gmail.com",dataIterator.next(),dataIterator.next(),123112233,"3","3");
        new Konto(random.nextInt(),"Maciek","Maciejewski","mm4@gmail.com",dataIterator.next(),dataIterator.next(),123332211,"4","4");
        new Konto(random.nextInt(),"Mateusz","Mateuszczyk","mm5@gmail.com", dataIterator.next(), dataIterator.next(),123123321,"5","5");
    }
}

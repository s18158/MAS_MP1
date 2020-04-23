package MP1;

public class validPhoneNumerException extends Exception{
    validPhoneNumerException(){
        super("Numer telefonu niepoprawny.");
    }
    validPhoneNumerException(String s) {
        super(s);
    }
}

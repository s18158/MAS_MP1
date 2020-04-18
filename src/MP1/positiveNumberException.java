package MP1;

@SuppressWarnings("unused")
class positiveNumberException extends Exception {
    positiveNumberException(){
        super("Liczba musi byc dodatnia.");
    }
    positiveNumberException(String s){
        super(s);
    }
}

package MP1;

@SuppressWarnings("unused")
class notISBNException extends Exception{
    notISBNException(){
        super("Podana wartosc musi byc numerem ISBN");
    }
    notISBNException(String s){
        super(s);
    }
}

package MP1;

@SuppressWarnings("unused")
class onlyOneKindOfSaleException extends Exception{
    onlyOneKindOfSaleException(){
        super("Tylko jeden rodzja rabatu.");
    }
    onlyOneKindOfSaleException(String s){
        super(s);
    }
}

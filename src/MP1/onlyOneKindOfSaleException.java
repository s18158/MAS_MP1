package MP1;

class onlyOneKindOfSaleException extends Exception{
    onlyOneKindOfSaleException(){
        super("Tylko jeden rodzja rabatu.");
    }
    onlyOneKindOfSaleException(String s){
        super(s);
    }
}

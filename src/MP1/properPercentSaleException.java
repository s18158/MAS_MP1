package MP1;

class properPercentSaleException extends Exception{
    properPercentSaleException() {
        super("Niepoprawna wartość rabatu");
    }

    properPercentSaleException(String s) {
        super(s);
    }
}

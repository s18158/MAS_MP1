package MP1;

@SuppressWarnings("unused")
class properPercentSaleException extends Exception{
    properPercentSaleException() {
        super("Niepoprawna wartość rabatu");
    }

    properPercentSaleException(String s) {
        super(s);
    }
}

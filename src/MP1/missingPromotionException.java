package MP1;

class missingPromotionException extends Exception {
    missingPromotionException(){
        super("Brakuje promocji.");
    }
    missingPromotionException(String s) {
        super(s);
    }
}

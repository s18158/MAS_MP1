package MP1;

@SuppressWarnings("unused")
class missingPromotionException extends Exception {
    missingPromotionException(){
        super("Brakuje promocji.");
    }
    missingPromotionException(String s) {
        super(s);
    }
}

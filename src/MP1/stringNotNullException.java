package MP1;

@SuppressWarnings("unused")
class stringNotNullException extends Exception {
    stringNotNullException() {
        super("Podany tekst nie moze byc pusty");
    }

    stringNotNullException(String s) {
        super(s);
    }
}

package MP1;

@SuppressWarnings("unused")
class notProperDataException extends Exception {
    notProperDataException() {
        super("Niepoprawna data.");
    }

    notProperDataException(String s) {
        super(s);
    }
}
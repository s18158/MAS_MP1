package MP1;

public class inputException extends Exception {
    inputException(){
        super("Problem with input.");
    }
    inputException(String s) {
        super(s);
    }
}

package instruments;

/**
 * Trows if something is empty, but must not be
 */

class IncorrectDataException extends Exception {
    public IncorrectDataException(){
        super("Incorrect Data");
    }
}

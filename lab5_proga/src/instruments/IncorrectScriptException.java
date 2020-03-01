package instruments;

/**
 * Trows if script has some problems
 */

class IncorrectScriptException extends Exception {
    public IncorrectScriptException(){
        super("Incorrect script");
    }
}

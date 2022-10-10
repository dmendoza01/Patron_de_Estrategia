package patron.strategy.excepciones;

// Excepcion para polígonos que no existen.
public class PoligonoNoExisteException extends Exception {

    public PoligonoNoExisteException() {
        super("El Polígono NO Existe.");
    }

    public PoligonoNoExisteException(String string) {
        super(string);
    }
    
}


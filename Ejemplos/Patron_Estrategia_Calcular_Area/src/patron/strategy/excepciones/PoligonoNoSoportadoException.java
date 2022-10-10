package patron.strategy.excepciones;

// Excepción para poligonos irregulares.
public class PoligonoNoSoportadoException extends Exception {

    // Constructor.
    public PoligonoNoSoportadoException() {
        super("No se ha Formulado Algún Algoritmo para este Polígono.");
    }
}


package patron.strategy.excepciones;

// Excepción de constructor incorrecto.
public class ConstructorIncorrectoException extends Exception {

    public ConstructorIncorrectoException() {
        super("El constructor Utilizado NO se Corresponde con la Figura");
    }

}

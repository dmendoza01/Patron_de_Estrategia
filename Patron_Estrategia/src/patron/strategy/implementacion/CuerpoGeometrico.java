package patron.strategy.implementacion;

import patron.strategy.clases.derivadas.AreaCirculo;
import patron.strategy.clases.derivadas.AreaPoligonoRegular;
import patron.strategy.clases.derivadas.AreaRectangulo;
import patron.strategy.clases.derivadas.AreaTriangulo;
import patron.strategy.excepciones.ConstructorIncorrectoException;
import patron.strategy.excepciones.PoligonoNoExisteException;
import patron.strategy.excepciones.PoligonoNoSoportadoException;
import patron.strategy.interfaces.IArea;

// Clase que implementa el patrón y que decidirá la estrategia a aplicar.

public class CuerpoGeometrico {

    private IArea figura;
    private final float radio;
    private final int lados;
    private final float base;
    private final float altura;

    /** Constructor para polígonos regulares.
     * @param radio float longitud del radio.
     * @param lados int numero de lados.
     * @throws ConstructorIncorrectoException excepcion de constructor
     * incorrecto.
     */
    public CuerpoGeometrico(float radio, int lados) throws
            ConstructorIncorrectoException {
        if(lados<5)
            throw new ConstructorIncorrectoException();
        this.radio = radio;
        this.lados = lados;
        this.base = 0;
        this.altura = 0;
    }

    /** Constructor para un círculo.
     * @param radio float longitud del radio.
     */
    public CuerpoGeometrico(float radio) {
        this.radio = radio;
        this.lados = (int) Float.POSITIVE_INFINITY;
        this.base = 0;
        this.altura = 0;
    }

    /** Constructor para un triángulo o rectángulo.
     * @param base float longitud de la base.
     * @param altura float longitud de la altura.
     * @param lados int número de lados.
     */
    public CuerpoGeometrico(float base, float altura, int lados) {
        this.radio = 0;
        this.lados = lados;
        this.base = base;
        this.altura = altura;
    }

    /** Se establece la estrategia a desarrollar, en función de los
     * parametros establecidos.
     * @throws PoligonoNoExisteException, si no existe el polígono.
     * @throws PoligonoNoSoportadoException, si no existe algoritmo.
     */
    public void establecerTipo() throws PoligonoNoExisteException,
            PoligonoNoSoportadoException {
        if (esCirculo())
            figura = new AreaCirculo(radio);
        else if (esTriangulo())
            figura = new AreaTriangulo(base, altura);
        else if (esRectangulo())
            figura = new AreaRectangulo(base, altura);
        else if (esPoligonoRegular())
            figura = new AreaPoligonoRegular(lados, radio);
        else if (lados<=2)
            throw new PoligonoNoExisteException();
        else
            throw new PoligonoNoSoportadoException();
    }

    // Método que realiza el cálculo y devuelve un mensaje respectivo.
    public String obtenerResultado() {
        return figura.getResultado();
    }

    private boolean esCirculo() {
        return lados==(int)Float.POSITIVE_INFINITY && radio>0;
    }

    private boolean esPoligonoRegular() {
        return radio>=0 && lados>=5;
    }

    private boolean esTriangulo() {
        return base>0 && altura>0 && lados==3;
    }

    private boolean esRectangulo() {
        return base>0 && altura>0 && lados==4;
    }

}


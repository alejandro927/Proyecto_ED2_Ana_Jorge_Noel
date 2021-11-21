package proyecto_edd2_ana_noel_jorge;

/**
 *
 * @author aleja
 */
public class Pair<T, U> {
    T primero;
    U segundo;

    public Pair(T primero, U segundo) {
        this.primero = primero;
        this.segundo = segundo;
    }
    
    public T getPrimero() {
        return primero;
    }

    public void setPrimero(T primero) {
        this.primero = primero;
    }

    public U getSegundo() {
        return segundo;
    }

    public void setSegundo(U segundo) {
        this.segundo = segundo;
    }
}

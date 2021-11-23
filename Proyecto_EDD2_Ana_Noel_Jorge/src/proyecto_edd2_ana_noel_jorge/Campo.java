package proyecto_edd2_ana_noel_jorge;
import java.io.Serializable;

/**
 *
 * @author aleja
 */
public abstract class Campo implements Comparable<Campo>, Serializable {
    private static final long serialVersionUID = 888L;

    protected String nombreCampo;

    public Campo() {
    }

    public Campo(String nombreCampo) {
        this.nombreCampo = nombreCampo;
    }

    public String getNombreCampo() {
        return nombreCampo;
    }

    public void setNombreCampo(String nombreCampo) {
        this.nombreCampo = nombreCampo;
    }

    @Override
    public abstract String toString();

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public abstract boolean equals(Object obj);
}

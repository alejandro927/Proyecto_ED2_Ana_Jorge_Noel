/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_edd2_ana_noel_jorge;

/**
 *
 * @author aleja
 */
public class CampoEntero extends Campo{
    protected Integer valor;

    public CampoEntero() {
    }

    public CampoEntero(String nombreCampo) {
        super(nombreCampo);
        this.valor = 0;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return valor.toString();
    }

    @Override
    public int compareTo(Campo o) {
        CampoEntero comparacion = (CampoEntero) o;
        return this.valor.compareTo(comparacion.getValor());
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof CampoEntero)) return false;
        
        CampoEntero c = (CampoEntero) obj;
        return this.valor.equals(c.valor);
    }
}

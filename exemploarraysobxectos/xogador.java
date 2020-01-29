
package exemploarraysobxectos;


public class xogador {
    String xogador;
    int dorsal;

    public xogador(String xogador, int dorsal) {
        this.xogador = xogador;
        this.dorsal = dorsal;
    }

    public String getXogador() {
        return xogador;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setXogador(String xogador) {
        this.xogador = xogador;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    @Override
    public String toString() {
        return "xogador{" + "xogador=" + xogador + ", dorsal=" + dorsal + '}';
    }
    
}

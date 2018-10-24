
package ejercisio2practico3;


public class Medicamentos {

private String Nombre;
private String Compuesto;
private String Dosis;

    Medicamentos(String ibuprofeno, String string, String _mg) {
Nombre=ibuprofeno;
Compuesto=string;
Dosis=_mg;

    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the Compuesto
     */
    public String getCompuesto() {
        return Compuesto;
    }

    /**
     * @param Compuesto the Compuesto to set
     */
    public void setCompuesto(String Compuesto) {
        this.Compuesto = Compuesto;
    }

    /**
     * @return the Dosis
     */
    public String getDosis() {
        return Dosis;
    }

    /**
     * @param Dosis the Dosis to set
     */
    public void setDosis(String Dosis) {
        this.Dosis = Dosis;
    }



}

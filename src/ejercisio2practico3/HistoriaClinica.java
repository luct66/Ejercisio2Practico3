

package ejercisio2practico3;


public class HistoriaClinica implements ListaEnfermedades{
    private EnfermedadTemporal enfermedad1;
    private EnfermedadPermanente enfermedad2;

    private Medicamentos medicamentos;
    private String GrupoSanguineo;

    HistoriaClinica(EnfermedadPermanente enfermedad1, EnfermedadTemporal enfermedad2, Medicamentos medicamento1,String grupo1) {

this.enfermedad2=enfermedad1;
this.enfermedad1=enfermedad2;
this.medicamentos=medicamento1;
this.GrupoSanguineo=grupo1;



    }

    @Override
    public void MostrarListaenfermedades() {

     //Aca se mostrara el listado de enfermedades
        
     //while(enfermedad2!=null){ //alto ciclo loco
         System.out.println("Enfermedad:   "+enfermedad2.Nombre);
         System.out.println("Fecha Inicio: "+enfermedad2.FechaInicio);


//}
     
     //while(enfermedad1!=null){
         System.out.println("Enfermedad:   "+enfermedad1.Nombre);
         System.out.println("Fecha Inicio: "+enfermedad1.FechaInicio);
    
         
//}
    }

    /**
     * @return the enfermedad1
     */
    public EnfermedadTemporal getEnfermedad1() {
        return enfermedad1;
    }

    /**
     * @param enfermedad1 the enfermedad1 to set
     */
    public void setEnfermedad1(EnfermedadTemporal enfermedad1) {
        this.enfermedad1 = enfermedad1;
    }

    /**
     * @return the enfermedad2
     */
    public EnfermedadPermanente getEnfermedad2() {
        return enfermedad2;
    }

    /**
     * @param enfermedad2 the enfermedad2 to set
     */
    public void setEnfermedad2(EnfermedadPermanente enfermedad2) {
        this.enfermedad2 = enfermedad2;
    }

    /**
     * @return the medicamentos
     */
    public Medicamentos getMedicamentos() {
        return medicamentos;
    }

    /**
     * @param medicamentos the medicamentos to set
     */
    public void setMedicamentos(Medicamentos medicamentos) {
        this.medicamentos = medicamentos;
    }

    /**
     * @return the GrupoSanguineo
     */
    public String getGrupoSanguineo() {
        return GrupoSanguineo;
    }

    /**
     * @param GrupoSanguineo the GrupoSanguineo to set
     */
    public void setGrupoSanguineo(String GrupoSanguineo) {
        this.GrupoSanguineo = GrupoSanguineo;
    }

    
    
    
}

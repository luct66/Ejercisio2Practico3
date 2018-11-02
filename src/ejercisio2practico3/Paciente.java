
package ejercisio2practico3;


public class Paciente extends Persona {
//public String GrupoSanguineo;
public HistoriaClinica HistoriaClinica;    
//public Enfermedades ListadoEnfermedades; //Enfermedad permanente o temporal
//public Medicamentos ListadoMedicamentos;   
public TurnoPaciente turnopaciente; 

public Paciente(String nelson_Romero_, String comodoro_Rivadavia_1468, String masculino, int string, String nelson34livecomar, int i, String string0, TurnoPaciente turnopaciente) {

this.NombreApellido=nelson_Romero_;
this.Direccion=comodoro_Rivadavia_1468;
this.Sexo=masculino;
this.Telefono=string;
this.Correo=nelson34livecomar;
this.Documento=i;
this.Fechadenacimeiento=string0;

this.turnopaciente=turnopaciente;

    }

    /**
     * @return the HistoriaClinica
     */
    public HistoriaClinica getHistoriaClinica() {
        return HistoriaClinica;
    }

    /**
     * @param HistoriaClinica the HistoriaClinica to set
     */
    public void setHistoriaClinica(HistoriaClinica HistoriaClinica) {
        this.HistoriaClinica = HistoriaClinica;
    }

    /**
     * @return the turnopaciente
     */
    public TurnoPaciente getTurnopaciente() {
        return turnopaciente;
    }

    /**
     * @param turnopaciente the turnopaciente to set
     */
    public void setTurnopaciente(TurnoPaciente turnopaciente) {
        this.turnopaciente = turnopaciente;
    }


   
    


}

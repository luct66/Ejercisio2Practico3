
package ejercisio2practico3;


public class TurnoPaciente extends Persona{
    //public String Fechadeingreso;
    //public String Fechadeegreso;
  
    public FechaClase fecha;
    public int Hora;
    public int min;
    public String Medico;

    
    //se construye un constructor aca
 public   TurnoPaciente(String i,int io,int io2){
        NombreApellido=i;
        Hora=io;
        min=io2;
    }

    public TurnoPaciente(String lucasZarate,FechaClase fecha1, String medico1) {
    NombreApellido=lucasZarate;
    fecha=fecha1;
    Medico=medico1;
    }
    
    
}

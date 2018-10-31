
package ejercisio2practico3;

import java.util.ArrayList;


public class Ejercisio2Practico3 {

    public static void main(String[] args) {
        
        
       TurnoPaciente turnopaciente=new TurnoPaciente("17/09/18",17,60); 
       EnfermedadPermanente enfermedad1=new EnfermedadPermanente("HIV","10/03/18");
       EnfermedadTemporal enfermedad2=new EnfermedadTemporal("Gripe A","17/03/18");
       Medicamentos medicamento1=new Medicamentos("Ibuprofeno","Croscarmela de sodio, celulosa microcristalina, síice coloidal, anhidra yácido esteárico","600 mg");        

      
       HistoriaClinica historia1=new HistoriaClinica(enfermedad1,enfermedad2,medicamento1,"B+");
       Paciente paciente1=new Paciente("Nelson Romero ","Comodoro Rivadavia 1468", "Masculino", 38341234, "nelson34@live.com.ar", 12345678, "20/11/1997", historia1,turnopaciente);
      // paciente1.MostrarEnfermedades(); // tal vez sea una interfaz ps:yep es una interfaz 
       
       System.out.println("EL nombre del paciente:  "+paciente1.NombreApellido);
       System.out.println("La direccion es:  "+paciente1.Direccion);
       System.out.println("El Sexo es:  "+paciente1.Sexo);
       System.out.println("El Documento es: : "+paciente1.Documento);
       System.out.println("EL Correo del paciente:  "+paciente1.Correo);
       System.out.println("EL Telefono del paciente:  "+paciente1.Telefono);
       System.out.println("La Fecha de nacimiento del paciente:  "+paciente1.Fechadenacimeiento);

       System.out.println("");



      paciente1.getHistoriaClinica().MostrarListaenfermedades();
      
       TurnodeTrabajo turnotrabajo1=new TurnodeTrabajo("17/09/18","21/09/18",6,2); 
       MedicoPermanente medico1=new MedicoPermanente(turnotrabajo1,1200,25,"Lucas Zarate","Valleviejo","masculino",373059,"lucmaxzarate@gmail.com",12345,"20/11/1997"); //turno sueldo 
       
       System.out.println("Tipo Medico: Permanente:");
       System.out.println("Nombre: "+medico1.NombreApellido);
       System.out.println("Sueldo Base: "+medico1.SueldoBase);
       System.out.println("Adicional: "+medico1.getAdicional());
       System.out.println("Direccion: "+medico1.Direccion);
       System.out.println("Sexo: "+medico1.Sexo);
       System.out.println("Correo:  "+medico1.Correo);
       
       
              System.out.println("");

       medico1.CalculoPago();
       


       
       TurnodeTrabajo turnotrabajo2=new TurnodeTrabajo("17/09/18","21/09/18",6,2); 
       MedicoTemporal medico2=new MedicoTemporal(turnotrabajo2,4,1400,300,"Lautaro Tapia","V del Valle","masculino",373059,"lautarotapia@gmail.com",12345,"20/11/1992");

        medico2.RealizarContrato();
        
       System.out.println("Tipo Medico: Temporal");
       System.out.println("Nombre: "+medico2.NombreApellido);
       System.out.println("Sueldo Base: "+medico2.SueldoBase);
       System.out.println("Adicional: "+medico2.getAdicional());
       System.out.println("Direccion: "+medico2.Direccion);
       System.out.println("Sexo: "+medico2.Sexo);
       System.out.println("Correo:  "+medico2.Correo);
       
        
        
        
       ArrayList CentroMedico=new ArrayList();
       
       CentroMedico.add(paciente1);
       CentroMedico.add(medico1);
       CentroMedico.add(medico2);
       
       

        
        
    }
    
}


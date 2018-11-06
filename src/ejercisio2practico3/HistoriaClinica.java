

package ejercisio2practico3;

import java.util.LinkedList;

public class HistoriaClinica implements ListaEnfermedades{
    public LinkedList<EnfermedadTemporal> enfermedad1=new LinkedList();//aca se plantea lista enlazada
    public LinkedList<EnfermedadPermanente> enfermedad2=new LinkedList();

    private Medicamentos medicamentos;
    private String GrupoSanguineo;
    
    public void mostrartemporal(EnfermedadTemporal a){
        enfermedad1.add(a);
    }
      public void mostrarpermanente(EnfermedadPermanente a){
        enfermedad2.add(a);
    }
      
      
/*
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
     *//*
    public EnfermedadTemporal getEnfermedad1() {
        return enfermedad1;
    }

 
    public void setEnfermedad1(EnfermedadTemporal enfermedad1) {
        this.enfermedad1 = enfermedad1;
    }

   
    public EnfermedadPermanente getEnfermedad2() {
        return enfermedad2;
    }

  
    public void setEnfermedad2(EnfermedadPermanente enfermedad2) {
        this.enfermedad2 = enfermedad2;
    }

   
    public Medicamentos getMedicamentos() {
        return medicamentos;
    }

  
    public void setMedicamentos(Medicamentos medicamentos) {
        this.medicamentos = medicamentos;
    }

 
    public String getGrupoSanguineo() {
        return GrupoSanguineo;
    }

  
    public void setGrupoSanguineo(String GrupoSanguineo) {
        this.GrupoSanguineo = GrupoSanguineo;
    }

    
    
    */

    @Override
    public void MostrarListaenfermedades() {


    }
}

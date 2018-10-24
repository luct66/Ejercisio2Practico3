
package ejercisio2practico3;


public class MedicoTemporal extends Medico implements Contrato{

   private int horasminimas;
   private double Adicional;

MedicoTemporal(TurnodeTrabajo turnotrabajo2,int horasmin, double i, double i0, String lautaro_Tapia, String v_del_Valle, String masculino, int i1, String lautarotapiagmailcom, int i2, String string) {
this.turnodetrabajo=turnotrabajo2;
this.horasminimas=horasmin;
this.SueldoBase=i;
this.Adicional=i0;
this.NombreApellido=lautaro_Tapia;
this.Direccion=v_del_Valle;
this.Sexo=masculino;
this.Documento=i1;
this.Correo=lautarotapiagmailcom;
this.Telefono=i2;
this.Fechadenacimeiento=string;
    }
            
            
    @Override
    public void RealizarContrato() {  //realiza el contrato y el pago que se le realizara
    //int horastotales;
        
      double Pago=0;
  
   turnodetrabajo.HorasExtras=turnodetrabajo.HorasTrabajadas-getHorasminimas();
   
   
        System.out.println("Las horas extras son: "+turnodetrabajo.HorasExtras);
        
        if(turnodetrabajo.HorasExtras>0){
            Pago=SueldoBase+Adicional;
        }
        else{
            Pago=SueldoBase;

        }
        
        System.out.println("El pago para el medico temporal es: "+Pago);

    }
    
//    public Contrato contrato; //este contrato dice la hora de pago 
/*
    @Override
    public void CalculoPago() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void MostrarPago() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    */

    /**
     * @return the horasminimas
     */
    public int getHorasminimas() {
        return horasminimas;
    }

    /**
     * @param horasminimas the horasminimas to set
     */
    public void setHorasminimas(int horasminimas) {
        this.horasminimas = horasminimas;
    }

    /**
     * @return the Adicional
     */
    public double getAdicional() {
        return Adicional;
    }

    /**
     * @param Adicional the Adicional to set
     */
    public void setAdicional(double Adicional) {
        this.Adicional = Adicional;
    }
    
}

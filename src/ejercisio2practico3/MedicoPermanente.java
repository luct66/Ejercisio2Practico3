
package ejercisio2practico3;


public class MedicoPermanente extends Medico implements Pago{
private double Adicional;

    MedicoPermanente(TurnodeTrabajo turnotrabajo1, double i, int i0, String lucas_Zarate, String valleviejo, String masculino, int i1, String lucmaxzarategmailcom, int i2, String string) {
this.turnodetrabajo=turnotrabajo1;
this.SueldoBase=i;
this.Adicional=i0;
this.NombreApellido=lucas_Zarate;
this.Direccion=valleviejo;
this.Sexo=masculino;
this.Documento=i1;
this.Correo=lucmaxzarategmailcom;
this.Telefono=i2;
this.Fechadenacimeiento=string;


    }
    @Override
    public void CalculoPago() { //Para realizar el pago se realiza un porcentaje adicional de 25
   double Pago=0;
    
      Pago=SueldoBase+(SueldoBase*(getAdicional()/100));  
        
      
      System.out.println("El pago total es:  "+Pago);
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

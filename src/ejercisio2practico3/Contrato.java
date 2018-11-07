
package ejercisio2practico3;


public class Contrato extends MedicoTemporal implements Pago{
    
    public Contrato(TurnodeTrabajo turnotrabajo2, int horasmin, double i, double i0, String lautaro_Tapia, String v_del_Valle, String masculino, int i1, String lautarotapiagmailcom, int i2, String string) {
        super(turnotrabajo2, horasmin, i, i0, lautaro_Tapia, v_del_Valle, masculino, i1, lautarotapiagmailcom, i2, string);
    }

    @Override
    public double CalculoPago() {
        double calcu=0;
        return calcu;
    }

    
    
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author Administrador
 */
public class VentaUsado extends Venta implements Vender{

    public VentaUsado(Componentes componentes, int utilidad, String marca, String patente, int precio_base, String tipo) {
        super(componentes, utilidad, marca, patente, precio_base, tipo);
    }

    

    @Override
    public int vender() {
        int precio,a,b,c;
        precio = precio_base +(precio_base * utilidad)/100+((precio_base*componentes.getAire())/100)+((precio_base*componentes.getCristales())/100)+((precio_base*componentes.getAlarma())/100);
        return precio;
    }
    
    
    
}

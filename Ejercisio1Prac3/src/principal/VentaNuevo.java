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
public class VentaNuevo extends Venta implements Vender {

    public VentaNuevo(Componentes componentes, int Utilidad, String marca, String patente, int precio_base, String tipo) {
        super(componentes, Utilidad, marca, patente, precio_base, tipo);
    }
    
    

    @Override
    public int vender() {
        int precio=0;
        return precio;
    }
    
}

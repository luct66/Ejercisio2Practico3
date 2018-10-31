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
public class Auto extends Pasajeros implements Alquiler{
    
    public Auto(int dia, int plaza, String marca, String patente, int precio_base, String tipo) {
        super(dia, plaza, marca, patente, precio_base, tipo);
    }

    @Override
    public int alquiler() {
    int precio;
    precio = (precio_base * dia )+((plaza * 50)*dia);
    return precio;
    }
    
}

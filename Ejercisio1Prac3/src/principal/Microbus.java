/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;


public class Microbus extends Pasajeros implements Alquiler{

    public Microbus(int dia, int plaza, String marca, String patente, int precio_base, String tipo) {
        super(dia, plaza, marca, patente, precio_base, tipo);
    }

    @Override
    public int alquiler() {
        int precio;
        precio = (precio_base*dia)+((50*plaza)*dia)+250;
        return precio;
    }
    
}

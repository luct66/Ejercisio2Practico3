/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;


public class Camioneta extends Carga implements Alquiler{

    public Camioneta(int km_rec, String marca, String patente, int precio_base, String tipo) {
        super(km_rec, marca, patente, precio_base, tipo);
    }

    @Override
    public int alquiler() {
        int precio=0;
        if(km_rec < 50){
            precio = precio_base;
        }else{
            System.out.println(+precio_base);
            precio = precio_base + (20 * km_rec);
        }
        return precio;
    }
    
}

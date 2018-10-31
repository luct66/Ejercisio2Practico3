/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;


public class Carga extends Vehiculo {

    public int km_rec;

    public Carga(int km_rec, String marca, String patente, int precio_base, String tipo) {
        super(marca, patente, precio_base, tipo);
        this.km_rec = km_rec;
    }

    public int getKm_rec() {
        return km_rec;
    }

    public void setKm_rec(int km_rec) {
        this.km_rec = km_rec;
    }
    
    
    
}

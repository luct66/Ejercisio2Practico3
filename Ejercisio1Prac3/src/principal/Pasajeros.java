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
public class Pasajeros extends Vehiculo {
    
    public int dia;
    public int plaza;

    public Pasajeros(int dia, int plaza, String marca, String patente, int precio_base, String tipo) {
        super(marca, patente, precio_base, tipo);
        this.dia = dia;
        this.plaza = plaza;
    }
    
    
}

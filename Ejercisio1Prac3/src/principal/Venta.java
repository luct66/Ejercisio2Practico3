/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author Lautaro Exequiel Tapia;
 */
public class Venta extends Vehiculo{
    
    public Componentes componentes;
    public int utilidad;

    public Venta(Componentes componentes, int utilidad, String marca, String patente, int precio_base, String tipo) {
        super(marca, patente, precio_base, tipo);
        this.componentes = componentes;
        this.utilidad = utilidad;
    }
 
     
}

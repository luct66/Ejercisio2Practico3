/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.LinkedList;

/**
 *
 * @author Administrador
 */
public class ParqueAutomotor {
    private static LinkedList<Venta> nuevo = new LinkedList<Venta>();
    private static LinkedList<Auto> auto = new LinkedList<Auto>();
    private static LinkedList<VentaNuevo> ventanuevo = new LinkedList<VentaNuevo>();
    private static LinkedList<VentaUsado> ventausado = new LinkedList<VentaUsado>();
 
    
    public void nuevo_auto(Venta a){
        nuevo.add(a);
    }
    
   public void vender_nuevo(VentaNuevo a){
       ventanuevo.add(a);
   }
   
   public void vender_usado(VentaUsado a){
       ventausado.add(a);
   }
   
   public void alquilar(Auto a){
       auto.add(a);
   }
   
   public void mostrar()
    {
        for(Venta e: nuevo)
        {
            System.out.println(e.toString());
            System.out.println("\n");
        }
        System.out.println("Cantidad de vehuculo: "+nuevo.size());
        System.out.println("\n");
    }
}

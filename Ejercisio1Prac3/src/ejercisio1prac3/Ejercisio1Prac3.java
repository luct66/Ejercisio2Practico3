
package ejercisio1prac3;

import java.util.ArrayList;


public class Ejercisio1Prac3 {

   
    public static void main(String[] args) {
        
       int precioauto; // alquiler de auto
     //Instancio las clases y preparo para iniciar un auto 0km para la venta
     
    //Aca la idea del profesor es que se utilice concepto de Colecciones
    //De ahi que se utilice por ejemplo en el parque automotor
    //Que por ejemplo va a contener los vehiculos disponibles
    
    ArrayList lista1=new ArrayList();
    
    
    
     ParqueAutomotor p1=new ParqueAutomotor();
     Componente c1=new Componente();  //Esto estaba planteado para que se utilice composicion  
     nuevo0km autonuevo=new nuevo0km(p1,c1,"Toyota","CA1220",120000,"Venta");
   //Este metodo brindara el precio de venta con los procentajes de sus componentes
      System.out.println("El auto que usted compro es:  ");
      System.out.println("Modelo:  "+autonuevo.marca);
      System.out.println("Patente:  "+autonuevo.patente);
      System.out.println("Preciobase:  "+autonuevo.Preciobase);
         autonuevo.preciodeventa();

         /*
         lista1.add(c1);    //permite guarda objetos diferentes 
         lista1.add(autonuevo);//para luego ser invocados por get

         if(autonuevo.equals(autousado)){ //aca quiero comparar dos objetos para
                                           //preguntar si son iguales los objetos??
         }
         */
         
      System.out.println(" ");


   
    ParqueAutomotor p2=new ParqueAutomotor();
    Componente c2=new Componente();
    usado autousado=new usado(p2,c2,"Fiat","AD3055",80000,"Venta");
   
   System.out.println("El auto que usted compro es:  ");
      System.out.println("Modelo:  "+autousado.marca);
      System.out.println("Patente:  "+autousado.patente);
      System.out.println("Preciobase:  "+autousado.Preciobase);
            autousado.preciodeventa();

         System.out.println(" ");

   
   //aca se define los vehiculos de carga
   //se debe calcular el precio del alquiler teniendo en cuenta los kilometros recorridos
   //se debe tener la consideracion de los dias que se va a alquilar el vehiculo
   //y los kilometros que recorre
    Camion camion1=new Camion(1,55,"Mercedez-Benz","LU255",200,"Alquiler");
    System.out.println("El camion que usted alquilo es:  ");
      System.out.println("Modelo:  "+camion1.marca);
      System.out.println("Patente:  "+camion1.patente);
      System.out.println("Preciobase:  "+camion1.Preciobase);
         camion1.precioalquiler();

            System.out.println(" ");

            ParqueAutomotor c = new ParqueAutomotor();
        jTextField_marca.setText(b.marca);
        jTextField_tipo.setText(b.tipo);
        jTextField_patente.setText(b.patente);
        jTextField_aire.setText("2");
        jTextField_alarma.setText("5");
        jTextField_cistal.setText("1");
        jTextField_utilidad.setText("35");
       jTextField_precio.setText(String.valueOf(b.precio_base));
       c.vender_usado(b);
   
   Camioneta camioneta=new Camioneta(2,40,"Ford","PA6699",0,"Alquiler");
   System.out.println("La camioneta que usted alquilo es:  ");
   
      System.out.println("Modelo:  "+camioneta.marca);
      System.out.println("Patente:  "+camioneta.patente);
      System.out.println("Tipo de venta:  "+camioneta.Tipoventa);
            camioneta.precioalquiler();

            System.out.println(" ");


      
      //aca defino alquiler de auto y minibus
      
      //ParqueAutomotor p3=new ParqueAutomotor();
      //Auto autoalquiler=new Auto();
     //Auto autoalquiler=new Auto(p3,"Chevrolet","DA320",0,"Alquiler");
      
    ParqueAutomotor p3=new ParqueAutomotor(2);
    
    Auto autoal=new usado(p3,c2,"Citroen","DC3055",0,"Alquiler");
    
    //Auto us=new Auto();
    
    System.out.println("El auto que usted alquilo es:  ");
   
      System.out.println("Modelo:  "+autoal.marca);
      System.out.println("Patente:  "+autoal.patente);
      System.out.println("Tipo de venta:  "+autoal.Tipoventa);
         
      autoal.precioalquiler();
      System.out.println(" ");

   Minibus minibus=new Minibus("Ford","CDDVD3055",0,"Alquiler");
    
   System.out.println("El minibus que usted alquilo es:  ");
   
      System.out.println("Modelo:  "+minibus.marca);
      System.out.println("Patente:  "+minibus.patente);
      System.out.println("Tipo de venta:  "+minibus.Tipoventa);
      minibus.precioalquiler();
    
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrador
 */
public class PrincipalTest {
    
    public PrincipalTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of alquiler method, of class Auto.
     */
    @Test
    public void testAlquilerAuto() { //aca pruevo cada metoodo parqa realizar una comparacion 
        System.out.println("alquiler");
        Auto nuevo = new Auto(3 , 4,"Audi","L4UT1",250,"ALQUILER");
        int esperado = 1350;
        int prueba = nuevo.alquiler(); 
        assertEquals(esperado, prueba);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of alquiler method, of class Camion.
     */
    @Test
    public void testAlquilerCamoin() {
        
        Camion nuevo = new Camion(55,"Mercedez-Benz","LU255",300,"Alquiler");
        int km;
        km=nuevo.km_rec;
        if(km<50){
            int expResult = 300+200;
            int result = nuevo.alquiler();
            assertEquals(expResult, result);
        }else{
            int expResult = 300 + (20 * km);
            int result = nuevo.alquiler();
            assertEquals(expResult, result);
        }
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
     /**
     * Test of alquiler method, of class Camioneta.
     */
    @Test
    public void testAlquilerCamioneta() {
        Camion nuevo = new Camion(55,"Mercedez-Benz","LU255",300,"Alquiler");
        int km;
        km=nuevo.km_rec;
        if(km<50){
            int expResult = 300;
            int result = nuevo.alquiler();
            assertEquals(expResult, result);
        }else{
            int expResult = (20 * 55)+300;
            int result = nuevo.alquiler();
            assertEquals(expResult, result);
        }
        // TODO review the generated test code and remove the default call to fail.
     // fail("The test case is a prototype.");
    }
    
    /**
     * Test of alquiler method, of class Microbus.
     */
    @Test
    public void testAlquilerMicrobus() {
        System.out.println("Text");
        Microbus nuevo = new Microbus(2,3,"Ford","CDDVD3055",0,"Alquiler");
        int expResult = 550;
        int result = nuevo.alquiler();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of vender method, of class VentaNuevo.
     */
    @Test
    public void testVenderVentaNuevo() {
        System.out.println("vender");
        Componentes c = new Componentes(2,5,1);
        VentaNuevo nuevo = new VentaNuevo(c,50,"Audi","L4UT1",2000,"Venta");
        //1000 40 100 20
        int expResult = 3160 ;
        int result = nuevo.vender();
        assertEquals(expResult, result);
        
        
        
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of vender method, of class VentaUsado.
     */
    @Test
    public void testVender() {
        System.out.println("vender");
        Componentes c = new Componentes(2,5,1);
        VentaNuevo nuevo = new VentaNuevo(c,50,"Audi","L4UT1",2000,"Venta");
        //3160
        int expResult = 3160;
        int result = nuevo.vender();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}

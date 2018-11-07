/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercisio2practico3;

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
public class MedicoPermanenteTest {
    
    public MedicoPermanenteTest() {
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
     * Test of CalculoPago method, of class MedicoPermanente.
     */
    @Test
    public void testCalculoPago() {
        System.out.println("CalculoPago");
        TurnodeTrabajo turnotrabajo=new TurnodeTrabajo();
        MedicoPermanente nuevo = new MedicoPermanente(turnotrabajo,3000,20,"Marcos Aranda","Belgrano","Masculino",30306476,"aranda@gmail.com",373059,"20/03/80");
        double expResult = 3600.0;
        double result = nuevo.CalculoPago();
        assertEquals(expResult, result, 0.1);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}

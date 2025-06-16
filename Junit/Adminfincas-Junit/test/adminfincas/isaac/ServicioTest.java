/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package adminfincas.isaac;

import java.util.Date;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Supu
 */
public class ServicioTest {
    
    public ServicioTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getCodigo method, of class Servicio.
     */
    @Test
    public void testGetCodigo() {
        System.out.println("getCodigo");
        Servicio instance = new Servicio();
        int expResult = 0;
        int result = instance.getCodigo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCodigo method, of class Servicio.
     */
    @Test
    public void testSetCodigo() {
        System.out.println("setCodigo");
        int codigo = 0;
        Servicio instance = new Servicio();
        instance.setCodigo(codigo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getObservaciones method, of class Servicio.
     */
    @Test
    public void testGetObservaciones() {
        System.out.println("getObservaciones");
        Servicio instance = new Servicio();
        String expResult = "";
        String result = instance.getObservaciones();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setObservaciones method, of class Servicio.
     */
    @Test
    public void testSetObservaciones() {
        System.out.println("setObservaciones");
        String observaciones = "";
        Servicio instance = new Servicio();
        instance.setObservaciones(observaciones);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaInicio method, of class Servicio.
     */
    @Test
    public void testGetFechaInicio() {
        System.out.println("getFechaInicio");
        Servicio instance = new Servicio();
        Date expResult = null;
        Date result = instance.getFechaInicio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFechaInicio method, of class Servicio.
     */
    @Test
    public void testSetFechaInicio() {
        System.out.println("setFechaInicio");
        Date fechaInicio = null;
        Servicio instance = new Servicio();
        instance.setFechaInicio(fechaInicio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaFin method, of class Servicio.
     */
    @Test
    public void testGetFechaFin() {
        System.out.println("getFechaFin");
        Servicio instance = new Servicio();
        Date expResult = null;
        Date result = instance.getFechaFin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFechaFin method, of class Servicio.
     */
    @Test
    public void testSetFechaFin() {
        System.out.println("setFechaFin");
        Date fechaFin = null;
        Servicio instance = new Servicio();
        instance.setFechaFin(fechaFin);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of muestra method, of class Servicio.
     */
    @Test
    public void testMuestra() {
        System.out.println("muestra");
        Servicio instance = new Servicio();
        instance.muestra();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

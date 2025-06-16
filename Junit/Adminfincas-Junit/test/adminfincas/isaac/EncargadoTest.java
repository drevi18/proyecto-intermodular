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
public class EncargadoTest {
    
    public EncargadoTest() {
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
     * Test of getFechaInicio method, of class Encargado.
     */
    @Test
    public void testGetFechaInicio() {
        System.out.println("getFechaInicio");
        Encargado instance = new Encargado();
        Date expResult = null;
        Date result = instance.getFechaInicio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class Encargado.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Encargado instance = new Encargado();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getApellidos method, of class Encargado.
     */
    @Test
    public void testGetApellidos() {
        System.out.println("getApellidos");
        Encargado instance = new Encargado();
        String expResult = "";
        String result = instance.getApellidos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFechaInicio method, of class Encargado.
     */
    @Test
    public void testSetFechaInicio() {
        System.out.println("setFechaInicio");
        Date fechaInicio = null;
        Encargado instance = new Encargado();
        instance.setFechaInicio(fechaInicio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaFin method, of class Encargado.
     */
    @Test
    public void testGetFechaFin() {
        System.out.println("getFechaFin");
        Encargado instance = new Encargado();
        Date expResult = null;
        Date result = instance.getFechaFin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFechaFin method, of class Encargado.
     */
    @Test
    public void testSetFechaFin() {
        System.out.println("setFechaFin");
        Date fechaFin = null;
        Encargado instance = new Encargado();
        instance.setFechaFin(fechaFin);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of muestra method, of class Encargado.
     */
    @Test
    public void testMuestra() {
        System.out.println("muestra");
        Encargado instance = new Encargado();
        instance.muestra();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

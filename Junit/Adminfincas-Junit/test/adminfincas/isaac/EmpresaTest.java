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
public class EmpresaTest {
    
    public EmpresaTest() {
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
     * Test of getNombre method, of class Empresa.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Empresa instance = new Empresa();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Empresa.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Empresa instance = new Empresa();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMail method, of class Empresa.
     */
    @Test
    public void testGetMail() {
        System.out.println("getMail");
        Empresa instance = new Empresa();
        String expResult = "";
        String result = instance.getMail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMail method, of class Empresa.
     */
    @Test
    public void testSetMail() {
        System.out.println("setMail");
        String mail = "";
        Empresa instance = new Empresa();
        instance.setMail(mail);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstado method, of class Empresa.
     */
    @Test
    public void testGetEstado() {
        System.out.println("getEstado");
        Empresa instance = new Empresa();
        String expResult = "";
        String result = instance.getEstado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEstado method, of class Empresa.
     */
    @Test
    public void testSetEstado() {
        System.out.println("setEstado");
        String estado = "";
        Empresa instance = new Empresa();
        instance.setEstado(estado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getObservaciones method, of class Empresa.
     */
    @Test
    public void testGetObservaciones() {
        System.out.println("getObservaciones");
        Empresa instance = new Empresa();
        String expResult = "";
        String result = instance.getObservaciones();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setObservaciones method, of class Empresa.
     */
    @Test
    public void testSetObservaciones() {
        System.out.println("setObservaciones");
        String observaciones = "";
        Empresa instance = new Empresa();
        instance.setObservaciones(observaciones);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCodigo method, of class Empresa.
     */
    @Test
    public void testGetCodigo() {
        System.out.println("getCodigo");
        Empresa instance = new Empresa();
        int expResult = 0;
        int result = instance.getCodigo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCodigo method, of class Empresa.
     */
    @Test
    public void testSetCodigo() {
        System.out.println("setCodigo");
        int codigo = 0;
        Empresa instance = new Empresa();
        instance.setCodigo(codigo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCif method, of class Empresa.
     */
    @Test
    public void testGetCif() {
        System.out.println("getCif");
        Empresa instance = new Empresa();
        int expResult = 0;
        int result = instance.getCif();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCif method, of class Empresa.
     */
    @Test
    public void testSetCif() {
        System.out.println("setCif");
        int cif = 0;
        Empresa instance = new Empresa();
        instance.setCif(cif);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTelefono method, of class Empresa.
     */
    @Test
    public void testGetTelefono() {
        System.out.println("getTelefono");
        Empresa instance = new Empresa();
        int expResult = 0;
        int result = instance.getTelefono();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTelefono method, of class Empresa.
     */
    @Test
    public void testSetTelefono() {
        System.out.println("setTelefono");
        int telefono = 0;
        Empresa instance = new Empresa();
        instance.setTelefono(telefono);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaContratacion method, of class Empresa.
     */
    @Test
    public void testGetFechaContratacion() {
        System.out.println("getFechaContratacion");
        Empresa instance = new Empresa();
        Date expResult = null;
        Date result = instance.getFechaContratacion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFechaContratacion method, of class Empresa.
     */
    @Test
    public void testSetFechaContratacion() {
        System.out.println("setFechaContratacion");
        Date fechaContratacion = null;
        Empresa instance = new Empresa();
        instance.setFechaContratacion(fechaContratacion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaInactividad method, of class Empresa.
     */
    @Test
    public void testGetFechaInactividad() {
        System.out.println("getFechaInactividad");
        Empresa instance = new Empresa();
        Date expResult = null;
        Date result = instance.getFechaInactividad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFechaInactividad method, of class Empresa.
     */
    @Test
    public void testSetFechaInactividad() {
        System.out.println("setFechaInactividad");
        Date fechaInactividad = null;
        Empresa instance = new Empresa();
        instance.setFechaInactividad(fechaInactividad);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of muestra method, of class Empresa.
     */
    @Test
    public void testMuestra() {
        System.out.println("muestra");
        Empresa instance = new Empresa();
        instance.muestra();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

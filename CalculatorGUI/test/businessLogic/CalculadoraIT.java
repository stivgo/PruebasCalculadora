/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessLogic;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Anabel
 */
public class CalculadoraIT {
    
    public CalculadoraIT() {
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
     * Test of add method, of class Calculadora.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        float a = 3F;
        float b = 5F;
        float expResult = 8F;
        float result = Calculadora.add(a, b);
        assertEquals(expResult, result, 0.0);
        
        a = 5.8F;
        b= 0F;
        expResult = 5.8F;
        result= Calculadora.add(a, b);
        assertEquals(expResult, result, 0.0);
        
        a = 4F;
        b= -2F;
        expResult = 2F;
        result= Calculadora.add(a, b);
        assertEquals(expResult, result, 0.0);
        
        a = -3F;
        b= 5F;
        expResult = 2F;
        result= Calculadora.add(a, b);
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of substract method, of class Calculadora.
     */
    @Test
    public void testSubstract() {
        System.out.println("substract");
        float a = 5F;
        float b = 7F;
        float expResult = -2F;
        float result = Calculadora.substract(a, b);
        assertEquals(expResult, result, 0.0);
        
        a = 3F;
        b = 3F;
        expResult = 0F;
        result = Calculadora.substract(a, b);
        assertEquals(expResult, result, 0.0);
        
        a = -5F;
        b = 4F;
        expResult = -9F;
        result = Calculadora.substract(a, b);
        assertEquals(expResult, result, 0.0);
        
        a = -4F;
        b = -3F;
        expResult = -1F;
        result = Calculadora.substract(a, b);
        assertEquals(expResult, result, 0.0);
        
        
        
    }

    /**
     * Test of multiply method, of class Calculadora.
     */
    @Test
    public void testMultiply() {
        System.out.println("multiply");
        float a = 4F;
        float b = 8F;
        float expResult = 32F;
        float result = Calculadora.multiply(a, b);
        assertEquals(expResult, result, 0.0);
        
        a = 4F;
        b = 8F;
        expResult = 32F;
        result = Calculadora.multiply(a, b);
        assertEquals(expResult, result, 0.0);
        
        a = 5F;
        b = 0F;
        expResult = 0F;
        result = Calculadora.multiply(a, b);
        assertEquals(expResult, result, 0.0);
        
        a = 7F;
        b = -8F;
        expResult = -56F;
        result = Calculadora.multiply(a, b);
        assertEquals(expResult, result, 0.0);
        
        a = -4F;
        b = -4F;
        expResult = 16F;
        result = Calculadora.multiply(a, b);
        assertEquals(expResult, result, 0.0);
        
        a = -5F;
        b = 10F;
        expResult = -50F;
        result = Calculadora.multiply(a, b);
        assertEquals(expResult, result, 0.0);
        
        a = 8.9F;
        b = -5.41F;
        expResult = -48.149F;
        result = Calculadora.multiply(a, b);
        assertEquals(expResult, result, 0.0);
        
        a = 5.0F;
        b = -7.0F;
        expResult = -35.0F;
        result = Calculadora.multiply(a, b);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of div method, of class Calculadora.
     */
    @Test
    public void testDiv() {
        System.out.println("div");
        float a = 10F;
        float b = 5F;
        float expResult = 2F;
        float result = Calculadora.div(a, b);
        assertEquals(expResult, result, 0.0);
        
        a = -9F;
        b = 3F;
        expResult = -3F;
        result = Calculadora.div(a, b);
        assertEquals(expResult, result, 0.0);
        
        a = 15F;
        b = -4F;
        expResult = -3.75F;
        result = Calculadora.div(a, b);
        assertEquals(expResult, result, 0.0);
        
        a = 0F;
        b = 8F;
        expResult = 0F;
        result = Calculadora.div(a, b);
        assertEquals(expResult, result, 0.0);
        
        a = 58F;
        b = 0F;
        expResult = 0F;
        result = Calculadora.div(a, b);
        //assertEquals(expResult, result, 0.0);
        
        a = 0F;
        b = 0F;
        expResult = 0F;
        result = Calculadora.div(a, b);
        //assertEquals(expResult, result, 0.0);
        
    }
    
    /**
     * Test of module method, of class Calculadora.
     */
    @Test
    public void testModule() {
        System.out.println("mod");
        float a = 9F;
        float b = 5F;
        float expResult = 4F;
        float result = Calculadora.module(a, b);
        assertEquals(expResult, result, 0.0);
        
        a = -5F;
        b = -3F;
        expResult = -2F;
        result = Calculadora.module(a, b);
        assertEquals(expResult, result, 0.0);
        
        a = 5F;
        b = -3F;
        expResult = 2F;
        result = Calculadora.module(a, b);
        assertEquals(expResult, result, 0.0);
        
        a = -5F;
        b = 3F;
        expResult = -2F;
        result = Calculadora.module(a, b);
        assertEquals(expResult, result, 0.0);
        
        a = 5.8F;
        b = 2F;
        expResult = -2F;
        result = Calculadora.module(a, b);
        //assertEquals(expResult, result, 0.0);
        
        a = 8F;
        b = 2.5F;
        expResult = -2F;
        result = Calculadora.module(a, b);
        //assertEquals(expResult, result, 0.0);
        
        a = 85F;
        b = 0F;
        expResult = -2F;
        result = Calculadora.module(a, b);
        //assertEquals(expResult, result, 0.0);
        
        a = 0F;
        b = 96F;
        expResult = 0F;
        result = Calculadora.module(a, b);
        assertEquals(expResult, result, 0.0);
    }
    
    /**
     * Test of signo method, of class Calculadora.
     */
    @Test
    public void testSigno() {
        System.out.println("signo");
        float a = 85F;
        float expResult = -85F;
        float result = Calculadora.signo(a);
        assertEquals(expResult, result, 0.0);
        
        a = -45F;
        expResult = 45F;
        result = Calculadora.signo(a);
        assertEquals(expResult, result, 0.0);
        
         a = 0F;
        expResult = 0F;
        result = Calculadora.signo(a);
        assertEquals(expResult, result, 0.0);
        
    }
    
    /**
     * Test of tenPow method, of class Calculadora.
     */
    @Test
    public void testTenPow() {
        System.out.println("tenPow");
        float a = 5F;
        float b = 3F;
        float expResult = 5000F;
        float result = Calculadora.tenPow(a, b);
        assertEquals(expResult, result, 0.0);
        
        a = -4F;
        b = 4F;
        expResult = -40000F;
        result = Calculadora.tenPow(a, b);
        assertEquals(expResult, result, 0.0);
        
        a = 8F;
        b = -5F;
        expResult = 8E-5F;
        result = Calculadora.tenPow(a, b);
        assertEquals(expResult, result, 0.0);
        
        a = 2F;
        b = 20F;
        expResult = 2E20F;
        result = Calculadora.tenPow(a, b);
        assertEquals(expResult, result, 0.0);
        
        a = 5F;
        b = 2.5F;
        expResult = 1581.1388F;
        result = Calculadora.tenPow(a, b);
        assertEquals(expResult, result, 0.0);
        
        a = 3.6F;
        b = 2F;
        expResult = 360F;
        result = Calculadora.tenPow(a, b);
        assertEquals(expResult, result, 0.0);
        
        a = 6.2F;
        b = 10.1F;
        expResult = 7.8053442E10F;
        result = Calculadora.tenPow(a, b);
        assertEquals(expResult, result, 0.0);

    }
    
    /**
     * Test of sqrt method, of class Calculadora.
     */
    @Test
    public void testSqrt() {
        System.out.println("sqrt");
        float a = 4F;
        float expResult = 2F;
        float result = Calculadora.sqrt(a);
        assertEquals(expResult, result, 0.0);
        
        a = -27F;
        expResult = Float.NaN;
        result = Calculadora.sqrt(a);
        assertEquals(expResult, result, 0.0);
        
        a = 0F;
        expResult = 0F;
        result = Calculadora.sqrt(a);
        assertEquals(expResult, result, 0.0);
        
        a = 650.25F;
        expResult = 25.5F;
        result = Calculadora.sqrt(a);
        assertEquals(expResult, result, 0.0);
        
    }
    
    /**
     * Test of nFact method, of class Calculadora.
     */
    @Test
    public void testnFact() {
        System.out.println("nFact");
        float a = 4F;
        float expResult = 24F;
        float result = Calculadora.nFact(a);
        assertEquals(expResult, result, 0.0);
        
        a = 0F;
        expResult = 1F;
        result = Calculadora.nFact(a);
        assertEquals(expResult, result, 0.0);
        
        a = -4F;
        expResult = -24F;
        result = Calculadora.nFact(a);
        assertEquals(expResult, result, 0.0);
        
        a = 2.5F;
        expResult = Float.NaN;
        result = Calculadora.nFact(a);
        assertEquals(expResult, result, 0.0);
    }
    
    /**
     * Test of log method, of class Calculadora.
     */
    @Test
    public void testLog() {
        System.out.println("log");
        float a = 100F;
        float expResult = 2F;
        float result = Calculadora.log(a);
        assertEquals(expResult, result, 0.0);
        
        a = 0F;
        expResult = Float.NaN;
        result = Calculadora.log(a);
        assertEquals(expResult, result, 0.0);
        
        a = -5F;
        expResult = Float.NaN;
        result = Calculadora.log(a);
        assertEquals(expResult, result, 0.0);
        
    }
    
}

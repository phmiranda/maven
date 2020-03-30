package br.com.alura;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class CalculadoraTest extends TestCase {
    public CalculadoraTest(String testName){
        super(testName);
    }

    public static Test suite(){
        return new TestSuite(CalculadoraTest.class);
    }

    public void testCalculadora(){
        assertTrue(true);
    }
}

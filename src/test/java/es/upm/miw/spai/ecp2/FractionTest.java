package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class FractionTest {

	private  Fraction fraction;
	 
	@Before
	 public void before() {
		 fraction = new Fraction(1,2);
	 }

	@Test
	public void testFractionIntInt() {
		 assertEquals(1, fraction.getNumerator());
		 assertEquals(2, fraction.getDenominator());	 
	}
	@Test
	public void testFraction() {
		 fraction = new Fraction();
		 assertEquals(1, fraction.getNumerator());
		 assertEquals(1, fraction.getDenominator());	 
	}
	
	@Test
	public void decimal() { 
		assertEquals(0.5, fraction.decimal(), 0.02);
	 }
	
	@Test
    public void testComparaFracciones(){ 
	   	    
        assertEquals(false, fraction.comparaFracciones(new Fraction(1,2), new Fraction(3,4)));
     }

	@Test
    public void testMultiplicaFracciones() { 
	    
        assertNotEquals(new Fraction(1,6), fraction.multiplicaFracciones(new Fraction(1,2), new Fraction(1,3)));
     }


}

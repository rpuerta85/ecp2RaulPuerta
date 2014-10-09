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
	    public void testSumaTestFraction(){
	    	Fraction fraction2= new Fraction(2,3);
	    	fraction= new Fraction(1,2);
	       	assertEquals(7, fraction.sumaTest(fraction2).getNumerator());
	    	assertEquals(6, fraction.sumaTest(fraction2).getDenominator());
	    }

	@Test
    public void testComparaFracciones(){ 
        assertEquals(true, ((fraction.compara(new Fraction(1,2))).equals("0")) );
     }

	@Test
    public void testMultiplicaFracciones() { 
	    
        assertNotEquals(new Fraction(1,6), fraction.multiplica(new Fraction(1,2)));
     }



}

package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UserTest {
	private User user;
	private static final String NAME="pepe";
	private static final String NAME_UPPER="Pepe";
	private static final String FAMILY_NAME_UPPER="Pepes";
	private static final String FAMILY_NAME="pepes";
	private static final String ADDRESS="cll Soto 3";
	private static final String ADDRESS_UPPER="Cll Soto 3";
	@Before
	 public void before() {
		 user= new User(111, NAME, FAMILY_NAME);
	 }
	@Test
	public void testUser() {
	    assertEquals(111, user.getNumber());
	    assertEquals("Pepe", user.getName());	 
		assertEquals("Pepes", user.getFamilyName());	 
	}

	@Test
	public void testFullName(){
		assertEquals(user.fullName(),NAME_UPPER+ " " +FAMILY_NAME_UPPER);		
	}
	@Test
    public void testInitials(){
		 assertEquals(user.initials(),NAME.toUpperCase().substring(0, 1) + ".");
	 }
     @Test
     public void testUserIntStringStrinString(){
    	 User usuario = new User(111, NAME, FAMILY_NAME, ADDRESS);
    	 assertEquals(111, usuario.getNumber());
    	 assertEquals(NAME_UPPER, usuario.getName());
    	 assertEquals(FAMILY_NAME_UPPER, usuario.getFamilyName());
    	 assertEquals(ADDRESS_UPPER, usuario.getDomicilio());
    	 
     }
}

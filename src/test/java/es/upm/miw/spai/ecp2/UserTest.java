package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UserTest {
	private User user;
	
	@Before
	 public void before() {
		 user= new User(111, "pepe", "pepes");
	 }
	@Test
	public void testUser() {
	    assertEquals(111, user.getNumber());
	    assertEquals("Pepe", user.getName());	 
		assertEquals("Pepes", user.getFamilyName());	 
	}


}

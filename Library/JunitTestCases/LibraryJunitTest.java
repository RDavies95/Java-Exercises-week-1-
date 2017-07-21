package JunitTestCases;

import static org.junit.Assert.*;

import org.junit.Test;

import Main.Library;
import Main.Person;

public class LibraryJunitTest {
	
	

	@Test
	public void testRegisterPerson() {
		Library l = new Library();
		Person p0 = new Person(0, "Rhys", 22 , "QA", "10 Avenue");
		l.registerPerson(p0);
		
	}

	@Test
	public void testRemovePerson() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdatePerson() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddItem() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemoveItem() {
		fail("Not yet implemented");
	}

	@Test
	public void testOutputPerson() {
		fail("Not yet implemented");
	}

	@Test
	public void testOutputItem() {
		fail("Not yet implemented");
	}

}

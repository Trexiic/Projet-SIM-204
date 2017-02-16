package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import lanceurs.Canon;

public class CanonTest {

	@Before
	public void setUp() throws Exception {
		Canon c1 = new Canon(50, 40, 25, 25);
		Canon c2 = new Canon(90, 40, 25, 25);
		Canon c3 = new Canon(50, 1001, 25, 25);
		Canon c4 = new Canon(50, 40, -1, 25);
		Canon c5 = new Canon(50, 40, 25, 301);
	}

	@Test
	public void testCanon() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetVitesseDeLancementX() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetVitesseDeLancementY() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetPositionDeLancementX() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetPositionDeLancementY() {
		fail("Not yet implemented");
	}

}

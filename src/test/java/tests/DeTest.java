package tests;

import org.junit.*;

import static org.junit.Assert.assertTrue;


import framework.De;

public class DeTest {

	private De de1;
	private De de2;

	@Before
	public void faireAvant(){
		de1 = new De(6);
		de2 = new De(6);
	}

	@Test
	public void deSuperieurTest(){
		de1.setValeurCourrante(5);
		de2.setValeurCourrante(4);
		assertTrue(de1.compareTo(de2)==1);
	}

	@Test
	public void deInferieurTest(){
		de1.setValeurCourrante(4);
		de2.setValeurCourrante(5);
		assertTrue(de1.compareTo(de2)==-1);
	}

	@Test
	public void memeDeTest(){
		de1.setValeurCourrante(4);
		assertTrue(de1.compareTo(de1)==0);
	}

	@Test(expected=IllegalArgumentException.class)
	public void deNullTest(){
		de1.setValeurCourrante(4);
		de1.compareTo(null);
	}
}
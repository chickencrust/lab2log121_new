package tests;

import org.junit.*;

import static org.junit.Assert.assertTrue;

import framework.De;
import framework.Joueur;
import framework.Liste;
import framework.IterateurListe;


public class JoueurTest {

    private Joueur joueur1;
    private Joueur joueur2;
	private Liste<De> listeDes;

	@Before
	public void faireAvant(){
        listeDes = new Liste<De>();
        listeDes.add(new De(6,1));
        listeDes.add(new De(6,1));

        IterateurListe<De> ite = (IterateurListe<De>)listeDes.iterator();

		joueur1 = new Joueur(ite);
		joueur2 = new Joueur(ite);
	}

	@Test
	public void joueurSuperieurTest(){
		joueur1.setPoints(5);
		joueur2.setPoints(4);
		assertTrue(joueur1.compareTo(joueur2)==1);
	}

	@Test
	public void joueurInferieurTest(){
	    joueur1.setPoints(4);
		joueur2.setPoints(5);
		assertTrue(joueur1.compareTo(joueur2)==-1);
	}

	@Test
	public void memeJoueurTest(){
	    joueur1.setPoints(4);
		assertTrue(joueur1.compareTo(joueur1)==0);
	}

	@Test(expected=IllegalArgumentException.class)
	public void deNullTest(){
	    joueur1.setPoints(4);
	    joueur1.compareTo(null);
	}
}
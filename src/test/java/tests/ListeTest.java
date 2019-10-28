package tests;

import org.junit.*;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import framework.Liste;
import framework.De;
import java.util.Iterator;

public class ListeTest {

	private Liste<De> listeDe;
    private De deAtrouver;
    //TODO: Add null tests

	@Before
	public void faireAvant(){
        listeDe = new Liste<De>();
        deAtrouver = new De(6,1);
        
        //Size = 6
        //DeATrouver index = 1
        listeDe.add(deAtrouver);
        listeDe.add(new De(6,2));
        listeDe.add(new De(6,3));
        listeDe.add(new De(6,4));
        listeDe.add(new De(6,5));
        listeDe.add(new De(6,6));

	}

	@Test
	public void sizeTest(){
		assertTrue(listeDe.size()==6);
	}

    @Test
	public void isEmptyTest(){
		assertTrue(listeDe.isEmpty()==false);
    }
    
    @Test
	public void indexOfTest(){
		assertTrue(listeDe.indexOf(deAtrouver) == 0);
    }

    @Test
	public void containsTest(){
        assertTrue(listeDe.contains(deAtrouver) == true);
    }

    @Test
	public void iteratorTest(){

        Iterator<De> ite = listeDe.iterator();
        
        int[] tab = new int[6];
        int[] tabCompare = {1,2,3,4,5,6};

        int compteTour = 0;
        while (ite.hasNext()){
            tab[compteTour] = ite.next().getValeurCourrante();

            compteTour++;
        }
        String tabString = Arrays.toString(tab);
        String tabCompareString = Arrays.toString(tabCompare);

        assertTrue(tabString.equals(tabCompareString));
    }

    @Test
	public void removeTest(){
        listeDe.remove(deAtrouver);
        int size= listeDe.size();
        boolean contains = listeDe.contains(deAtrouver);

        assertTrue(listeDe.contains(deAtrouver) == false && listeDe.size() == 5);
    }





	
}
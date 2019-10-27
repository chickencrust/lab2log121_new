package tests;

import org.junit.*;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import framework.CollectionTableau;
import framework.De;
import java.util.Iterator;

public class CollectionTableauTest {

	private CollectionTableau<De> ct;
    private De deAtrouver;
    

	@Before
	public void faireAvant(){
        ct = new CollectionTableau<De>();
        deAtrouver = new De(6,1);
        
        //Size = 6
        //DeATrouver index = 1
        ct.add(deAtrouver);
        ct.add(new De(6,2));
        ct.add(new De(6,3));
        ct.add(new De(6,4));
        ct.add(new De(6,5));
        ct.add(new De(6,6));

	}

	@Test
	public void sizeTest(){
		assertTrue(ct.size()==6);
	}

    @Test
	public void isEmptyTest(){
		assertTrue(ct.isEmpty()==false);
    }
    
    @Test
	public void indexOfTest(){
		assertTrue(ct.indexOf(deAtrouver) == 0);
    }

    @Test
	public void containsTest(){
        assertTrue(ct.contains(deAtrouver) == true);
    }

    @Test
	public void iteratorTest(){

        Iterator<De> ite = ct.iterator();
        
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
        ct.remove(deAtrouver);
        int size= ct.size();
        boolean contains = ct.contains(deAtrouver);

        assertTrue(ct.contains(deAtrouver) == false && ct.size() == 5);
    }





	
}
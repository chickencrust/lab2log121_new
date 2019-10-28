package framework;
import java.util.Iterator;


public class IterateurListe<E> implements Iterator<E> { 
    private int position;
    private Liste<E> liste;
    
    // initialize pointer to head of the list for iteration 
    public IterateurListe(Liste<E> liste)     { 
        this.liste = liste;
        position = 0;
    } 
      
    public boolean hasNext() {
        if (position < liste.compteElement)
            return true;
        else
            return false;
    }

    public E next() {
        if (this.hasNext())
            return liste.tab[position++];
        else
            return null;
    }

    public void goToFirst(){
        position = 0;
    }

    @Override
    public void remove() {

    }
}

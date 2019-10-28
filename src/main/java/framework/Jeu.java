package framework;

public class Jeu {

    private Liste<Joueur> cj;
    private Liste<De> cd;
    
    private IStrategie strat;

    private int nbTours;
    private int desParTour;
    private int compteTour;

    public Jeu(){
        cj = new Liste<Joueur>();
        cd = new Liste<De>();
    }

    public Liste<Joueur> calculerLeVainqueur(){
        return strat.calculerLeVainqueur(this);
    };
    public boolean calculerScoreTour(){
        return strat.calculerScoreTour(this);
    };



}
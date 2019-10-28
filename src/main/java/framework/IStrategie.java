package framework;

public interface IStrategie {
    public Liste<Joueur> calculerLeVainqueur(Jeu jeu);
    public boolean calculerScoreTour(Jeu jeu);
}
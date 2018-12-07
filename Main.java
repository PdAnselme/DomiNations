package domination;
import java.util.*;


public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int nombreJoueur = 4;
		ArrayList<Joueur> listeJoueur = new ArrayList<Joueur>();
		
		for (int i = 1 ;i <= nombreJoueur; i++) {
			System.out.println("entrer un pseudo pour le joueur " + i);		
			String pseudo = scan.nextLine();
			listeJoueur.add(new Joueur(pseudo));
		}
		//initialisation du magsin, donc de la pioche et des dominos choisissables
		Magasin magasin = new Magasin(nombreJoueur);
		

	}
	
	private void afficheFenetre() {
		
	}
	
	private void designeGagnant() {
		
	}
	
	
	
	
	

}

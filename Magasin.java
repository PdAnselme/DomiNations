package domination;

import java.util.*;



public class Magasin {
	private Queue<Domino> pioche = new ArrayDeque<>();
	private ArrayList<Domino> dominosChoisis = new ArrayList<Domino>();
	private ArrayList<Domino> dominosAChoisir = new ArrayList<Domino>();
	
	public Magasin(int nombreJoueur) {
		switch (nombreJoueur) {
		case 4:
			
			for (int i=1; i<49; i++) {				
				pioche.add(new Domino(i,new Verso("plaine","mine",0,1)));
			}
			break;
		case 3:
			break;
		case 2:
			break;		
		}
		
		for (int i=1;i <= 4; i++) {			
			Domino domino = pioche.poll();
			domino.setToTake(true);			
			this.dominosAChoisir.add(domino);
		}
		
	}

	public List<Domino> getDominosChoisis() {
		return dominosChoisis;
	}

	public void setDominosChoisi(ArrayList<Domino> dominosChoisi) {
		this.dominosChoisis = dominosChoisi;
	}

	public List<Domino> getDominosAChoisir() {
		return dominosAChoisir;
	}

	public void setDominoAChoisir(ArrayList<Domino> dominosAChoisir) {
		this.dominosAChoisir = dominosAChoisir;
	}
	
	
	
	
}

package domination;

public class Joueur {
	private String pseudo;
	private int nombrePoints;
	private String statut;
	private boolean isPlaying;
	public Plateau plateau;
	
	
	
	
	public Joueur(String pseudo) {
		
		this.pseudo = pseudo;
		this.nombrePoints = 0;
		this.statut = "neutre";
		this.isPlaying = false;
		this.plateau = new Plateau();
	}

	public Domino choixDomino(int index,Magasin magasin) {
	
		return  magasin.getDominosAChoisir().get(index);
	}

	public void placeDomino() {
		
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public int getNombrePoints() {
		return nombrePoints;
	}

	public void setNombrePoints(int nombrePoints) {
		this.nombrePoints = nombrePoints;
	}

	public String getStatut() {
		return statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}

	public boolean isPlaying() {
		return isPlaying;
	}

	public void setPlaying(boolean isPlaying) {
		this.isPlaying = isPlaying;
	}

	public Plateau getPlateau() {
		return plateau;
	}

	public void setPlateau(Plateau plateau) {
		this.plateau = plateau;
	}
	
	
	
	
}

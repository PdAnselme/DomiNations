package domination;

public class Domino {
	
	private int numeroDomino;	
	private boolean isPlaced;
	private Joueur proprietaire;
	private boolean isToTake;
	private String terrain1;
	private String terrain2;
	private int couronne1;
	private int couronne2;
	private int x1;
	private int y1;
	private int x2;
	private int y2;
	private int orientation;
	
	public Domino(int numeroDomino, int couronne1,String terrain1, int couronne2,String terrain2) {
		super();
		this.numeroDomino = numeroDomino;
		this.terrain1 = terrain1;
		this.terrain2 = terrain2;
		this.couronne1 = couronne1;
		this.couronne2 = couronne2;		
		this.isPlaced = false;		
		this.isToTake = false;
		
		
		
	
	}

	public String getTerrain1() {
		return terrain1;
	}

	public void setTerrain1(String terrain1) {
		this.terrain1 = terrain1;
	}

	public String getTerrain2() {
		return terrain2;
	}

	public void setTerrain2(String terrain2) {
		this.terrain2 = terrain2;
	}

	public int getCouronne1() {
		return couronne1;
	}

	public void setCouronne1(int couronne1) {
		this.couronne1 = couronne1;
	}

	public int getCouronne2() {
		return couronne2;
	}

	public void setCouronne2(int couronne2) {
		this.couronne2 = couronne2;
	}

	public int getX1() {
		return x1;
	}

	public void setX1(int x1) {
		this.x1 = x1;
	}

	public int getY1() {
		return y1;
	}

	public void setY1(int y1) {
		this.y1 = y1;
	}

	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public int getY2() {
		return y2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
	}

	public int getOrientation() {
		return orientation;
	}

	public void setOrientation(int orientation) {
		this.orientation = orientation;
	}

	public int getNumeroDomino() {
		return numeroDomino;
	}

	public void setNumeroDomino(int numeroDomino) {
		this.numeroDomino = numeroDomino;
	}

	

	public boolean isPlaced() {
		return isPlaced;
	}

	public void setPlaced(boolean isPlaced) {
		this.isPlaced = isPlaced;
	}

	public Joueur getProprietaire() {
		return proprietaire;
	}

	public void setProprietaire(Joueur proprietaire) {
		this.proprietaire = proprietaire;
	}

	public boolean isToTake() {
		return isToTake;
	}

	public void setToTake(boolean isToTake) {
		this.isToTake = isToTake;
	}
	
	
	
}
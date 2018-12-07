package domination;

public class Plateau{
	Joueur joueur;
	int[][] quadrillage = new int[9][9];
	public Plateau() {
		for (int i=0; i<9; i++) {
			for (int j=0; j<9; j++) {
				quadrillage[i][j]=0;
			}
		}
	}
	
	

}
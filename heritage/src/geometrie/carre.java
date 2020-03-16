package geometrie;

public class carre extends geometrie {

	@Override
	public void PeriRec(int longueur, int largeur) {
		System.out.println("");
		
	}

	@Override
	public void AireRec(int longueur, int largeur) {
		System.out.println("");
		
	}
	
	
	

	@Override
	public void PeriCarre(int cote) {
			int resCP=cote*4;
			System.out.println("Le perimetre du carre est : "+resCP+" cm");
			
	}

	@Override
	public void AireCarre(int cote) {
			int resCA=cote*cote;
			System.out.println("L'air du carre est : "+resCA+" cm2");
	}


}

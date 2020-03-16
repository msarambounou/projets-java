package geometrie;

public class rectangle extends geometrie {

	@Override
	public void PeriRec(int longueur, int largeur) {
			int resRP=2*(longueur+largeur);
			System.out.println("Le perimetre du rectangle est : "+resRP+".");
	}

	@Override
	public void AireRec(int longueurs, int longueur) {
			int resAR= longueur*longueurs;
			System.out.println("Le perimetre du rectangle est : "+resAR+".");
			
	}



	@Override
	public void PeriCarre(int cote) {
		System.out.println("");
		
	}

	@Override
	public void AireCarre(int cote) {
		System.out.println("");
		
	}

}

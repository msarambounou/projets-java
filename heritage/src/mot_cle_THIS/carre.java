package mot_cle_THIS;

public class carre {
	int cote;
	
	public void perimetre(int cote){
		this.cote=cote;
		int peri=cote*4;
		System.out.println("le perimetre du carre est "+peri+"cm2.");
		
		
		
	}
	
	public void air(int cote) {
		this.cote=cote;
		int aire=cote*cote;
		System.out.println("l'air du carre est "+aire+"cm3.");
		
		
	}
	

}

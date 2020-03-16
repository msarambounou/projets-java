package euro_franc_dollard;

public class conv_euro {
	int prix;
	
	
	public void franc(int prix) {
		this.prix=prix;
		int cfa=prix*655;
		System.out.println(""+prix+" euro est égale à "+cfa+" franc CFA.");
		
		}
	
	public void dollard(int prix) {
		this.prix=prix;
		double dol=prix*1.08;
		System.out.println(""+prix+" euro est égale à "+dol+"$ (Dollard).");
		
		}
	
	public void dollard_cana(int prix) {
		this.prix=prix;
		double dol=prix*1.45;
		System.out.println(""+prix+" euro est égale à "+dol+"$ (Dollard Canadien).");
		
		}
	
		
}

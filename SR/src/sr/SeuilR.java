package sr;

public class SeuilR {
	private int cf;
	private int pv_ht;
	private int cv_uni;
	private int nb_produit_vendu;
	private int mcvu=pv_ht-cv_uni;
	private int sr_volume=cf*mcvu;
	private int sr_valeur=sr_volume*nb_produit_vendu;
	
	
	
	
	public void sr_volume_valeur(int cf, int pv_ht, int cv_uni,int nb_produit_vendu) {
		int mcvu=pv_ht-cv_uni;
		int sr_volume=cf/mcvu;
		int sr_valeur=sr_volume*nb_produit_vendu;
	
		System.out.println("Votre marge sur cout varible unitaire est "+mcvu+".");
		System.out.println("Votre seuil de rentabilité en volume est "+sr_volume+".");
		System.out.println("Votre seuil de rentabilité en volume est "+sr_valeur+".");
		
	}
	

	
}

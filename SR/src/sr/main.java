package sr;
import java.util.Scanner;

public class main {


	public static void main(String[] args) {
		
		SeuilR RS = new SeuilR();
		
		
		
		System.out.println("Saisissez vos charges fixe :");
		Scanner sc = new Scanner(System.in);
		int mon_cf = sc.nextInt();
		
		
		System.out.println("Saisissez votre prix de vente unitaire HT :");
		Scanner sc2 = new Scanner(System.in);
		int mon_pv_ht = sc.nextInt();
		
		
		System.out.println("Saisissez votre charge variable unitaire :");
		Scanner sc3 = new Scanner(System.in);
		int mon_cv_uni = sc.nextInt();
		
		System.out.println("Saisissez votre de nombre total de produit vendu  :");
		Scanner sc4 = new Scanner(System.in);
		int mon_nb_produit_vendu = sc.nextInt();
		
		
		
		
		RS.sr_volume_valeur(mon_cf, mon_pv_ht, mon_cv_uni, mon_nb_produit_vendu);
		

	}
	

}

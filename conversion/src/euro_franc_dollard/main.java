package euro_franc_dollard;
import java.util.Scanner;

public class main {


	
	public static void main(String[] args) {
		
		System.out.println("Ce programme convertie les Euro(€) en Fran CFA ");
		System.out.println("-----------------------------------------------------------------");
		System.out.println("Entrez le montant en EURO ");	
		
		Scanner sc = new Scanner(System.in);
		int mon_prix = sc.nextInt();
		
		
		conv_euro f = new conv_euro();
		f.franc(mon_prix);
		
		conv_euro d = new conv_euro();
		d.dollard(mon_prix);
		
		conv_euro trird = new conv_euro();
		trird.dollard_cana(mon_prix);
		
		
		
		}
	
	
		
		

	
	
		
		

	}



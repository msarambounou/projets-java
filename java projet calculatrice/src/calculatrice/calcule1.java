package calculatrice;
import java.util.Scanner;

public class calcule1 {

	public static void main(String[] args) {
		Scanner saisie = new Scanner(System.in);
		
		
			System.out.println("Saisissez la première valeur");
			float nb1 = saisie.nextInt();
			
			System.out.println("Saisissez la deuxième valeur");
			float nb2 = saisie.nextInt();
			
			System.out.println("Saisissez l'opération");
			System.out.println("Pour l'addition: +");
			System.out.println("Pour soustraction: -");
			System.out.println("Pour la multiplication *");
			System.out.println("Pour la division: /");
			char op = saisie.next().charAt(0);
			float res = 0;
			boolean erreur = false;
			switch(op) 
			{
				case '+' : res = nb1+nb2 ;break;
				case '-' : res = nb1-nb2 ;break;
				case '*' : res = nb1*nb2 ;break;
				case '/' : res = nb1/nb2 ;break;
				default : erreur = true;
			}
			
			if (erreur)
				System.out.println("Operateur inconnu\n");
			else
				System.out.println("L'opération " + nb1 + op + nb2 + "=" + res);
			
			
			System.out.println("Voulez-vous recommencer ? (O/N)");
			int Rep = saisie.next().charAt(0);
		}
	}









		


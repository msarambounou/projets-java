package boucle_for;
import java.util.Scanner;

public class main {


	public static void main(String[] args) {
		
		operattion ope = new operattion();
		
		
		System.out.println("Entrez un nombre entier");	
		
		
		Scanner sc = new Scanner(System.in);
		int mon_nb = sc.nextInt();
		System.out.println("-----------------------------------------------------------------");
		ope.multiplication(mon_nb);
		
		ope.addition(mon_nb);

	}

}

package boucle_for;

public class operattion {
	int nb;
	int j;
	
	
	
	public void multiplication(int nb) {
		this.nb=nb;
		
		System.out.println("La table de mutiplication de "+nb+" est :");
		
		for (int i = 0; i <=10 ;i++)
			
			System.out.print(nb + "x"+i+"="+i*nb+"  ");  
		System.out.println("");
		System.out.println("");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void addition(int nb) {
		this.nb=nb;
		System.out.println("Table d'addition de "+nb+" est :");
		
		for (int i = 0; i <=10 ;i++)
		
		
		System.out.print(nb + "+"+i+"="+(i+nb)+"  ");   
	}
	

}

package heritage;

import java.applet.Applet;

public class Main {
	public static void main(String[] args) {
		
		//--- INSTANTIATION ----------------
		apple a = new apple();
		
		//accéder aux champs (fonction) apres ! INSTANTIATION !
		a.taste();
		a.getsiez();
		a.miam();
		
		
		PineApple pen = new PineApple();
		pen.taste();
		pen.miam();
		
	}

}

import java.util.*;

public class Ejercicio_2 {
	
	public static String invertir(String texto) {
		
		int i=0, largo=0;
		String invert = "";
		
		largo = texto.length();
		for(i = largo ; i > 0 ; i--) {
			
			invert = invert + texto.charAt(i-1);
		}
		return invert;			
	}

	public static void main(String[] args) {
		
		String tx1 = " ", tx2="";
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese texto");
		tx1 = teclado.nextLine();
		tx2 = invertir(tx1);
		
		System.out.println(tx2);
		
	}


}

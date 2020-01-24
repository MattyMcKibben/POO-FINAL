import java.util.*;
public class Ejercicio_1 {
	
	public static String concatenar(String txt1 , String txt2 , String txt3) {
		
		String conc = " ";
		
		conc = txt1.concat(" " + txt2.concat(" " + txt3));
		
		return conc;
	}
	public static void main(String[] args) {
		
		String tx1="",tx2="",tx3= " ",aux="";
		
		Scanner teclado = new Scanner(System.in);
				
		System.out.println("Dame texto 1: ");
		tx1 = teclado.nextLine();
		
		System.out.println("Dame texto 2: ");
		tx2 = teclado.nextLine();
		
		System.out.println("Dame texto 3: ");
		tx3 = teclado.nextLine();
		
		aux = concatenar(tx1,tx2,tx3);
		
		System.out.print(aux);
		
	}


}	

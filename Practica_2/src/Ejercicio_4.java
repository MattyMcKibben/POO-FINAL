import java.util.Scanner;

public class Ejercicio_4 {
	
public static int vocales(String txt) {
		
		char voc = ' ';
		int c = 0,  tam = 0, i;

		
		txt = txt.toLowerCase();
		
		tam = txt.length();
		
		for(i = 0; i < tam; i++) {
			
			voc = txt.charAt(i);
			
			if(voc == 'a' || voc == 'e' || voc == 'i' || voc == 'o' || voc == 'u') {
				
				c++;
			}
		}
		
		return c;
	}
	
	public static void main(String[] args) {
		
		String texto = " ";
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese texto: ");
		texto = teclado.nextLine();
		
		System.out.println("Cantidad de vocales:" + vocales(texto));
	}

	

}

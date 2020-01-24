import java.util.Scanner;

public class Ejercicio_6 {
	
public static int contarPalabras(String txt) {
	
		int c = 1, aux = 0,i = 0;
		aux = txt.indexOf(" ",i);		
		while(aux != -1) {			
			i = aux + 1;
			c++;
			aux = txt.indexOf(" ",i);
		}
		
		return c;
	}
	
	public static void main(String[] args) {
		
		String texto = " ";		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese texto: ");
		texto = teclado.nextLine().trim();
		System.out.println("Cantidad de palabras: " + contarPalabras(texto));
	}

}

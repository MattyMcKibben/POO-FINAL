import java.util.Scanner;

public class Ejercicio_5 {

	
	public static int vocalesdist(String txt) {
		
		char voc = ' ';
		int res = 0, tam = 0, f;
		
		int a=0,e=0,i=0,o=0,u=0;
		
		txt = txt.toLowerCase();
		
		tam = txt.length();
		
		for(f = 0; f < tam;f++) {
			
			voc = txt.charAt(f);
			
			switch(voc) {
			
			case 'a':	a=1;	break;
			case 'e':	e=1;	break;
			case 'i':	i=1;	break;
			case 'o':	o=1;	break;
			case 'u':	u=1;	break;
			
			}
			
		}
		res = a+e+i+o+u;
		return res;
	}
	
	public static void main(String[]args) {
		
		String texto = "";
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese texto: ");
		texto = teclado.nextLine();
		
		System.out.println("Vocales distintas: " + vocalesdist(texto));
			
		
	}
	
}

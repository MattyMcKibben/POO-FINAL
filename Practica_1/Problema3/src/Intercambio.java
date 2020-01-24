import java.util.Scanner;

public class Intercambio {
	
	public static void main(String[] args) {
		
		int n1=0,n2=0,aux=0;
			
			Scanner teclado = new Scanner(System.in);
			
			System.out.println("Ingrese el valor del primer numero: ");
			n1 = teclado.nextInt();
			System.out.println("Ingrese el valor del segundo numero: ");
			n2 = teclado.nextInt();
			
			aux = n1;
			n1=n2;
			n2=aux;
			
			System.out.println("Primer numero es: " + n1);
			System.out.println("Segundo numero es: " + n2);
		}

	}
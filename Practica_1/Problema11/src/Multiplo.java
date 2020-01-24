import java.util.Scanner;
public class Multiplo {

	public static void main(String[] args) {
		int m,n,q;
		
			Scanner teclado = new Scanner(System.in);
			
			System.out.println("Ingrese el valor de m: ");
			m = teclado.nextInt();
			
			System.out.println("Ingrese el valor de n: ");
			n = teclado.nextInt();
			
			System.out.println("Ingrese el valor de q: ");
			q = teclado.nextInt();
			
			if(m % n == 0 && m % q == 0) {
				System.out.println(m + " es multiplo de " + n + " y " + q);
			}else {
				System.out.println(m + " no es multiplo de " + n + " y " + q);
			}

	}

}
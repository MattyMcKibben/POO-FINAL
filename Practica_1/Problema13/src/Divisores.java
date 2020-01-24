import java.util.Scanner;
public class Divisores {
	public static void main(String[] args) {	
		int a,b,i=1;		
			Scanner teclado = new Scanner(System.in);
			
			System.out.println("Ingrese el primer numero: ");
			a = teclado.nextInt();
			
			System.out.println("Ingrese el segundo numero: ");
			b = teclado.nextInt();
			
			while(i<a || i<b) {
				
				if(a % i == 0 && b % i == 0) {
					System.out.println(i + " es divisor comun\n");
				}
			
			i++;
		}
	}
}
import java.util.Scanner;
public class Positivos {
	
	public static void main(String[] args) {
	
int a,b,c;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese el primer numero: ");
		a = teclado.nextInt();
		
		System.out.println("Ingrese el segundo numero: ");
		b = teclado.nextInt();
		
		if(a>0 && b>0) {
			
			c = a*b;
			System.out.println("El producto es: " + c);
			
		}else {
			
			c = a+b;
			System.out.println("La suma es: " + c);
		}
	}
}

import java.util.Scanner;

public class SumaCubos {
	
	public static void main(String[] args) {
		
		int n=0;
		double s;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese la cantidad de terminos a sumar: ");
		n = teclado.nextInt();
		
		s=Math.pow((n*(n+1)/2), 2);
		
		System.out.println("La suma de cubos de los " + n + " primeros numeros naturales es: " + s);	

	}
}
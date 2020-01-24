import java.util.Scanner;

public class Union {
	public static void main(String[] args) {
		int a,b,num;
		
			Scanner teclado = new Scanner(System.in);
			
			System.out.println("Ingrese el primer numero(dia de nacimiento y mes): ");
			a = teclado.nextInt();
			
			System.out.println("Ingrese el segundo numero (edad): ");
			b = teclado.nextInt();
			
			num = (((a*2 + 5)*50 + b)+365) - 615;
			
			System.out.println("El primer numero es: " + num);
	}
		
}


import java.util.Scanner;
public class ParImpar {

	public static void main(String[] args) {
		int num=0;			
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese un numero: ");
		num = teclado.nextInt();
			
		if(num%2==0) {		
		System.out.println("es par");
		}else {
				
		System.out.println("es impar");
		}
	}
}	



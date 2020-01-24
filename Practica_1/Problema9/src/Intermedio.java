import java.util.Scanner;
public class Intermedio {

	public static void main(String[] args) {
		int n1,n2,n3,aux;
		
			Scanner teclado = new Scanner(System.in);
			
			System.out.println("primer numero: ");
			n1 = teclado.nextInt();
			
			System.out.println("segundo numero: ");
			n2 = teclado.nextInt();
			
			System.out.println("tercer numero: ");
			n3 = teclado.nextInt();
			
			if(n1>n2&&n1>n3) {
				if(n2>n3) {
					aux=n2;
				}else {
					aux=n3;
				}
				
			}else {
				if(n2>n1&&n2>n3) {
					if(n1>n3) {
						aux=n1;
					}else {
						aux=n3;
					}
				}else {
					if(n1>n2) {
						aux=n1;
					}else {
						aux=n2;
					}
				}
			}
			
		System.out.println("El numero intermedio es: " + aux);
			
	}
}



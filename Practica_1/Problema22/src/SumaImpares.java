import java.util.Scanner;
public class SumaImpares {
	public static void main(String[] args) {	
			int n,i=1,s=0;
				Scanner teclado = new Scanner(System.in);
				
				System.out.println("El ultimo numero de la series es: ");
				n = teclado.nextInt();
				
				while(i<=n) {
					if(i % 2 != 0) {
						System.out.print(i + " ");
						s+=i;
					}
					i++;
				}
				
				System.out.println("La suma de impares desde el 1 hasta el " + n + " es " + s);
				
	}
}
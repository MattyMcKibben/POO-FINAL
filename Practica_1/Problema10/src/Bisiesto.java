import java.util.Scanner;
public class Bisiesto {

	public static void main(String[] args) {
		int a,aux=0;
			
			Scanner teclado = new Scanner(System.in);
			
			System.out.println("Ingrese el a�o: ");
			a = teclado.nextInt();
			
			if(a % 4 == 0){
				aux=1;
				if(a % 100 == 0){
					aux=0;
					if(a % 400 == 0){
						aux=1;
					}
				}
			}
			
			if(aux!=0){
				System.out.println("El a�o es bisiesto");
			}else{
				System.out.println("El a�o no es bisiesto");
			}

	}

}

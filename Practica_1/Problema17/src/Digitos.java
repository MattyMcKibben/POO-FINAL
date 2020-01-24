import java.util.Scanner;
public class Digitos {
	public static void main(String[] args) {
		int num,aux,dig,c=0;
			Scanner teclado = new Scanner(System.in);
			
			System.out.println("Ingrese un numero: ");
			num = teclado.nextInt();
			aux=num;
			while(num>0){
				dig=num%10;
				c=c+1;
				num=num/10;	
			}
			
			System.out.println("El numero "+ aux + " tiene " + c + " digitos");
		}

	}

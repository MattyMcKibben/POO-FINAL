import java.util.Scanner;
public class SumaCifras {
	public static void main(String[] args) {	
		int num,dig,s,c;			
			Scanner teclado = new Scanner(System.in);
			
			System.out.println("Ingrese un numero: ");
			num = teclado.nextInt();
			c=0;	s=0;
			while(num>0){
				dig=num%10;
				s=s+dig;
				c++;
				num=num/10;	
		}		
			System.out.println("La suma de digitos es: " + s);
	}
}
import java.util.Scanner;
public class DigitosParesImpares {
	public static void main(String[] args) {
		int num,dig,c=0,par=0;
		
			Scanner teclado = new Scanner(System.in);
		
			System.out.println("Ingrese un numero: ");
			num = teclado.nextInt();
		
			while(num>0){
				dig=num%10;
				if(dig % 2 == 0)
					par++;
				
				c=c+1;
				num=num/10;	
			}
		
			System.out.println("El numero tiene " + c + " digitos en total y " + par + " son pares");
	}

}
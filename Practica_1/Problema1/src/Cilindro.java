import java.util.Scanner;
public class Cilindro {

	public static void main(String[] args) {
		float r=0,h=0;
		double area=0;
	
			Scanner teclado= new Scanner(System.in);
			
			System.out.println("Ingrese el valor del radio: ");
			r = teclado.nextFloat();
			System.out.println("Ingrese el valor de la altura: ");
			h = teclado.nextFloat();
			
			area = 2*3.1416*r*h;
			System.out.println("El area del cilindro recto es: " + area);	
	}

}

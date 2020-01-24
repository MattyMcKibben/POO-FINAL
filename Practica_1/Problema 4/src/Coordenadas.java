import java.util.Scanner;

public class Coordenadas {
	
	public static void main(String[] args) {

			float x1,y1,x2,y2,d;
			double d1;
				Scanner teclado = new Scanner(System.in);
				
				System.out.println("Ingrese la abscisa del primer punto: ");
				x1 = teclado.nextFloat();
				System.out.println("Ingrese la ordenada del primer punto: ");
				y1 = teclado.nextFloat();
				System.out.println("Ingrese la abscisa del segundo punto: ");
				x2 = teclado.nextFloat();
				System.out.println("Ingrese la ordenada del segundo punto: ");
				y2 = teclado.nextFloat();
				
				d = (x1-x2)*(x1-x2)+(y1-y2)*(y1-y2);
				
				d1 = Math.sqrt(d);
				
				System.out.println("La distancia entre los dos puntos dados es: " + d1);

	}

}
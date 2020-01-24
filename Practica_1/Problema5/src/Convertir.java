import java.util.Scanner;
public class Convertir {

	public static void main(String[] args) {
		int ang,g,m,s;
		double temp;
				
			Scanner teclado = new Scanner(System.in);
			
			System.out.println("Ingrese un angulo(en radianes): ");
			ang= teclado.nextInt();
			
			temp = ang*180/Math.PI;
			g = (int) Math.floor(temp);
			temp = 60*(temp-g);
			m = (int) Math.floor(temp);
			temp = 60*(temp-m);
			s = (int) Math.floor(temp);
			
			System.out.println("El angulo ingresado equivale a : " + g + "grados, " + m + "min, y " + s + " segundos.");
	}

}

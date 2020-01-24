import java.util.Scanner;
public class Triangulos {

	public static void main(String[] args) {
			
			int a,b,c,aux;
				
				Scanner teclado = new Scanner(System.in);
				
				System.out.println("Ingrese la longitud del primer lado: ");
				a = teclado.nextInt();
				
				System.out.println("Ingrese la longitud del segundo lado: ");
				b = teclado.nextInt();
				
				System.out.println("Ingrese la longitud del tercer lado: ");
				c = teclado.nextInt();
				
				
				
				if(a>0 && b>0 && c>0){
					if(b>a-c && b<a+c){
						aux=1;
						System.out.println("El triangulo existe");
						
						if(a==b && b==c){
							System.out.println("Triangulo equilatero");
							
						}else{
							if(a==b || a==c || b==c){
								System.out.println("Triangulo isosceles");
								
							}else{
								System.out.println("Triangulo escaleno");
								

					}
				}
			}
		}
	}
}

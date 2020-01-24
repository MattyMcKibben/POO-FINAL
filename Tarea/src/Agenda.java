import java.util.Scanner;
public class Agenda{
	static Contacto[] listaContacto = new Contacto[3];
	public static void agregarContacto(Contacto[] arreglo) {
		
		Scanner teclado= new Scanner(System.in);
		
		for( int c=0; c<arreglo.length; c++) {
			
			System.out.println("Contacto n° " + (c+1) + ": ");
			System.out.println("Nombre: ");
			String nomb = teclado.nextLine();//nombre
		
			System.out.println("Sueldo: ");
			double sue = teclado.nextDouble(); //s=sueldo
			
			System.out.println("Edad: ");
			int ed = teclado.nextInt(); //ed=edad
			
			arreglo[c] = new Contacto(nomb,sue,ed);
			
			teclado.nextLine();
			
		}
	}
	
	
	public static void mostrarContacto(Contacto[] arr) {
		
		System.out.println("\nNombre\t\tSalario\t\tEdad");
		System.out.println("=======================================");
		for( int i=0; i<arr.length; i++) {
			System.out.println(arr[i]+ " \t\t ");
		}
	}
	
	public static void eliminarContacto() {
		
		String opc = "S";
		Scanner teclado = new Scanner(System.in);

		System.out.println("Ingrese la posición a eliminar: ");
		int indice = teclado.nextInt();
		listaContacto[indice-1] = null;
		System.out.println("Contacto eliminado con exito");
			
		System.out.println("Desea eliminar otro contacto? (S/N): ");
		String aux = teclado.nextLine();
		opc = aux.toUpperCase();
		teclado.nextLine();
			
		if(opc == "S") {
			eliminarContacto();
		}

	}
	public static void main(String[] args) {
		agregarContacto(listaContacto);
		mostrarContacto(listaContacto);
		eliminarContacto();
		mostrarContacto(listaContacto);
	}

}
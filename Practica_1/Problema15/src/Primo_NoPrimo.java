import java.util.Scanner;
public class Primo_NoPrimo {
     public static void main(String[] args) {
	        Scanner teclado = new Scanner(System.in);
	        int c=0,i,n;
	        System.out.println("Ingrese el numero:");
	        n=teclado.nextInt();
	        for(i=1;i<(n+1);i++){
	        if(n%i==0){
	            c++;
	           }
	        }
	        if(c!=2){
	             System.out.println("El numero no es primo");
	           }
	        else{
	             System.out.println("El numero es primo");
	           }
     	}		
}

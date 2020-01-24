import java.util.Scanner;
public class SumaSerie {
	public static void main(String[] args) {
		int n,t,i,j,c,aux,sum=0;
			Scanner teclado = new Scanner(System.in);
			
			System.out.println("Cantidad de terminos de la sumatoria: ");
			n = teclado.nextInt();
			
			t=1;	aux=1;	j=1;	c=0;
			for(i=0;i<n;i++){
				sum = sum + t;
				System.out.print(t + " ");
				if(i<n-1)
					System.out.print("+ ");
				if(aux==1){
					t=t+j;
					aux=0;
					j++;
				}else{
					t=t-c;
					aux=1;
					c++;
			}
		}
		
		System.out.println("La suma de la serie es: " + sum);
	}
}
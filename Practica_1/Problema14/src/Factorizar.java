import java.util.Scanner;
class Factorizar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;
        int divisor = 2;

        System.out.print("Introduce el número que se va a factorizar: ");
        num = teclado.nextInt();
        System.out.print( num + " = ");     

        while(num != 1) {
            if(num % divisor == 0){
            	if(divisor<=num) {
                System.out.print(divisor + "*");
                num = num / divisor;
            	}
            	if(divisor==num) {
                    System.out.print(divisor);
                    num = num / divisor;
                	}         	
            }else {
                divisor++;
         }
      }
   }
}
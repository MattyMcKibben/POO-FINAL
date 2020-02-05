import java.util.Scanner;
public class LinearEquation {
	      private int a,b,c,d,e,f;
	      
	      LinearEquation(int a,int b,int c,int d,int e,int f){
	          this.a=a;
	          this.b=b;
	          this.c=c;
	          this.d=d;
	          this.e=e;
	          this.f=f;
	      }

	    public int getA() {
	        return a;
	    }

	    public int getB() {
	        return b;
	    }

	    public int getC() {
	        return c;
	    }

	    public int getD() {
	        return d;
	    }

	    public int getE() {
	        return e;
	    }

	    public int getF() {
	        return f;
	    }
	      boolean isSolvable(){
	          boolean resp=false;
	          if((a*d-b*c)!=0){
	              resp=true;
	          }
	          return resp;
	      }
	      
	      float getX(){
	          float r;
	          r=(c*d-b*f)/(a*d-b*c);
	          
	          return r;
	      }
	      float getY(){
	          float r;
	          r=(a*f-e*c)/(a*d-b*c);
	          
	          return r;
	      }

	    public void setA(int a) {
	        this.a = a;
	    }

	    public void setB(int b) {
	        this.b = b;
	    }

	    public void setC(int c) {
	        this.c = c;
	    }

	    public void setD(int d) {
	        this.d = d;
	    }

	    public void setE(int e) {
	        this.e = e;
	    }

	    public void setF(int f) {
	        this.f = f;
	    }
	      
	        public static void main(String args[]) {
	             Scanner teclado= new Scanner(System.in);
	             LinearEquation L= new LinearEquation(0,0,0,0,0,0);
	             System.out.print("Digite a: ");L.setA(teclado.nextInt());
	             System.out.print("Digite b: ");L.setB(teclado.nextInt());
	             System.out.print("Digite c: ");L.setC(teclado.nextInt());
	             System.out.print("Digite d: ");L.setD(teclado.nextInt());
	             System.out.print("Digite e: ");L.setE(teclado.nextInt());
	             System.out.print("Digite f: ");L.setF(teclado.nextInt());
	             
	             if(L.isSolvable()==true){
	                 System.out.println("X es igual a: "+L.getX());
	                 System.out.print("y es igual a: "+L.getY());
	             }else
	                 System.out.print("The equation has not solution");
	}
}


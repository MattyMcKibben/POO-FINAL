import java.util.Scanner;
public class Quadratic_equation {

	  public static void main(String[] args) {
	    Scanner teclado = new Scanner(System.in);
	    System.out.print("Enter a, b, c: ");
	    double a = teclado.nextDouble();
	    double b = teclado.nextDouble();
	    double c = teclado.nextDouble();

	    QuadraticEquation equation = new QuadraticEquation(a, b, c);
	    double discriminant = equation.getDiscriminant();

	    if (discriminant < 0) {
	      System.out.println("La ecuación no tiene raíces reales.");
	    }
	    else if (discriminant == 0)
	    {
	      System.out.println("La raíces son reales, iguales y tienen el valor de: " + equation.getRoot1());
	    }
	    else // (discriminante >= 0)
	    {
	      System.out.println("Las raíces son " + equation.getRoot1() 
	        + " and " + equation.getRoot2());
	    }  
	  }
	}

	class QuadraticEquation {
	  private double a;
	  private double b;
	  private double c;

	  public QuadraticEquation(double m, double n, double p) {
	    a = m;
	    b = n;
	    c = p; 
	  }
	  
	  double getA() {
	    return a;
	  }

	  double getB() {
	    return b;
	  }

	  double getC() {
	    return c;
	  }

	  double getDiscriminant() {
	    return b * b - 4 * a * c;
	  }

	  double getRoot1() {
	    if (getDiscriminant() < 0)
	      return 0;
	    else {
	      return (-b + getDiscriminant()) / (2 * a);
	    }
	  }

	  double getRoot2() {
	    if (getDiscriminant() < 0)
	      return 0;
	    else {
	      return (-b - getDiscriminant()) / (2 * a);
	    }
	}
}

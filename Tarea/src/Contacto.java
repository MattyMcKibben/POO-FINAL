public class Contacto {
	
	String nombre;
	int edad;
	double sueldo;
	
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public double getSueldo() {
		return sueldo;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public Contacto() {
		
	}
	
	public Contacto(String nombre, double sueldo, int edad) {
		
		this.nombre = nombre;
		this.sueldo= sueldo;
		this.edad = edad;
		
	}
	
	public String toString() {
		return this.nombre + "\t\t" + this.sueldo + "\t\t" + this.edad;
	}

}

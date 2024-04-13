package Vehiculo;

	/*1. Crea todas las clases e interfaces en un paquete llamado Vehiculo.
	 *2. Crea correctamente la clase abstracta Vehículo.   
	a. Declara y define correctamente el tipo y los atributos indicados.    
	b. Declara y define correctamente un atributo de clase con el tipo y nombre 
	indicados.  
	c. Declara e implementa correctamente un constructor de 4 parámetros. Los 
	parámetros son del tipo indicado.  
	d. Declara e implementa los métodos getter correspondientes a los atributos 
	declarados en la clase. Los 5 métodos realizan la función deseada.  
	e. Declara e implementa correctamente el método toString y muestra en pantalla 
	todos los datos que se piden.    
	 */

public abstract class Vehiculo {

	protected String marca;
	protected String modelo;
	protected String vin;
	protected int numPuertas;
	protected double kilometraje;
	static int CantidadVehiculosFuncionando;
	
	public int getNumPuertas() {
		return numPuertas;
	}

	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}

	public double getKilometraje() {
		return kilometraje;
	}

	public void setKilometraje(double kilometraje) {
		this.kilometraje = kilometraje;
	}
	
	public Vehiculo(String marca, String modelo, String vin, int numPuertas) {
		this.marca= marca;
		this.modelo=modelo;
		this.vin=vin;
		this.numPuertas=numPuertas;
		CantidadVehiculosFuncionando++;
	}
	
	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}
	
	public String getVin() {
		return vin;
	}
	
	public int getnumPuertas() {
		return numPuertas;
	}
	
	public int getCantidadVehiculosFuncionando() {
		
		return CantidadVehiculosFuncionando;
	}

	
	public void setMarca(String marca) {
		this.marca=marca;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public void setVin (String vin) {
		this.vin=vin;
	}
	
	public void setnumPuertas(int numPuertas) {
		this.numPuertas=numPuertas;
	}

	@Override
	public String toString() {
		return "Marca= " + marca + "; Modelo= " + modelo + "; VIN= " + vin + "; NPuertas= " + numPuertas;
	}
	
	
}

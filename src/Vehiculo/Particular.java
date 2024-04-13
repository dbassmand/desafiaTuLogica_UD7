package Vehiculo;

	/*5. Crea correctamente la clase Particular.  
	a. Establece correctamente la herencia entre la clase abstracta padre Turismo y 
	la clase hija Particular.  
	b. Declara y define correctamente los atributos y tipo indicados.  
	c. Implementa correctamente el método abstracto llamado 
	calcularPrecioAlquiler, el tipo que devuelve y el parámetro recibido, así como el 
	código necesario para realizar la función que se pide.  
	i. Recibe un parámetro de tipo entero y devuelve un valor de 
	tipo double. Se aplica el precio por día indicado para 
	Particular. 
	d. Implementa correctamente un método abstracto llamado getMaxVelocidad.  
	i. Devuelve un valor de tipo entero acorde a lo indicado para 
	Vehiculos de tipo Particular. 
	e. Declara e implementa correctamente un constructor de 7 parámetros. Los 
	parámetros son del tipo indicado y se reutiliza el código del constructor de la 
	superclase (se usa super ()).  
	f. Declara e implementa los métodos getter y getter correspondientes a los 
	atributos declarados en la clase y realizan la función deseada.  
	g. Declara e implementa correctamente el método toString y muestra en pantalla 
	todos los datos que se piden. 
	 * 
	 */

public class Particular extends Turismo implements Iniciable{

	private String propietario;
	private Boolean conAireAcondicionado;
	private double kmRecorridos;
	
	public Particular (String marca, String modelo, String vin, int numPuertas, Asientos tipoAsiento, double kmRecorridos ,String propietario,Boolean conAireAcondicionado) {
		super(marca, modelo, vin, numPuertas, tipoAsiento);
		this.propietario=propietario;
		this.conAireAcondicionado=conAireAcondicionado;
		this.kmRecorridos=kmRecorridos;
	}

	public double getKmRecorridos() {
		return kmRecorridos;
	}

	public void setKmRecorridos(double kmRecorridos) {
		this.kmRecorridos = kmRecorridos;
	}

	public String getPropietario() {
		return propietario;
	}

	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}

	public Boolean getConAireAcondicionado() {
		return conAireAcondicionado;
	}

	public void setConAireAcondicionado(Boolean conAireAcondicionado) {
		this.conAireAcondicionado = conAireAcondicionado;
	}
	
	@Override
	public double calcularPrecioAlquiler(int numDias) {
		return numDias*30;
	}
	
	@Override
	public int getMaxVelocidad() {
		return 220;
	}
	@Override
	public void reiniciarContador(double kilometros) {
		System.out.println("\nSe procede a reiniciar el kilometraje del Particular con un total de " + kilometros+" km"
				+ "\n--kilometraje del particular reiniciado....");
		setKmRecorridos(kilometros);
	}
	
	public String toString() {
		return super.toString()+ "; KmRecorridos: "+kmRecorridos
				+"\nPropietario: "+propietario
				+"; Aire acondicionado: "+ conAireAcondicionado;
	} 
}

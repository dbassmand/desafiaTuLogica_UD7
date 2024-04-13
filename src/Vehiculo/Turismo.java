package Vehiculo;

public abstract class Turismo extends Vehiculo{
	
	/*3.-Crea correctamente la clase abstracta Turismo.   
	a. Establece correctamente la herencia entre la clase abstracta padre Vehículo y 
	la clase abstracta hija Turismo.   
	b. Declara y define correctamente el tipo(enumerado) y el atributo indicado  
	c. Declara correctamente un método abstracto llamado calcularPrecioAlquiler.   
	i. Recibe un parámetro de tipo entero y devuelve un valor de 
	tipo double. 
	d. Declara correctamente un método abstracto llamado getMaxVelocidad.  
	i. Devuelve un valor de tipo entero. 
	e. Declara e implementa correctamente un constructor de 5 parámetros. Los 
	parámetros son del tipo indicado y se reutiliza el código del constructor de la 
	superclase (se usa super()).  
	f. Declara e implementa el método getter correspondiente al atributo declarado 
	en la clase y realiza la función deseada. 
	g. Declara e implementa correctamente el método toString y muestra en pantalla 
	todos los datos que se piden.  	  
	 */
	
	protected Asientos tipoAsiento;
	
	public Turismo(String marca, String modelo, String vin, int numPuertas, Asientos tipoAsiento) {
		super(marca, modelo, vin, numPuertas);
		this.tipoAsiento=tipoAsiento; 
	}

	public Asientos getTipoAsiento() {
		return tipoAsiento;
	}

	public void setTipoAsiento(Asientos tipoAsiento) {
		this.tipoAsiento = tipoAsiento;
	}
	
	public String toString() {
		return super.toString()+ "; TipoAsiento: "+getTipoAsiento();
	}
	
	public abstract double calcularPrecioAlquiler(int numDias);
	
	public abstract int getMaxVelocidad();
	
}

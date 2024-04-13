package Vehiculo;
	
	/*4.-Crea correctamente la clase abstracta Taxi.  
	a. Establece correctamente la herencia entre la clase abstracta padre Turismo y 
	la clase abstracta hija Taxi.  
	b. Declara, define e inicializa correctamente al valor indicado el atributo 
	IMPORTE_INICIO y utiliza el modificador de comportamiento adecuado según 
	indicaciones. 
	c. Declara y define correctamente el resto de los atributos indicados. 
		 * d. Implementa correctamente el método abstracto llamado 
	calcularPrecioAlquiler, el tipo que devuelve y el parámetro recibido así como el 
	código necesario para realizar la función que se pide.  
	i. Recibe un parámetro de tipo entero y devuelve un valor de 
	tipo double. Se aplica el precio por día indicado para Taxi. 
	e. Implementa correctamente un método abstracto llamado getMaxVelocidad.  
	i. Devuelve un valor de tipo entero acorde a lo indicado para 
	Vehiculos de tipo Particular. 
	f. Declara e implementa correctamente un constructor de 6 parámetros. Los 
	parámetros son del tipo indicado y se reutiliza el código del constructor de la 
	superclase(se usa super()). 
	g. Declara e implementa los métodos getter correspondientes a los atributos 
	declarados en la clase y  realizan la función deseada.  
	h. Declara e implementa correctamente el método toString y muestra en pantalla 
	todos los datos que se piden.(9 datos) 
	i. Se invoca correctamente al método indicado para que el 
	método toString muestre el coste total.
	 */

public class Taxi extends Turismo implements Calculable,Iniciable {

	public final double IMPORTE_INICIO=2.00;
	private double kmRecorridos;
	private double importeKm;
	
	public Taxi(String marca, String modelo, String vin, int numPuertas, Asientos tipoAsiento, double kmRecorridos, double importeKm) {
		super(marca, modelo, vin, numPuertas, tipoAsiento);
		this.kmRecorridos=kmRecorridos;
		this.importeKm=importeKm;
	}

	public double getKmRecorridos() {
		return kmRecorridos;
	}

	public void setKmRecorridos(double kmRecorridos) {
		this.kmRecorridos = kmRecorridos;
	}

	public double getImporteKm() {
		return importeKm;
	}

	public void setImporteKm(double importeKm) {
		this.importeKm = importeKm;
	}
	
	@Override
	public void reiniciarContador(double kilometros) {
		System.out.println("\n--Se procede a reiniciar el kilometraje del Taxi con un total de " + kilometros+" km"+
				"\n--kilometraje del taxi reiniciado....");
		setKmRecorridos(kilometros);
	}
	
	@Override
    public double calcularCosteTrayecto() {
		return IMPORTE_INICIO + (kmRecorridos * importeKm);
	}
		
	@Override
	public double calcularPrecioAlquiler(int numDias) {
		return numDias*50;
	}
	
	@Override
	public int getMaxVelocidad() {
		return 200;
	}
	
	public String toString() {
		return super.toString()+ "\nImporte inicio: " + IMPORTE_INICIO
				+"; Importe Km: "+ importeKm
				+"; KmRecorridos: " + kmRecorridos
				+"; Coste del trayecto: "+ calcularCosteTrayecto()+"€";
	}
}

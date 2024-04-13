package Vehiculo;

	/*
	 * 2. La clase Autobus representa un subtipo o subclase de Vehículo de quien heredará sus 
			atributos y métodos. También añadirá algunos propios que compartirán todos los 
			autobuses. 
			En concreto, esta clase añade los atributos siguientes:  
			• numero: Será de tipo entero y almacena el número de autobús. 
			• numParadas: Será también de tipo entero y representa el número total de paradas 
			que realiza el bus. 
			Dispondrá de algunos métodos propios de la clase que habrá que declarar e 
			implementar y son los siguientes: 
			Constructor de 6 parámetros. Los parámetros serán la marca, el modelo, el número 
			de bastidor, el número de puertas, número y número de paradas. Se debe reutilizar 
			el código del constructor de la superclase. (usando “super(…)”) 
			➢ Métodos "getter" y “setter” para cada uno de los atributos de la clase.  
			➢ Método toString, que devolverá una cadena de caracteres que mostrará la 
			representación como String de los atributos de un Autobus con el siguiente formato: 
			"Marca: AAA; modelo: BBB; NBastidor: CCC; Npuertas: DDD; Número:EEE; Número de 
			paradas: FFF, donde EEE representa el número de autobús y FFF el número total de 
			paradas que realiza. Para implementarlo debes llamar al método toString de la clase 
			padre y a continuación al método toString de la clase hija.
	 */

public class Autobus extends Vehiculo{
	
	private int numero;
	private int numParadas;
	
	public Autobus(String marca, String modelo, String vin, int numPuertas, int numero, int numParadas) {
		super(marca, modelo, vin, numPuertas);
		this.numero=numero;
		this.numParadas=numParadas;				
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getNumParadas() {
		return numParadas;
	}

	public void setNumParadas(int numParadas) {
		this.numParadas = numParadas;
	}

	@Override
	public String toString() {
		return super.toString()+" \nNúmero de autobús=" + numero + "; numParadas=" + numParadas;
	}
	
	

}

package tareaNoEvaluableUd7;

/*Siguiendo enunciado se crea clase abstracta persona
 * 
 */

public abstract class Persona {

	protected String nombre;
	protected String dni;
	protected int numTlf;
	protected String eMail;
	
	public Persona(String nombre,String dni,int numTlf,String eMail ) {
		
		
		this.nombre=nombre;
		this.dni=dni;
		this.numTlf=numTlf;
		this.eMail=eMail;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getNumTlf() {
		return numTlf;
	}

	public void setNumTlf(int numTlf) {
		this.numTlf = numTlf;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	
	public String toString() {
		
		return "Nombre: "+ getNombre()+", DNI: "+ getDni()+", tlf: "+getNumTlf()+", eMail: "+geteMail();
	}
	
}

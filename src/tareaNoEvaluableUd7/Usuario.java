package tareaNoEvaluableUd7;

import java.util.ArrayList;
import java.util.List;


/*
 * La calse usuario hereda de persona. Siguiendo los requisitos propuestos
 * en la clase usuario se crea lista de libros prestados en esta clase
 */


public class Usuario extends Persona {

	private String tipoUser;
	private List<Libro> librosPrestados;
	
	public Usuario(String nombre,String dni,int numTlf,String eMail, String tipoUser) {
		
		super(nombre, dni, numTlf, eMail);
		
		this.tipoUser=tipoUser;
		 this.librosPrestados = new ArrayList<>();
		
	}

	public String getTipoUser() {
		return tipoUser;
	}

	public void setTipoUser(String tipoUser) {
		this.tipoUser = tipoUser;
	}
	
	public void agregarLibroPrestado(Libro libro) { //metodo para añadir libro a la lista
        librosPrestados.add(libro);
    }

	public List<Libro> getLibrosPrestados() { //metodo que devuelve los libros almacenado en la lista
        return librosPrestados;
    }
	
	
}

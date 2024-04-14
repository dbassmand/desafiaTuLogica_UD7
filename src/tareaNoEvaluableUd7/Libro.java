package tareaNoEvaluableUd7;


public class Libro {
	
	private String titulo;
	private String autor;
	private String categoria;
	private int anhoPublicacion;
	private String estado;
	
	public  Libro(String titulo,String autor, String categoria,int anhoPublicacion, String estado) {
		
		
		this.titulo=titulo;
		this.autor=autor;
		this.categoria=categoria;
		this.anhoPublicacion=anhoPublicacion;
		this.estado=estado;
	}
	
	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public int getAnhoPublicacion() {
		return anhoPublicacion;
	}
	public void setAnhoPublicacion(int anhoPublicacion) {
		this.anhoPublicacion = anhoPublicacion;
	}
				
	public String toString() {
		
		 return "Titulo: "+ getTitulo()+", Autor: " + getAutor()+", Año Publicación: "+ getAnhoPublicacion()+ ", Estado: "+getEstado();
	}

}

package tareaNoEvaluableUd7;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


//La clase biblioteca implementa los métodos de la interfaz Prestable 
public class Biblioteca implements Prestable{
	
	
	Scanner sc = new Scanner(System.in);
	private boolean bandera = true;
	
	//Para almecenar libros y usuarios utilizo mapas que se componen de clave-valor
	//siendo la clave el id y el valor el objeto correspondiente
	
	
	Map<String, Libro> libros = new HashMap<String, Libro>();
	Map<String, Usuario> usuarios = new HashMap<String, Usuario>(); 
	
	
	
	//metodo para comprobar si el idLiibro introducido ya está en uso
		
	public boolean existeIdLibro(String idLibro) {
			
			for(Map.Entry<String, Libro> entrada : libros.entrySet()) {
				
				String clave = entrada.getKey();
		        
		        if (clave.equalsIgnoreCase(idLibro)) {
		            System.out.println("\n***Identificador en uso!***");	            
		            return false;
		        } 	        	        	        	            
		    }
			return true;
	}
		
	
	//Metodo para añadir libro al mapa libros
	public void addLibro() {
		
		boolean bandera1 = true;
		
	    String idLibro="";
	    String titulo;
	    String autor;
	    String categoria;
	    int anhoPublicacion;
	    String estado="disponible";
	    
	    sc.nextLine();
	    System.out.println("Introduce los datos del nuevo libro");
	    
	    //Se comprueba si el idLibro ya está en uso, ya que ese dato debe ser único
	    while(bandera1) {
	    	
	    	System.out.print("Identificador libro: ");
		    idLibro = sc.nextLine();
	    	if(existeIdLibro(idLibro)) {
	    	bandera1= false;
	    	}	
	    }	    	    	   	    
	    System.out.print("Titulo: ");
	    titulo = sc.nextLine();
	    System.out.print("Autor: ");
	    autor = sc.nextLine();
	    System.out.print("Categoria: ");
	    categoria = sc.nextLine();
	    System.out.print("Año publicacion: ");
	    anhoPublicacion = sc.nextInt();
	    // Limpiar el búfer después de nextInt()
	    sc.nextLine();
	    System.out.println("Las entradas nuevas se marcan como: DISPONIBLE ");
	    
	    
	    //Finalmente elimino que el usuario indique el estado del libro ya que se entiende que al ser nuevo en la
	    //biblioteca aun no ha sido prestado a un usuario
	    
	    
	    /*while(bandera) {
	    	System.out.print("Estado del prestamo (Prestado o disponible): ");
		    estado = sc.nextLine();
		    if (!(estado.equalsIgnoreCase("prestado")||estado.equalsIgnoreCase("disponible"))) {
		    	System.out.println("\n***Introduce una opcion valida: prestado o disponible***");
		    } else {
		    	bandera = false;
		    }
	    }
	    */
	    
	    
	    libros.put(idLibro, new Libro(titulo, autor, categoria, anhoPublicacion, estado));
	}

	//metodo para comprobar si el idUsuario introducido ya está en uso
	public boolean existeIdUsuario(String idUsuario) {
	
		for(Map.Entry<String, Usuario> entrada : usuarios.entrySet()) {
			
			String clave = entrada.getKey();
	        
	        if (clave.equalsIgnoreCase(idUsuario)) {
	            System.out.println("Identificador en uso!");	            
	            return false;
	        } 	        	        	        	            
	    }
		return true;
	}
	

	
	//metodo para añadir usuario al mapa usuarios
	public void addUsuario() {

		Boolean bandera1 = true;
		Boolean bandera2 = true;
		Boolean bandera3 = true;

		String idUsuario="";
		String nombre;
		String dni;
		int numTlf=0;
		String eMail;
		String tipoUser="estandar"; //se inicializan todos los usuarios como estandar por defecto

		sc.nextLine();
		System.out.println("Introduce los datos del nuevo usuario");

		//Se comprueba si el idLibro ya está en uso

		while(bandera1) {

			System.out.print("Identificador de usuario: ");
			idUsuario = sc.nextLine();
			if(existeIdUsuario(idUsuario)) {
				bandera1= false;
			}	
		}

		System.out.print("Nombre: ");
		nombre = sc.nextLine();
		System.out.print("D.N.I.: ");
		dni = sc.nextLine();

		//se controla que solo se reciben enteros para la variable telefono, entendemos que no se usarán prefijos internacionales
		while(bandera3) {		    
			System.out.print("Número de teléfono: ");

			if (!sc.hasNextInt()) { // Verifica si la entrada es un entero
				sc.next(); // Limpia la entrada no válida
				System.out.println("***Introduce un tlf válido!***");
			} else {
				numTlf= sc.nextInt();
				bandera3=false;
			}
		}

		// Limpiar el búfer después de nextInt()
		sc.nextLine();
		System.out.print("Correo electrónico: ");
		eMail = sc.nextLine();

		//Se compruba que solo se puedna introducir opciones valida en tipo de usuario

		while(bandera2) {
			System.out.print("Usuario Estandar o Premium: ");
			tipoUser = sc.nextLine();
			if(!(tipoUser.equalsIgnoreCase("estandar")||tipoUser.equalsIgnoreCase("premium"))) {
				System.out.println("Introduce opción correcta: Estandar o premium");
			}else {
				bandera2= false;// Establecer bandera como false para salir del bucle
			}
		}
		//ya tenemos todos los datos necesarios para crea un registro clave-valor en el mapa usuarios
		usuarios.put(idUsuario, new Usuario(nombre, dni, numTlf, eMail, tipoUser));

	}

	
	//Metodo para mostrar todos los libros.
	public void mostrarLibros() {
		
		if(libros.isEmpty()) { //se comprueba si el mapa libros esta vacio
			System.out.println("\n--Biblioteca vacia, no hay libros para mostrar--");
			return;
		}
		
		for(Map.Entry<String, Libro> entrada : libros.entrySet()) { //bucle for - each para recorrer todo el mapa
			
			String clave = entrada.getKey();
			Libro l = entrada.getValue();			
			System.out.println("\n***idLibro= "+clave+" , "+ l);								
		}	
	}
	//Metodo para mostrar todos los usuarios.
	public void mostrarUsuarios() {
		
	    for (Map.Entry<String, Usuario> entrada : usuarios.entrySet()) { //bucle for - each para recorrer todo el mapa
	        String idUsuario = entrada.getKey();
	        Usuario usuario = entrada.getValue();

	        System.out.println("\n*** Usuario: id=" + idUsuario + usuario.toString() + ", tipoUsuario: "+ usuario.getTipoUser());
	        
	        // Verificar si el usuario tiene algún libro prestado
	        if (!usuario.getLibrosPrestados().isEmpty()) { //verifica si la lista de libros prestado está vacía
	            System.out.println("    Libros Prestados: ");
	            for (Libro libro : usuario.getLibrosPrestados()) { //bucle for - each que recorre la lista de libros de usuario
	                System.out.println("    - Título: " + libro.getTitulo() + ", Autor: " + libro.getAutor() + ", Año Publicación: " + libro.getAnhoPublicacion() + ", Estado: " + libro.getEstado());
	            }
	        }
	    }
	}

	//metodo que asigna un libro a un usuario, cambia el estado del libro y añade el libro a la lista del usuario
	public void prestarLibro() {
		
		// Limpiar el búfer después de nextInt(), esto no se por que no lo arreglan.....
	    sc.nextLine();
		
		String idLibro;
		String idUser;
		System.out.println("Introduce el idLibro a prestar: ");
		idLibro = sc.nextLine();
		System.out.println("Introduce el idUsuario que reserva libro: ");
		idUser = sc.nextLine();
		
		
		
		// Verificar si el libro y el usuario existen
	    if (libros.containsKey(idLibro) && usuarios.containsKey(idUser)) { //Se compruba que existan los dos id´s ingresados 
	        // Obtener el libro y el usuario
	        Libro libro = libros.get(idLibro); 
	        Usuario usuario = usuarios.get(idUser);
	        
	        //comprueba si el libro ya esta prestado a otro usuario, entendemos que solo hay un ejemplar de cada libro
	        if(libro.getEstado().equalsIgnoreCase("prestado")) {
	        	System.out.println("Libro ya prestado");
	        	return; //en caso que esté prestado se detiene el metodo
	        }
	        
	     // Agregar el libro a la lista de libros prestados del usuario
	        usuario.agregarLibroPrestado(libro);
	        
	        // Mostrar el mensaje de préstamo
	        System.out.println("El libro " + libro.getTitulo() + " se presta al usuario " + usuario.getNombre());
	        
	        
	        // Se cambia el estado del libro a "Prestado"
	        libro.setEstado("Prestado");
	    } else {
	        System.out.println("El libro o el usuario no existen.");
	    }
	}
	//el metodo cambia el estado del libro a disponible y borra el libro de la lista perteneciente a la clase usuario
	public void devolverLibro() {
		
		// Limpiar el búfer después de nextInt()
	    sc.nextLine();
	    
		String idLibro;
	    String idUsuario;

	    System.out.println("Introduce el idLibro a devolver: ");
	    idLibro = sc.nextLine();

	    System.out.println("Introduce el idUsuario que devuelve el libro: ");
	    idUsuario = sc.nextLine();

	    // Verificar si el libro y el usuario existen
	    if (libros.containsKey(idLibro) && usuarios.containsKey(idUsuario)) {
	        // Obtener el libro y el usuario
	        Libro libro = libros.get(idLibro);
	        Usuario usuario = usuarios.get(idUsuario);

	        // Verificar si el libro está prestado al usuario
	        if (usuario.getLibrosPrestados().contains(libro)) {
	            // Eliminar el libro de la lista de libros prestados del usuario
	            usuario.getLibrosPrestados().remove(libro);
	            
	            // Se Cambia el estado del libro a Disponible
	            libro.setEstado("Disponible");

	            System.out.println("El libro " + libro.getTitulo() + " ha sido devuelto por el usuario " + usuario.getNombre());
	        } else {
	            System.out.println("El libro no está prestado al usuario.");
	        }
	    } else {
	        System.out.println("El libro o el usuario no existen.");
	    }
	}
	
	//Método para mostrar SOLO los libros disponibles
	public void mostrarLibrosDisponible() {
		//Antes de nada se comprueba si el mapa de libros esta vacio
		if(libros.isEmpty()) {
			System.out.println("\n--Biblioteca vacia, no hay libros para mostrar--");
			return;
		}

		for(Map.Entry<String, Libro> entrada : libros.entrySet()) { //bucle for - each 

			//se guarda la clave -valor en variable y objeto respectivamente
			String clave = entrada.getKey(); 
			Libro l = entrada.getValue();

			if(l.getEstado().equalsIgnoreCase("DISPONIBLE")) { //solo en caso que el estado del objeto coincide se imprimirá en consola
				System.out.println("\n***idLibro= "+clave+" , "+ l);
			}
		}	
	}
	
	//Metodo igual que el anterior pero que comprueba el estado prestado
	public void mostrarLibrosPrestado() {

		for(Map.Entry<String, Libro> entrada : libros.entrySet()) {

			String clave = entrada.getKey();
			Libro l = entrada.getValue();

			if(l.getEstado().equalsIgnoreCase("PRESTADO")) {
				System.out.println("\n***idLibro= "+clave+" , "+ l);
			}
		}	
	}
	
	//Método relativamente parecido al anterior, hace uso de una bandera para dar el mensaje correcto 
	//en caso que encuentre la String introducida o no.
	
	public void buscarLibroPorTitulo() {
		// Limpiar el búfer después de nextInt()
	    sc.nextLine();
	    boolean encontrado = false;
	    String tituloBuscado;
	    
	    System.out.println("Introduce titulo a buscar: ");
	    tituloBuscado= sc.nextLine();
	    
	    for (Map.Entry<String, Libro> entrada : libros.entrySet()) {
	        Libro libro = entrada.getValue();
	        
	        if (libro.getTitulo().equalsIgnoreCase(tituloBuscado)) {
	            System.out.println("Libro encontrado:");
	            System.out.println(libro);
	            encontrado = true;
	        }
	    }
	    
	    if (!encontrado) {
	        System.out.println("No se encontraron libros con el título: " + tituloBuscado);
	    }
	}
	
	//Metodo similar al anterior
	public void buscarLibroPorAutor() {
		// Limpiar el búfer después de nextInt()
	    sc.nextLine();
	    boolean encontrado = false;
	    String autorBuscado;
	    
	    System.out.print("Introduce autor a buscar: ");
	    autorBuscado= sc.nextLine();
	    
	    for (Map.Entry<String, Libro> entrada : libros.entrySet()) {
	        Libro libro = entrada.getValue();
	        
	        if (libro.getAutor().equalsIgnoreCase(autorBuscado)) {
	            System.out.println("Libro encontrado:");
	            System.out.println(libro);
	            encontrado = true;
	        }
	    }
	    
	    if (!encontrado) {
	        System.out.println("No se encontraron libros con el autor: " + autorBuscado);
	    }
	}
	
	//Metodo similar al anterior
	public void buscarLibroPorCategoria() {
		// Limpiar el búfer después de nextInt()
	    sc.nextLine();
	    boolean encontrado = false;
	    String categoriaBuscado;
	    
	    System.out.print("Introduce categoria a buscar: ");
	    categoriaBuscado= sc.nextLine();
	    
	    for (Map.Entry<String, Libro> entrada : libros.entrySet()) {
	        Libro libro = entrada.getValue();
	        
	        if (libro.getCategoria().equalsIgnoreCase(categoriaBuscado)) {
	            System.out.println("Libro encontrado:");
	            System.out.println(libro);
	            encontrado = true;
	        }
	    }	    
	    if (!encontrado) {
	        System.out.println("No se encontraron libros con la categoria: " + categoriaBuscado);
	    }
	}
	
	//Menu principal para seleccionar la opciones posibles
	public void menu() {
		
		while (bandera) { //me gusta más esta opcion que el do - while, la bandera cabia a false con la opción de salir
			
			int respuesta=0; //se inicializa con un valor
			
			System.out.println("\n***Bienvenido a la Bibliteca de CESUR***"+	
								"\n Menu de opciones:");	
			System.out.println("\n1.-Registrar nuevo libro");
			System.out.println("2.-Registrar nuevo usuario");
			System.out.println("3.-Presta libro a usuario");
			System.out.println("4.-Devolver libro prestado");
			System.out.println("5.-Mostrar todos los libros");
			System.out.println("6.-Mostrar libros disponibles");
			System.out.println("7.-Mostrar usuarios y libros prestados");
			System.out.println("8.-Buscar libro por título");
			System.out.println("9.-Buscar libro por autor");
			System.out.println("10.-Buscar libro por categoria");
			System.out.println("11.-Salir");
			System.out.print("\nSelecciona una opción: ");
			
			
			if (!sc.hasNextInt()) { // Verifica si la entrada es un entero
			    sc.next(); // Limpia la entrada no válida, muy cansino esto.....
			    respuesta = 12; // Asigna un valor predeterminado fuera de rango para que sea controlado por el default
			} else {
			    respuesta = sc.nextInt(); // Lee el entero
			}
			
			switch(respuesta) {
			//cada opción ejecuta un metodo
			case 1: addLibro();
			break;
			case 2: addUsuario();
			break;
			case 3: prestarLibro();
			break;
			case 4: devolverLibro();
			break;
			case 5: mostrarLibros();
			break;
			case 6: mostrarLibrosDisponible();
			break;
			case 7: mostrarUsuarios();
			break;
			case 8: buscarLibroPorTitulo();
			break;
			case 9: buscarLibroPorAutor();
			break;
			case 10: buscarLibroPorCategoria();
			break;
			case 11: //esta es la unica opción que provocará la salida del bucle while
			bandera = false;
	        System.out.println("Saliendo del programa... vuelve pronto!!");
	        break;
			default:
	        System.out.println("Opción no válida. Por favor, ingresa un número válido.");
			}
		}
	}
}

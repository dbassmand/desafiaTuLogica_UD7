package Vehiculo;

	/*8. Crea una clase main y dentro se crean los objetos y se invocan a los métodos indicados 
		correctamente.  
		a. Crea dos objetos de tipo Taxi usando el constructor de 6 parámetros creado 
		anteriormente. Los valores de estos parámetros serán a tu elección.  
		b. Crea dos objetos de tipo Particular usando el constructor de 7 parámetros 
		creado anteriormente. Los valores de estos parámetros serán a tu elección. 
		c. Crea un objeto de tipo Autobus. 
		d. Llama al método toString de los objetos de tipo Taxi, de los objetos de tipo 
		Particular y del objeto de tipo Autobus.  
		e. Ahora reinicia el cuentakilómetros del 1º objeto tipo Taxi a 25.000 Km.  
		f. Calcula el coste de trayecto de este 1º objeto tipo Taxi.  
		g. Muestra su información con el método toString y comprueba sus nuevos 
		valores.  
		h. Reinicia el cuentakilómetros de 1º objeto tipo Particular a 10.000 Kilómetros.  
		i. Cambia el nombre del propietario con el setter correspondiente del 2º 
		particular y muestra su información con el método toString para comprobar 
		nuevos valores. 	  
	 */

public class Main {

	public static void main(String[] args) {
		
		Taxi taxi1 = new Taxi("Tesla", "Model3", "5YJVVKT4R29007373", 4, Asientos.CUERO, 28.00, 1.25);
		Taxi taxi2 =new Taxi("Ford", "Mondeo", "WF0AXXWP4T028712", 5, Asientos.CALEFACCION, 32.0, 1.15);
		
		Particular part1 =new Particular("Audi", "A3", "WAUZZZ8BZ71R7835", 3, Asientos.RECLINABLES, 138, "Juan Lopez", true);
		Particular part2=new Particular("Seat", "Ateca", "VSSZZZ5KZ9R032776", 5, Asientos.RECLINABLES, 42.0, "Ana Ocaña", true);
		
		Autobus auto1=new Autobus("VOLVO", "Sunsundegi", "YV2A4B2A3VA260362", 2, 15, 18);

		System.out.println("***Primer Taxi***\n");
        System.out.println(taxi1.toString()); 
        System.out.println("\n***Segundo Taxi***\n");
        System.out.println(taxi2.toString());
        System.out.println("\n***Primer Particular***\n");
        System.out.println(part1.toString());
        System.out.println("\n***Segundo Particular***\n");
        System.out.println(part2.toString());
        System.out.println("\n***Primer Autobus***\n");
        System.out.println(auto1.toString());
        System.out.println("\nTotal de vehículo alquilados o funcionando: "+ Vehiculo.CantidadVehiculosFuncionando+" vehículos");
        taxi1.reiniciarContador(25000.00);
        System.out.println("\n--El coste del trayecto para el taxi1 es "+taxi1.calcularCosteTrayecto());
        System.out.println("\n***Información actualizada para el primer taxi***\n");
        System.out.println(taxi1.toString()); 
        part1.reiniciarContador(10000.00);
        System.out.println("\n***Información actualizada para el segundo particular***\n");
        part2.setPropietario("Sara Romero");
        System.out.println(part2.toString());
        
	}
	
	

}

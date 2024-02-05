import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Principal {
	public static void main(String[] args){

		System.out.println("Hola mundo");


		mostrarFechaHoraActual();

		Usuario[] array = pedirUsuarios(cantidad);

		System.out.println("\n");

		mostrarUsuario(array);


	}

	public static Usuario[] pedirUsuarios(int cantidadUsuarios) {
		Usuario[] arraySinOrdenar = new Usuario[cantidadUsuarios];
		
		for (int i = 0; i < cantidadUsuarios; i++) {
				
			System.out.println((i+1) + "º Usuario\n------------------");
			System.out.print("Introduce el nombre: ");
			String nombre = kb.nextLine();
			
			System.out.print("Introduce los apellidos: ");
			String apellidos = kb.nextLine();
			
			System.out.print("Introduce el email: ");
			String email = kb.nextLine();
			arraySinOrdenar[i] = new Usuario(nombre, apellidos, email);
			
			System.out.println();		
			
		}
		Usuario[] arrayOrdenado = ordenarUsuarios(arraySinOrdenar);
		
		return arrayOrdenado;
	}
	public static Usuario[] ordenarUsuarios(Usuario[] array) {
	for (int i = 1; i < array.length - 1; i++) {
		for (int j = i-1; j < array.length - 1; j++) {
			if (array[j].getApellidos().charAt(0) < array[j+1].getApellidos().charAt(0)) {
				Usuario aux = array[j];
				array[j] = array[j+1];
				array[j+1] = aux;
			}
			
		}
	}
	
	
	
	
	return array;
	}
	
	
	public static void mostrarUsuario(Usuario[] array) {
		
		System.out.println("Selecciona un usuario\n------------------------------------");
		for(int i = 0; i < cantidad; i++) {
			
			System.out.println((i+1) + " - " + array[i].getApellidos()+ ", " + array[i].getNombre());
			
			
		}
		int opcion = pedirInt("Escoge una opcion: ");
		System.out.println();
		
		System.out.println("USUARIO\n--------");
		System.out.println("Nombre: " + array[opcion-1].getNombre());
		System.out.println("Apellidos: " + array[opcion-1].getApellidos());
		System.out.println("Mail: " + array[opcion-1].getEmail());
	
	
	}
	public static int pedirInt(String enunciado) {
		int num = 0;
		boolean  condicion = false;
		while (!condicion) {
			try {
				System.out.print(enunciado);
				num = Integer.parseInt( kb.nextLine().trim() );
				condicion = true;
			} catch (Exception e) {
				System.out.println("No has introducido un int");
			}
		}
		
		
		return num;
	}














	 public static void mostrarFechaHoraActual() {
 
        LocalDateTime fechaHoraActual = LocalDateTime.now();

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        String fechaHoraFormateada = fechaHoraActual.format(formato);

        System.out.println("Fecha y Hora Actual: " + fechaHoraFormateada);
    }

}


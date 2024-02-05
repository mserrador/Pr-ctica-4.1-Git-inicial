public class Usuario {

	private String nombre = "";
	private String apellidos = "";
	private String email = "";

	public Usuario(String nombre, String apellidos, String email){
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nuevoNombre) {
		if (nuevoNombre.length() > 4) {
			this.nombre = nuevoNombre;
		}
	}
	public String getApellidos() {
		return this.apellidos;
	}

	public void setApellidos(String nuevosApellidos) {
		if (nuevosApellidos.length() > 4) {
			this.apellidos = nuevosApellidos;
		}
	}
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String nuevoEmail) {
		if (nuevoEmail.length() > 6) {
			this.email = nuevoEmail;
		}
	}
}

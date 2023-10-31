
public class usuario {
	 private String nombre;
	    private String contraseña;
	    private String tipo;

	    public Usuario(String nombre, String contraseña, String tipo) {
	        this.nombre = nombre;
	        this.contraseña = contraseña;
	        this.tipo = tipo;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    
	   
	public String getContraseña() {
	        return contraseña;
	    }

	    public String getTipo() {
	        return tipo;
	    }
	}

}

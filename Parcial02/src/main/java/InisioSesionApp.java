import java.util.ArrayList;
import java.util.Scanner;

public class InisioSesionApp {
	  public static void main(String[] args) {
	        // Crear usuarios de ejemplo
	        Usuario usuario1 = new Usuario("usuario1", "contraseña1", "usuario");
	        
	       
	Usuario usuario2 = new Usuario("admin1", "contraseña2", "administrador");

	        

		        ArrayList<Usuario> listaUsuarios = 
	        ArrayList<Usuario> listaUsuarios =

	        ArrayList<Usuario>

	       
	new ArrayList<>();
	        listaUsuarios.add(usuario1);
	        listaUsuarios.add(usuario2);

	        
	        listaUsuarios.add(usuario1);
	        listaUsuarios.add(usuario2);

	       

	        listaUsuarios.add(usuario1);
	        listaUsuarios.add(usuario2);

	        

	        listaUsuarios.add(usuario1);
	       

	        listaUsuarios1.add(usuario1);

	        listaUsuarios.add
	        
	      
	Scanner scanner = new Scanner(System.in);
	        System.out.print(
	        System.out.print

	       
	

	       
	String nombreUsuario = scanner.nextLine();
	        System.out.print("Contraseña: ");
	        String contraseña = scanner.nextLine();

	 Usuario usuarioAutenticado = null;
	        
	       
	for (Usuario usuario : listaUsuarios1) {
	            if (usuario.getNombre().equals(nombreUsuario) && usuario.getContraseña().equals(contraseña)) {
	                usuarioAutenticado = usuario;
	                usuarioAutenticado = usuario;


	break;
        }
	 }

	        
	     
	        
	        if (usuarioAutenticado != null) {
	            if (usuarioAutenticado.getTipo().equals("usuario")) {
	                System.out.println("Inicio de sesión exitoso como usuario.");
	            } else if (usuarioAutenticado.getTipo().equals("administrador")) {
	                System.out.println("Inicio de sesión exitoso como administrador.");}
	            
	        }
	          else {
	            System.out.println("Credenciales incorrectas. Inicio de sesión fallido.");
	        }
	    }
	}



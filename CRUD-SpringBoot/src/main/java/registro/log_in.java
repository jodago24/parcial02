package registro;

import com.app.web.entidad.Estudiante;

public class InicioSesionApp {

	    public static void main(String[] args) {
	        // Crear estudiantes de ejemplo
	        Estudiante estudiante1 = new Estudiante("Estudiante1");
	        Estudiante estudiante2 = new Estudiante("Estudiante2");

	        // Crear lista de estudiantes
	        ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
	        listaEstudiantes.add(estudiante1);
	        listaEstudiantes.add(estudiante2);

	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Nombre de Estudiante: ");
	        String nombreEstudiante = scanner.nextLine();
	        System.out.print("Contraseña: ");
	        String contraseña = scanner.nextLine();

	        Estudiante estudianteAutenticado = null;

	        // Autenticar estudiante
	        for (Estudiante estudiante : listaEstudiantes) {
	            if (estudiante.getNombre().equals(nombreEstudiante) && estudiante.getDescripcion().equals(contraseña)) {
	                estudianteAutenticado = estudiante;
	                break;
	            }
	        }

	        // Mostrar resultado de la autenticación
	        if (estudianteAutenticado != null) {
	            System.out.println("Inicio de sesión exitoso como estudiante.");
	            System.out.println("Detalles del estudiante: " + estudianteAutenticado.toString());
	        } else {
	            System.out.println("Estudiante no encontrado o contraseña incorrecta. Inicio de sesión fallido.");
	        }

	        scanner.close();
	    }
	}



package vista;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Login {

    private static Map<String, String> usuarios = new HashMap<>();

    /**
     *
     * @param args
     */
 
    public static void main(String[] args) {
        // Agregar usuarios a la base de datos
        usuarios.put("usuario1", "password1");
        usuarios.put("usuario2", "password2");
        usuarios.put("admin", "admin123");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido a la Bodeguita Allis");
        System.out.println("Por favor, ingrese su nombre de usuario y contraseña.");
        System.out.print("Usuario: ");
        String usuario = scanner.nextLine();
        System.out.print("Contraseña: ");
        String contraseña = scanner.nextLine();
        if (iniciarSesion(usuario, contraseña)) {
            System.out.println("Inicio de sesión exitoso. Bienvenido a la Bodeguita Allis");
 // Lógica de redirección según el tipo de usuario
 if (usuario.equals("admin")) {
                System.out.println("Accediendo como administrador...");
                // Lógica para administrador
            } else {
                System.out.println("Accediendo como usuario normal...");
                // Lógica para usuarios normales
            }
        } else {
            System.out.println("Usuario o contraseña incorrectos. Inténtalo de nuevo");
        }
        scanner.close();
    }

    private static boolean iniciarSesion(String usuario, String contraseña) {
        // Verificar si el usuario existe en la base de datos y la contraseña coincide
        return usuarios.containsKey(usuario)
                && usuarios.get(usuario).equals(contraseña);
    }
}

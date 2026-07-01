import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SistemaAcceso sistema = new SistemaAcceso(sc);

        try {
            boolean registrado = sistema.registrarCliente();

            if (!registrado) {
                System.out.println("\nNo se ha podido registrar el cliente.");
                return;
            }

            System.out.println("\nCliente registrado correctamente.");
            sistema.listarClientes();

            boolean accesoCorrecto = sistema.login();

            if (accesoCorrecto) {
                System.out.println("\nAcceso correcto.");
            } else {
                System.out.print("\nAcceso denegado. ¿Quiere recuperar su contraseña? (S/N): ");
                String resp = sc.nextLine().trim();

                if (resp.equalsIgnoreCase("S")) {
                    String password = sistema.recuperarPassword();

                    if (password != null) {
                        System.out.println("\nSu password es: " + password);
                    } else {
                        System.out.println("\nNo se ha podido recuperar la contraseña.");
                    }
                } else {
                    System.out.println("\nTenga un buen día.");
                }
            }
        } catch (Exception exception) {
            System.out.println("\nError inesperado: " + exception.getMessage());
        }
    }
}

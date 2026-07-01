import java.util.ArrayList;
import java.util.Scanner;

public class SistemaAcceso {
    private ArrayList<Clientes> lista;
    private Scanner sc;

    public SistemaAcceso(Scanner sc) {
        this.lista = new ArrayList<>();
        this.sc = sc;
    }

    public boolean registrarCliente() {
        try {
            System.out.println("*** NUEVO CLIENTE ***");

            System.out.print("\nLogin: ");
            String login = sc.nextLine().trim();

            if (login.isEmpty()) {
                System.out.println("El login no puede estar vacío.");
                return false;
            }

            if (existeLogin(login)) {
                System.out.println("Ya existe un usuario con ese login.");
                return false;
            }

            System.out.print("\nPassword: ");
            String password = sc.nextLine().trim();

            System.out.println("\nPreguntas de recuperación:");
            Clientes.mostrarPreguntas();

            System.out.print("\nSelecciona una pregunta: ");
            int nPregunta = Integer.parseInt(sc.nextLine()) - 1;

            System.out.print("Respuesta: ");
            String respuesta = sc.nextLine().trim();

            System.out.print("\nTipo de cliente: Particular(1) / Empresa(2): ");
            int opcion = Integer.parseInt(sc.nextLine());

            Clientes cliente;

            if (opcion == 1) {
                System.out.print("\nIntroduzca su DNI: ");
                String dni = sc.nextLine().trim();
                cliente = new ClienteParticular(login, password, nPregunta, respuesta, dni);
            } else if (opcion == 2) {
                System.out.print("\nIntroduzca su CIF: ");
                String cif = sc.nextLine().trim();
                cliente = new ClienteEmpresa(login, password, nPregunta, respuesta, cif);
            } else {
                System.out.println("Tipo de cliente no válido.");
                return false;
            }

            lista.add(cliente);
            return true;

        } catch (NumberFormatException exception) {
            System.out.println("Debe introducir un número válido.");
        } catch (IncorrectPasswordException | IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }

        return false;
    }

    public void listarClientes() {
        if (lista.isEmpty()) {
            System.out.println("\nAún no existen clientes registrados.");
            return;
        }

        System.out.println("\n************ CLIENTES REGISTRADOS *************");
        System.out.printf("%-15s %-12s %-3s %-20s%n", "LOGIN", "PASSWORD", "N", "RECUPERACIÓN");
        System.out.println("------------------------------------------------");

        for (Clientes cliente : lista) {
            System.out.println(cliente);
        }
    }

    public boolean login() {
        System.out.println("\n'''''''' ACCESO AL SISTEMA ''''''''");

        System.out.print("Login: ");
        String login = sc.nextLine().trim();

        System.out.print("Password: ");
        String password = sc.nextLine().trim();

        for (Clientes cliente : lista) {
            if (cliente.getLogin().equals(login) && cliente.getPassw().equals(password)) {
                return true;
            }
        }

        return false;
    }

    public String recuperarPassword() {
        System.out.println("\n'''''''' RECUPERAR PASSWORD ''''''''");

        System.out.print("¿Cuál es tu login?: ");
        String login = sc.nextLine().trim();

        Clientes cliente = buscarClientePorLogin(login);

        if (cliente == null) {
            System.out.println("No existe ningún cliente con ese login.");
            return null;
        }

        System.out.println(cliente.getPreguntaElegida());
        String respuesta = sc.nextLine().trim();

        if (cliente.getRespPreg().equalsIgnoreCase(respuesta)) {
            return cliente.getPassw();
        }

        return null;
    }

    private boolean existeLogin(String login) {
        return buscarClientePorLogin(login) != null;
    }

    private Clientes buscarClientePorLogin(String login) {
        for (Clientes cliente : lista) {
            if (cliente.getLogin().equals(login)) {
                return cliente;
            }
        }
        return null;
    }
}

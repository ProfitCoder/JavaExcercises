import java.util.Scanner;

public class ProgramaPrincipal {
    private static final Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {
        LayoutWeb layout = new LayoutWeb();
        cargarDatosIniciales(layout);

        int opcion;
        do {
            mostrarMenu();
            opcion = leerEntero("Elige una opcion: ");

            switch (opcion) {
                case 1:
                    altaComponente(layout);
                    break;
                case 2:
                    System.out.println("*** LIMPIANDO INVISIBLES ***");
                    layout.limpiarInvisibles();
                    layout.listarMaquetacion();
                    break;
                case 3:
                    actualizarDimensiones(layout);
                    break;
                case 4:
                    System.out.println("El programa ha terminado.");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 4);
    }

    private static void cargarDatosIniciales(LayoutWeb layout) {
        try {
            layout.anadirComponente(new ComponenteMultimedia("Banner Principal", "#id-001", 1200.0, 400.0, "http://images.com/banner.png"));
            layout.anadirComponente(new ComponenteTexto("Caja de Comentarios", "#nav-002", 450.0, 0.0, "Escribe aqui..."));
            layout.listarMaquetacion();
        } catch (IllegalArgumentException e) {
            System.out.println("Error cargando datos iniciales: " + e.getMessage());
        }
    }

    private static void mostrarMenu() {
        System.out.println();
        System.out.println("1. Alta de componente");
        System.out.println("2. Limpiar invisibles");
        System.out.println("3. Actualizar dimensiones");
        System.out.println("4. Salir");
    }

    private static void altaComponente(LayoutWeb layout) {
        try {
            System.out.println();
            String nombre = leerTexto("Nombre: ");
            String idCSS = leerTexto("IdCSS. Ejemplo valido: #id-001 o #NAV-002: ");
            double ancho = leerDouble("Ancho en pixeles: ");
            double alto = leerDouble("Alto en pixeles: ");

            System.out.println("1. Componente multimedia");
            System.out.println("2. Componente texto");
            int tipo = leerEntero("Tipo de componente: ");

            Componentes nuevoComponente;
            if (tipo == 1) {
                String url = leerTexto("URL de origen: ");
                nuevoComponente = new ComponenteMultimedia(nombre, idCSS, ancho, alto, url);
            } else if (tipo == 2) {
                String texto = leerTexto("Texto: ");
                nuevoComponente = new ComponenteTexto(nombre, idCSS, ancho, alto, texto);
            } else {
                System.out.println("Tipo de componente no valido.");
                return;
            }

            layout.anadirComponente(nuevoComponente);
            layout.listarMaquetacion();
        } catch (IllegalArgumentException e) {
            System.out.println("No se ha podido crear el componente: " + e.getMessage());
        }
    }

    private static void actualizarDimensiones(LayoutWeb layout) {
        try {
            String idBuscar = leerTexto("Introduce el idCSS del componente a modificar: ");
            double nuevoAncho = leerDouble("Nuevo ancho: ");
            double nuevoAlto = leerDouble("Nuevo alto: ");

            if (layout.actualizarDimensiones(idBuscar, nuevoAncho, nuevoAlto)) {
                System.out.println("Dimensiones actualizadas correctamente.");
            } else {
                System.out.println("No existe ningun componente con ese idCSS.");
            }

            layout.listarMaquetacion();
        } catch (IllegalArgumentException e) {
            System.out.println("No se han podido actualizar las dimensiones: " + e.getMessage());
        }
    }

    private static String leerTexto(String mensaje) {
        String texto;
        do {
            System.out.print(mensaje);
            texto = SC.nextLine().trim();
            if (texto.isEmpty()) {
                System.out.println("El campo no puede estar vacio.");
            }
        } while (texto.isEmpty());
        return texto;
    }

    private static int leerEntero(String mensaje) {
        while (true) {
            try {
                System.out.print(mensaje);
                return Integer.parseInt(SC.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Debes introducir un numero entero.");
            }
        }
    }

    private static double leerDouble(String mensaje) {
        while (true) {
            try {
                System.out.print(mensaje);
                return Double.parseDouble(SC.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Debes introducir un numero decimal valido.");
            }
        }
    }
}

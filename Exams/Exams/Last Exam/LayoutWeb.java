import java.util.ArrayList;
import java.util.Iterator;

public class LayoutWeb {
    private ArrayList<Componentes> lista;

    public LayoutWeb() {
        lista = new ArrayList<>();
    }

    public boolean anadirComponente(Componentes comp) {
        if (comp == null) {
            throw new IllegalArgumentException("El componente no puede ser null.");
        }

        if (buscarPorId(comp.getIdCss()) != null) {
            System.out.println("Ya existe un componente con ese idCSS: " + comp.getIdCss());
            return false;
        }

        lista.add(comp);
        System.out.println("Nuevo componente guardado: " + comp.getIdCss());
        return true;
    }

    public Componentes buscarPorId(String idCSS) {
        for (Componentes componente : lista) {
            if (componente.getIdCss().equalsIgnoreCase(idCSS)) {
                return componente;
            }
        }
        return null;
    }

    public boolean actualizarDimensiones(String idCSS, double nuevoAncho, double nuevoAlto) {
        Componentes componente = buscarPorId(idCSS);

        if (componente == null) {
            return false;
        }

        componente.setAncho(nuevoAncho);
        componente.setAlto(nuevoAlto);
        return true;
    }

    public void listarMaquetacion() {
        System.out.println();

        if (lista.isEmpty()) {
            System.out.println("No hay componentes registrados.");
            return;
        }

        System.out.println("| NOMBRE               | IDCSS    |      ANCHO |       ALTO | URL/TEXTO                       |");
        System.out.println("----------------------------------------------------------------------------------------------");
        for (Componentes componente : lista) {
            System.out.println(componente);
        }
        System.out.println("----------------------------------------------------------------------------------------------");
    }

    public int limpiarInvisibles() {
        int borrados = 0;
        Iterator<Componentes> iterador = lista.iterator();

        while (iterador.hasNext()) {
            Componentes componente = iterador.next();
            if (componente.esInvisible()) {
                iterador.remove();
                borrados++;
                System.out.println("Elemento borrado: " + componente.getIdCss());
            }
        }

        if (borrados == 0) {
            System.out.println("Ningun elemento ha sido borrado.");
        }

        return borrados;
    }
}

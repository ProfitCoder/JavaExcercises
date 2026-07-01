public class ComponenteTexto extends Componentes {
    private String contenidoTexto;

    public ComponenteTexto(String nombre, String idCSS, double anchoPixeles, double altoPixeles, String contenidoTexto) {
        super(nombre, idCSS, anchoPixeles, altoPixeles);
        validarTexto(contenidoTexto, "El texto no puede estar vacio.");
        this.contenidoTexto = contenidoTexto;
    }

    public String getContenidoTexto() {
        return contenidoTexto;
    }

    public void setContenidoTexto(String contenidoTexto) {
        validarTexto(contenidoTexto, "El texto no puede estar vacio.");
        this.contenidoTexto = contenidoTexto;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" %-30s |", contenidoTexto);
    }
}

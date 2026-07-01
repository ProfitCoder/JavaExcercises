public class ComponenteMultimedia extends Componentes {
    private String urlOrigen;

    public ComponenteMultimedia(String nombre, String idCSS, double anchoPixeles, double altoPixeles, String urlOrigen) {
        super(nombre, idCSS, anchoPixeles, altoPixeles);
        validarTexto(urlOrigen, "La URL no puede estar vacia.");
        this.urlOrigen = urlOrigen;
    }

    public String getUrl() {
        return urlOrigen;
    }

    public void setUrl(String urlOrigen) {
        validarTexto(urlOrigen, "La URL no puede estar vacia.");
        this.urlOrigen = urlOrigen;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" %-30s |", urlOrigen);
    }
}

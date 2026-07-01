import java.util.regex.Pattern;

public abstract class Componentes {
    private static final Pattern PATRON_ID_CSS = Pattern.compile("^#[A-Za-z]{2,3}-\\d{3}$");

    protected String nombre;
    protected String idCSS;
    protected double anchoPixeles;
    protected double altoPixeles;

    public Componentes(String nombre, String idCSS, double anchoPixeles, double altoPixeles) {
        validarTexto(nombre, "El nombre no puede estar vacio.");
        validarIdCss(idCSS);
        validarDimension(anchoPixeles, "El ancho no puede ser negativo.");
        validarDimension(altoPixeles, "El alto no puede ser negativo.");

        this.nombre = nombre;
        this.idCSS = idCSS;
        this.anchoPixeles = anchoPixeles;
        this.altoPixeles = altoPixeles;
    }

    private void validarIdCss(String idCSS) {
        validarTexto(idCSS, "El idCSS no puede estar vacio.");
        if (!PATRON_ID_CSS.matcher(idCSS).matches()) {
            throw new IllegalArgumentException("Formato de idCSS incorrecto. Ejemplo valido: #id-001 o #NAV-002");
        }
    }

    protected void validarTexto(String texto, String mensajeError) {
        if (texto == null || texto.trim().isEmpty()) {
            throw new IllegalArgumentException(mensajeError);
        }
    }

    protected void validarDimension(double valor, String mensajeError) {
        if (valor < 0) {
            throw new IllegalArgumentException(mensajeError);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getIdCss() {
        return idCSS;
    }

    public double getAnchoPixeles() {
        return anchoPixeles;
    }

    public double getAltoPixeles() {
        return altoPixeles;
    }

    public void setAncho(double anchoPixeles) {
        validarDimension(anchoPixeles, "El ancho no puede ser negativo.");
        this.anchoPixeles = anchoPixeles;
    }

    public void setAlto(double altoPixeles) {
        validarDimension(altoPixeles, "El alto no puede ser negativo.");
        this.altoPixeles = altoPixeles;
    }

    public boolean esInvisible() {
        return anchoPixeles == 0 || altoPixeles == 0;
    }

    @Override
    public String toString() {
        return String.format("| %-20s | %-8s | %10.2f | %10.2f |", nombre, idCSS, anchoPixeles, altoPixeles);
    }
}

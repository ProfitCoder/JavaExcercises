public class Clientes {
    private static final String[] PREGUNTAS = {
        "¿Cuál es el nombre de tu mascota?",
        "¿Cómo se llamaba tu primer maestro?",
        "¿Cuántos años tiene tu hijo?"
    };

    protected String login;
    protected String password;
    protected int nPregunta;
    protected String palRecuperacion;

    public Clientes(String login, String password, int nPregunta, String palRecuperacion)
            throws IncorrectPasswordException {

        if (!passwordValida(password)) {
            throw new IncorrectPasswordException();
        }

        if (nPregunta < 0 || nPregunta >= PREGUNTAS.length) {
            throw new IllegalArgumentException("La pregunta seleccionada no existe.");
        }

        this.login = login;
        this.password = password;
        this.nPregunta = nPregunta;
        this.palRecuperacion = palRecuperacion;
    }

    public Clientes() {
    }

    public static boolean passwordValida(String password) {
        return password != null && password.matches("^(?=.*[A-Z])(?=.*\\d)[A-Za-z\\d]{8,}$");
    }

    public static void mostrarPreguntas() {
        for (int i = 0; i < PREGUNTAS.length; i++) {
            System.out.println((i + 1) + ". " + PREGUNTAS[i]);
        }
    }

    public String getLogin() {
        return login;
    }

    public String getPassw() {
        return password;
    }

    public int getNPreg() {
        return nPregunta;
    }

    public String getRespPreg() {
        return palRecuperacion;
    }

    public String getPreguntaElegida() {
        return PREGUNTAS[nPregunta];
    }

    @Override
    public String toString() {
        return String.format("%-15s %-12s %-3d %-20s",
                login, "********", nPregunta + 1, palRecuperacion);
    }
}

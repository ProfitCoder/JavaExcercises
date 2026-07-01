public class ClienteParticular extends Clientes {
    private String dni;

    public ClienteParticular(String login, String password, int nPregunta, String palRecuperacion, String dni)
            throws IncorrectPasswordException {
        super(login, password, nPregunta, palRecuperacion);
        this.dni = dni;
    }

    public String getDni() {
        return dni;
    }
}

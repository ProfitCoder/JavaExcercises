public class ClienteEmpresa extends Clientes {
    private String cif;

    public ClienteEmpresa(String login, String password, int nPregunta, String palRecuperacion, String cif)
            throws IncorrectPasswordException {
        super(login, password, nPregunta, palRecuperacion);
        this.cif = cif;
    }

    public String getCif() {
        return cif;
    }
}

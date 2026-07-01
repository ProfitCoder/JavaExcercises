public class IncorrectPasswordException extends Exception {
    public IncorrectPasswordException() {
        super("El password debe tener mínimo 8 caracteres, una mayúscula y un número.");
    }
}

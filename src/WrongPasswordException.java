public class WrongPasswordException extends RuntimeException {
    public WrongPasswordException() {
        super("Пароли не равны! Ошибка!");
    }

    public WrongPasswordException(String message) {
        super(message);
    }
}

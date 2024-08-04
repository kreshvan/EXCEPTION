public class WrongLoginException extends RuntimeException {


    public WrongLoginException() {
        super("Не корректный логин!");
    }

    public WrongLoginException(String message) {
        super(message);
    }

}

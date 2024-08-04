public class ValidationService {
    private static final String VALID_SYMBOLS = "1234567890QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm_";

    public static void validation(String login, String password, String confirmPassword) {
        validationLogin(login);
        validationPassword(password, confirmPassword);
    }

    public static void validationLogin(String login) {
        if (login.length() > 20) {
            throw new WrongLoginException("Логин более 20 символов!");
        }
        for (int i = 0; i < login.length(); i++) {
            if (!VALID_SYMBOLS.contains(String.valueOf(login.charAt(i)))) {
                throw new WrongLoginException("Присутствует недопустимый символ");
            }

        }
    }

    public static void validationPassword(String password, String confirmPassword) {
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException();

        }
        if (password.length() > 20) {
            throw new WrongPasswordException("Пароль длиннее 20 символов");
        }
        for (int i = 0; i < password.length(); i++) {
            if (!VALID_SYMBOLS.contains(String.valueOf(password.charAt(i)))) {
                throw new WrongPasswordException("Пароль имеет недопустимые символы");
            }
        }

    }
}









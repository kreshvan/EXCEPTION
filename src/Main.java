public class Main {
    public static void main(String[] args) {


        try {
            ValidationService.validation("11rr", "11уr", "11rr");
            System.out.println("Добро пожаловать!");


        } catch (WrongLoginException a) {
            System.out.println("Неверный логин! Попробуй снова!");

        } catch (WrongPasswordException e) {
            System.out.println("Неверный пароль! Попробуй снова!");

        }


    }
}
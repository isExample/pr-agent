public class Main {
    public static void main(String[] args) {
        Logger logger = new Logger();
        UserService userService = new UserService(logger);
        UserController controller = new UserController(userService);

        User user = new User("u123", "Alice");
        controller.updateUser(user);

        // 비동기 처리를 기다리기 위한 잠깐의 대기 (테스트용)
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
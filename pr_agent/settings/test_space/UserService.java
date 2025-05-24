import java.util.concurrent.CompletableFuture;

public class UserService {
    private final Logger logger;

    public UserService(Logger logger) {
        this.logger = logger;
    }

    public void updateUser(User user) {
        logger.log("User update requested for ID: " + user.getId()); // 부가 기능 (노이즈)
        saveAsync(user);
    }

    private void saveAsync(User user) {
        CompletableFuture.runAsync(() -> {
            System.out.println("Saving user: " + user.getName());
            // Simulate delay
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println("User saved.");
        });
    }
}
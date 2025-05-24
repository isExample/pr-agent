import java.util.concurrent.CompletableFuture;

public class NotificationService {
    public void sendEmailAsync(String email) {
        CompletableFuture.runAsync(() -> {
            System.out.println("Sending confirmation email to " + email);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println("Email sent to " + email);
        });
    }
}

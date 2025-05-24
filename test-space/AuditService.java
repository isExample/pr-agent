import java.util.concurrent.CompletableFuture;

public class AuditService {
    public void recordAsync(String userId, String action) {
        CompletableFuture.runAsync(() -> {
            System.out.println("Audit log for " + userId + ": " + action);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println("Audit record complete for " + userId);
        });
    }
}

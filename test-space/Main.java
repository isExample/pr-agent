public class Main {
    public static void main(String[] args) {
        Logger logger = new Logger();
        MetricsCollector metrics = new MetricsCollector();
        NotificationService notificationService = new NotificationService();
        AuditService auditService = new AuditService();
        UserService userService = new UserService(notificationService, auditService);
        AuthService authService = new AuthService();
        PermissionChecker permissionChecker = new PermissionChecker();

        ApiGateway gateway = new ApiGateway(authService, permissionChecker, userService, logger, metrics);

        gateway.handleEmailUpdateRequest("fake-token", "new@example.com");

        // 비동기 처리를 기다리기 위한 딜레이
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

public class UserService {
    private final NotificationService notificationService;
    private final AuditService auditService;

    public UserService(NotificationService notificationService,
                       AuditService auditService) {
        this.notificationService = notificationService;
        this.auditService = auditService;
    }

    public void updateEmail(String userId, String newEmail) {
        System.out.println("UserService: updating email for " + userId + " to " + newEmail);

        // 비동기 이메일 알림
        notificationService.sendEmailAsync(newEmail);

        // 비동기 감사 로그 기록
        auditService.recordAsync(userId, "EMAIL_CHANGE");
    }
}

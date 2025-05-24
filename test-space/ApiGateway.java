public class ApiGateway {
    private final AuthService authService;
    private final PermissionChecker permissionChecker;
    private final UserService userService;
    private final Logger logger;
    private final MetricsCollector metricsCollector;

    public ApiGateway(AuthService authService,
                      PermissionChecker permissionChecker,
                      UserService userService,
                      Logger logger,
                      MetricsCollector metricsCollector) {
        this.authService = authService;
        this.permissionChecker = permissionChecker;
        this.userService = userService;
        this.logger = logger;
        this.metricsCollector = metricsCollector;
    }

    public void handleEmailUpdateRequest(String token, String newEmail) {
        String userId = authService.authenticate(token);
        if (!permissionChecker.checkPermission(userId, "UPDATE_EMAIL")) {
            throw new RuntimeException("Permission denied");
        }

        logger.log("Email update initiated for user " + userId);
        metricsCollector.collect("email_update");

        userService.updateEmail(userId, newEmail);
        System.out.println("ApiGateway: Email update complete");
    }
}
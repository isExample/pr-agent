public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public void updateUser(User user) {
        userService.updateUser(user);
        System.out.println("UserController: updateUser finished");
    }
}
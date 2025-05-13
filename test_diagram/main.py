from login_controller import LoginController

def main():
    username = "john_doe"
    password = "password123"
    
    controller = LoginController()
    is_authenticated = controller.login(username, password)

    if is_authenticated:
        print("로그인 성공!")
    else:
        print("로그인 실패!")

if __name__ == "__main__":
    main()
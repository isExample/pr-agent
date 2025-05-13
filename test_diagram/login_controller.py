from auth_service import AuthService

class LoginController:
    def __init__(self):
        self.auth_service = AuthService()

    def login(self, username: str, password: str) -> bool:
        return self.auth_service.authenticate(username, password)
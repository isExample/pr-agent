class AuthService:
    def authenticate(self, username: str, password: str) -> bool:
        # 간단한 인증 로직 (실제 서비스에서는 DB 또는 외부 API 활용)
        return username == "john_doe" and password == "password123"
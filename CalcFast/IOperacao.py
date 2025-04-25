from DTO import Request, Response


class IOperacao:
    
    @staticmethod
    def operar(self, req: Request) -> Response:
        pass
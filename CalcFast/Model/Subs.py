from IOperacao import IOperacao
from DTO import Request, Response

class Subs(IOperacao):

    @staticmethod
    def operar(self, req: Request):
        res: Response = Response(req.num1 - req.num2, "")
        return res
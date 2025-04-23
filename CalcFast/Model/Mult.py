from IOperacao import IOperacao
from DTO import Request, Response

class Mult(IOperacao):

    @staticmethod
    def operar(self, req: Request):
        res: Response = Response(req.num1 * req.num2, "")
        return res
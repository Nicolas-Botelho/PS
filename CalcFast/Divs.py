from IOperacao import IOperacao
from DTO import Request, Response

class Divs(IOperacao):

    @staticmethod
    def operar(self, req: Request):
        if (req.num2 == 0):
            res: Response = Response(0, "Divisao por Zero")
            return res
        else:
            res: Response = Response(req.num1 / req.num2, "")
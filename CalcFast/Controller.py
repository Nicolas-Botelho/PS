from DTO import Request as OpReq, Response as OpRes
from Soma import Soma
from Subs import Subs
from Mult import Mult
from Divs import Divs

class Controller:

    @staticmethod
    def control(num1: float, op: str, num2: float):

        req: OpReq = OpReq(num1, num2)
        res: OpRes

        match op.lower:
            case "+":
                res = Soma.operar(req)
                return (res.answer, res.e)
            case "-":
                res = Subs.operar(req)
                return (res.answer, res.e)
            case "*":
                res = Mult.operar(req)
                return (res.answer, res.e)
            case "/":
                res = Divs.operar(req)
                return (res.answer, res.e)
        
        res = OpRes(0, "Operacao Inexistente")
        return (res.answer, res.e)
            
        
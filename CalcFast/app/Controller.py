from lib import soma, subs, mult, divs
from lib import Request, Response

class Controller:

    @staticmethod
    def control(num1: float, op: str, num2: float):

        req = Request(num1, num2)

        match op.lower:
            case "+":
                res = soma(req)
                return (res.answer, res.err)
            case "-":
                res = subs(req)
                return (res.answer, res.err)
            case "*":
                res = mult(req)
                return (res.answer, res.err)
            case "/":
                res = divs(req)
                return (res.answer, res.err)
        
        res = Response(0, "Operacao Inexistente")
        return (res.answer, res.err)
            
        
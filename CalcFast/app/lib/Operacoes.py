from lib.DTO import Request, Response

def soma(req: Request):
    res = Response(req.num1 + req.num2, "")
    return res

def subs(req: Request):
    res = Response(req.num1 - req.num2, "")
    return res

def mult(req: Request):
    res = Response(req.num1 * req.num2, "")
    return res

def divs(req: Request):
    if (req.num2 == 0):
        res = Response(0, "Divisão por Zero")
        return res
    
    res = Response(req.num1 / req.num2, "")
    return res
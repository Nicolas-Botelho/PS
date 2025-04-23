class Request:
    num1: float
    num2: float

    def __init__(self, num1: float, num2: float):
        self.num1 = num1
        self.num2 = num2

class Response:
    answer: float
    e: str

    def __init__(self, ans: float, err: str):
        self.answer = ans
        self.e = err
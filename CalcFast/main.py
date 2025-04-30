from fastapi import FastAPI
from Operacoes import soma, subs, mult, divs
from DTO import Request

app = FastAPI()

@app.get("/")
async def root():
    return {"message": "Hello World"}

@app.post("/calc")
async def somar(num1: float = 0, num2: float = 0):
    num: float
    e: str
    num, e = soma(Request(num1, num2))
    if (e == ""): return num
    return e

@app.post("/calc")
async def subtrair(num1: float = 0, num2: float = 0):
    num: float
    e: str
    num, e = subs(Request(num1, num2))
    if (e == ""): return num
    return e

@app.post("/calc")
async def multiplicar(num1: float = 0, num2: float = 0):
    num: float
    e: str
    num, e = mult(Request(num1, num2))
    if (e == ""): return num
    return e

@app.post("/calc")
async def dividir(num1: float = 0, num2: float = 0):
    num: float
    e: str
    num, e = divs(Request(num1, num2))
    if (e == ""): return num
    return e
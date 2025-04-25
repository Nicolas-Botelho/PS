from fastapi import FastAPI
from Controller import Controller



app = FastAPI()

@app.get("/")
async def root():
    return {"message": "Hello World"}

@app.post("/calc")
async def somar(num1: float = 0, num2: float = 0):
    num, e = Controller.control(num1, "+", num2)
    if (e == ""): return num
    return e

@app.post("/calc")
async def subtrair(num1: float = 0, num2: float = 0):
    num, e = Controller.control(num1, "-", num2)
    if (e == ""): return num
    return e

@app.post("/calc")
async def multiplicar(num1: float = 0, num2: float = 0):
    num, e = Controller.control(num1, "*", num2)
    if (e == ""): return num
    return e

@app.post("/calc")
async def dividir(num1: float = 0, num2: float = 0):
    num, e = Controller.control(num1, "/", num2)
    if (e == ""): return num
    return e
package calc.controller;

import calc.model.Calcular;

public class ControllerCalc {

    public double controller(double n1, String op, double n2) throws ArithmeticException, IllegalArgumentException, Exception {

        Calcular c = new Calcular();

        return c.calcular(n1, op, n2);
    }
}

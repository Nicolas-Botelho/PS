package controller;

import model.Soma;
import model.Subs;
import model.Mult;
import model.Divs;

public class ControllerCalc {

    public double controller(double n1, String op, double n2) throws IllegalArgumentException, ArithmeticException {

        if (op.equals("+")) {
            Soma s = new Soma();
            return s.operacao(n1, n2);
        }
        else if (op.equals("-")) {
            Subs s = new Subs();
            return s.operacao(n1, n2);
        }
        else if (op.equals("x")) {
            Mult m = new Mult();
            return m.operacao(n1, n2);
        }
        else if (op.equals("/")) {
            Divs d = new Divs();
            return d.operacao(n1, n2);
        }
        else throw new IllegalArgumentException();
    }
}

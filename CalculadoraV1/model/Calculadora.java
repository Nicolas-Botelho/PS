package model;
public class Calculadora {

    public void entrada(double n1, String op, double n2) throws IllegalArgumentException, ArithmeticException {


        if (op.equals("+")) this.soma(n1, n2);
        else if (op.equals("-")) this.subs(n1, n2);
        else if (op.equals("x")) this.mult(n1, n2);
        else if (op.equals("/")) this.divs(n1, n2);
        else throw new IllegalArgumentException();
    }

    private void soma(double n1, double n2) {
        double r = n1 + n2;
        System.out.println(n1 + " + " + n2 + " =\n= " + r);
    }

    private void subs(double n1, double n2) {
        double r = n1 - n2;
        System.out.println(n1 + " - " + n2 + " =\n= " + r);
    }

    private void mult(double n1, double n2) {
        double r = n1 * n2;
        System.out.println(n1 + " x " + n2 + " =\n= " + r);
    }

    private void divs(double n1, double n2) throws ArithmeticException {
        if (n2 == 0) throw new ArithmeticException();
        
        else {
            double r = n1 / n2;
            System.out.println(n1 + " / " + n2 + " =\n= " + r);
        }
    }
}

package calc.model;

public class Divs implements Operacao{

    @Override
    public double operacao(double n1, double n2) throws ArithmeticException{
        if (n2 == 0) throw new ArithmeticException();

        else return n1 / n2;
    }
}

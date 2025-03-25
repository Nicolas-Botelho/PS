import model.Calculadora;
import view.Entrada;

public class Main {
    public static void main(String[] args) {
        Entrada e = new Entrada();
        Calculadora c = new Calculadora();

        e.menu(c);
    }
}

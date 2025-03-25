package view;
import java.util.NoSuchElementException;
import java.util.Scanner;
import controller.ControllerCalc;

public class Entrada {

    public void menu() {

        Scanner s = new Scanner(System.in);
        
        int op = 2;

        while (op != 0) {
            try {
                System.out.println("\nEscolha uma das opções abaixo\n" +
                "1 - Efetuar conta\n" +
                "0 - Sair");
                
                op = Integer.parseInt(s.nextLine());
                
                if (op == 1) this.menuConta();

                else if (op != 0) System.out.println("Digite o número de uma das opções");
            }
            catch (NoSuchElementException nse) {
                System.out.println("\nDigite uma opção válida");
            }
            catch(NumberFormatException nf) {
                System.out.println("\nDigite somente o número da opção");
            }
        }
    }

    public void menuConta() {

        Scanner s = new Scanner(System.in);
        ControllerCalc cc = new ControllerCalc();

        double n1, n2;
        String op;

        try {
            System.out.println("Digite o primeiro número");
            n1 = Double.parseDouble(s.nextLine());

            System.out.println("Digite o operador desejado\n" +
            "Operadores: +  -  x  /");
            op = s.nextLine();

            System.out.println("Digite o segundo número");
            n2 = Double.parseDouble(s.nextLine());

            System.out.println(n1 + " " + op + " " + n2 + " = " + cc.controller(n1, op, n2));
        }
        catch (NoSuchElementException nse) {
            System.out.println("\nDigite um número ou um operador válido");
        }
        catch(NumberFormatException nf) {
            System.out.println("\nDigite somente o número escolhido");
        }
        catch(IllegalArgumentException ia) {
            System.out.println("\nEscolha um operador válido");
        }
        catch(ArithmeticException a) {
            System.out.println("\nDivisão por zero!");
        }
    }
}

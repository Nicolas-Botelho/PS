package calc.view;
import java.util.NoSuchElementException;
import java.util.Scanner;

import calc.controller.ControllerCalc;
import calc.controller.OperadoresValidos;

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
        OperadoresValidos ov = new OperadoresValidos();

        double num1, num2;
        String operador;

        try {
            System.out.println("Digite o primeiro número");
            num1 = Double.parseDouble(s.nextLine());

            System.out.println("Digite o operador desejado");
            for (String oprVal : ov.operadores()) {
                System.out.print(oprVal + "   ");
            }
            System.out.println();

            operador = s.nextLine();

            System.out.println("Digite o segundo número");
            num2 = Double.parseDouble(s.nextLine());

            System.out.println("Resultado = " + cc.controller(num1, operador, num2));
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
        catch(Exception e) {
            System.out.println("\nUm erro inesperado ocorreu. Tente novamente");
        }
    }
}

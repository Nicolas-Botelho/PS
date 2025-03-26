package calc.model;

import java.util.Set;

import org.reflections.Reflections;

public class Calcular {
    
    public double calcular (double n1, String operador, double n2) throws ArithmeticException, IllegalArgumentException, Exception {

        Operacao operacao;

        Reflections refl = new Reflections("calc.model");

        Set<Class <? extends Operacao>> classesList = refl.getSubTypesOf(Operacao.class);

        for (Class<? extends Operacao> cls : classesList) {
            if (operador.toLowerCase().equals(cls.getSimpleName().toLowerCase())) {

                operacao = (Operacao )cls.getDeclaredConstructor().newInstance();

                return operacao.operacao(n1, n2);
            }
        }
        throw new IllegalArgumentException();
        
    }
}

package calc.controller;

import java.util.ArrayList;
import java.util.Set;
import org.reflections.Reflections;

import calc.model.Operacao;

public class OperadoresValidos {

    public ArrayList<String> operadores() {
        Reflections refl = new Reflections("calc.model");
        ArrayList<String> opr = new ArrayList<>();

        Set<Class <? extends Operacao>> classesList = refl.getSubTypesOf(Operacao.class);

        for (Class <? extends Operacao> cls : classesList) {
            opr.add(cls.getSimpleName());
        }

        return opr;
    }
}

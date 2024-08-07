package bimestre1.semana03.exercicios;

import java.util.Comparator;

public class ComparadorNome implements Comparator<Usuario> {

    @Override
    public int compare(Usuario o1, Usuario o2) {
        return o1.getNome().compareTo(o2.getNome());
    }
}

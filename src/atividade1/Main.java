package atividade1;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(null, 1, 1, 2002);
        Pessoa p2 = new Pessoa(null, 1, 1, 2002);

        System.out.println(p1.equals(p2));

        Aluno a1 = new Aluno("Gustavo Lemos", 1, 9, 2005, "SP3089011");

        System.out.println(a1.toString());
    }
}

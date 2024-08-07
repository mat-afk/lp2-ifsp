package bimestre1.semana03.exercicios;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        Usuario u1 = new Usuario("Luiz Fernando Quirino");

        Post p1 = new Post("Olá, mundo");
        Post p2 = new Post(30, 03, 2024, 16, 53, 3, "Há um tipo de beleza nessa cidade quase cinza");
        Post p3 = new Post(
                "Doguinho das vitamina D passando na timeline pra te lembrar de tomar sol. #nofilter #sunnyday #dog #instadog",
                "cachorro-sol.png", "cachorro");

        u1.post(p1);
        u1.post(p2);
        u1.post(p3);

        Collections.sort(u1.getLista(), Collections.reverseOrder());

        for (Post p : u1.getLista()) {
            System.out.println(p);
        }

        Usuario u2 = new Usuario("Mateus Cruzatto");
        Usuario u3 = new Usuario("Gustavo Lemos");

        ArrayList<Usuario> usuarios = new ArrayList<>();
        usuarios.add(u1);
        usuarios.add(u2);
        usuarios.add(u3);

        ComparadorNome comparador = new ComparadorNome();

        Collections.sort(usuarios, comparador);

        for (Usuario usuario : usuarios) {
            System.out.println(usuario);
        }
    }
}

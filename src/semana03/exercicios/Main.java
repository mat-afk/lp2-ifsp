package semana03.exercicios;


import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		
		Usuario u1 = new Usuario("Markiplier");
		
		ArrayList<Post> posts = new ArrayList<>();
		
		posts.add(new Post(2024, 1, 5, 21, 7, 48, "Hello, world"));
		posts.add(new Post(2024, 3, 30, 15, 7, 48, "I am hungry"));
		posts.add(new Post("Hello, everyone, my name is Markiplier"));
		
		u1.setPosts(posts);
		
		Collections.sort(u1.getPosts());
		
		for (Post p : u1.getPosts()) {
			System.out.println(p);
		}
		
		Usuario u2 = new Usuario("Domingos Latorre");
		u2.post(new Post("Sou muito fofo :3", new Imagem("bunda.jpg")));
		
		Usuario u3 = new Usuario("Baekhyun");
		u3.post(new Post("Annyeonghaseyo"));
		u3.post(new Post("Tempo MV out!!!", new Imagem("")));
		
		ComparadorUsuario comparador = new ComparadorUsuario();
		
		ArrayList<Usuario> usuarios = new ArrayList<>();
		usuarios.add(u2);
		usuarios.add(u3);
		
		Collections.sort(usuarios, comparador);
		
		for (Usuario u : usuarios) {
			System.out.println(u);
		}
	}
}
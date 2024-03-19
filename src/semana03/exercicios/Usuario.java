package semana03.exercicios;

import java.util.ArrayList;
import java.util.Objects;

public class Usuario {
	
	private String nome;
	private ArrayList<Post> posts;
	
	public Usuario(String nome, ArrayList<Post> posts) {
		this.nome = nome;
		this.posts = posts;
	}
	
	public Usuario(String nome) {
		this.nome = nome;
		this.posts = new ArrayList<>();
	}
	
	public void post(Post post) {
		posts.add(post);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Post> getPosts() {
		return posts;
	}

	public void setPosts(ArrayList<Post> posts) {
		this.posts = posts;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, posts);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(nome, other.nome) && Objects.equals(posts, other.posts);
	}

	@Override
	public String toString() {
		return "Usuario [nome=" + nome + ", posts=" + posts + "]";
	}

	public int compareTo(Usuario other) {
		return this.nome.compareTo(other.nome);
	}
}

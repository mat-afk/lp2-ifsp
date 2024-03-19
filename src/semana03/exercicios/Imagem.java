package semana03.exercicios;

import java.util.Objects;

public class Imagem {
	
	private String arquivo;
	private String descricao;
	
	public Imagem() {
		this.arquivo = "";
		this.descricao = "";
	}
	
	public Imagem(String arquivo, String descricao) {
		this.arquivo = arquivo;
		this.descricao = descricao;
	}
	
	public Imagem(String arquivo) {
		this.arquivo = arquivo;
		this.descricao = "";
	}

	public String getArquivo() {
		return arquivo;
	}

	public void setArquivo(String arquivo) {
		this.arquivo = arquivo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public int hashCode() {
		return Objects.hash(arquivo, descricao);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Imagem other = (Imagem) obj;
		return Objects.equals(arquivo, other.arquivo) && Objects.equals(descricao, other.descricao);
	}

	@Override
	public String toString() {
		return "Imagem [arquivo=" + arquivo + ", descricao=" + descricao + "]";
	}	
}

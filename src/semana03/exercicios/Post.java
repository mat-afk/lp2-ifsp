package semana03.exercicios;

import java.time.LocalDateTime;
import java.util.Objects;

public class Post implements Comparable<Post> {
	
	private LocalDateTime dataHorario;
	private String texto;
	private Imagem imagem;
	
	public Post() {
		this.dataHorario = null;
		this.texto = "";
		this.imagem = null;
	}
	
	public Post(
		Integer ano, 
		Integer mes, 
		Integer dia, 
		Integer horas, 
		Integer minutos, 
		Integer segundos, 
		String texto, 
		Imagem imagem
	) {
		this.dataHorario = LocalDateTime.of(ano, mes, dia, horas, minutos, segundos);
		this.texto = texto;
		this.imagem = imagem;
	}
	
	public Post(
			Integer ano, 
			Integer mes, 
			Integer dia, 
			Integer horas, 
			Integer minutos, 
			Integer segundos, 
			String texto 
		) {
			this.dataHorario = LocalDateTime.of(ano, mes, dia, horas, minutos, segundos);
			this.texto = texto;
			this.imagem = null;
		}
	
	public Post(LocalDateTime dataHorario, String texto, Imagem imagem) {
		this.dataHorario = dataHorario;
		this.texto = texto;
		this.imagem = imagem;
	}
	
	public Post(String texto, Imagem imagem) {
		this.dataHorario = LocalDateTime.now();
		this.texto = texto;
		this.imagem = imagem;
	}
	
	public Post(LocalDateTime dataHorario, String texto) {
		this.dataHorario = dataHorario;
		this.texto = texto;
		this.imagem = null;
	}
	
	public Post(String texto) {
		this.dataHorario = LocalDateTime.now();
		this.texto = texto;
		this.imagem = null;
	}
	
	public LocalDateTime getDataHorario() {
		return dataHorario;
	}

	public void setDataHorario(LocalDateTime dataHorario) {
		this.dataHorario = dataHorario;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Imagem getImagem() {
		return imagem;
	}

	public void setImagem(Imagem imagem) {
		this.imagem = imagem;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dataHorario, imagem, texto);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Post other = (Post) obj;
		return Objects.equals(dataHorario, other.dataHorario) && Objects.equals(imagem, other.imagem)
				&& Objects.equals(texto, other.texto);
	}

	@Override
	public String toString() {
		return "Post [dataHorario=" + dataHorario + ", texto=" + texto + ", imagem=" + imagem + "]";
	}

	@Override
	public int compareTo(Post other) {
		return this.dataHorario.compareTo(other.dataHorario);
	}
}

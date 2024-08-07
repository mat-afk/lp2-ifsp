package bimestre1.semana03.exercicios;

import java.time.LocalDateTime;

public class Post implements Comparable<Post> {
    private LocalDateTime dataHorario;
    private String texto;
    private Imagem imagem;

    public Post() {
        this.dataHorario = LocalDateTime.now();
        this.texto = "";
    }

    public Post(int dia, int mes, int ano, int hora, int minuto, int segundo, String texto, String arquivo,
            String descricao) {
        this.dataHorario = LocalDateTime.of(ano, mes, dia, hora, minuto, segundo);
        this.texto = texto;
        this.imagem = new Imagem(arquivo, descricao);
    }

    public Post(int dia, int mes, int ano, int hora, int minuto, int segundo, String texto) {
        this.dataHorario = LocalDateTime.of(ano, mes, dia, hora, minuto, segundo);
        this.texto = texto;
        this.imagem = new Imagem();
    }

    public Post(String texto, String arquivo, String descricao) {
        this.dataHorario = LocalDateTime.now();
        this.texto = texto;
        this.imagem = new Imagem(arquivo, descricao);
    }

    public Post(String texto) {
        this.dataHorario = LocalDateTime.now();
        this.texto = texto;
        this.imagem = new Imagem();
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
        final int prime = 31;
        int result = 1;

        result = prime * result + ((dataHorario == null) ? 0 : dataHorario.hashCode());
        result = prime * result + ((texto == null) ? 0 : texto.hashCode());
        result = prime * result + ((imagem == null) ? 0 : imagem.hashCode());

        return result;
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

        if (dataHorario == null) {
            if (other.dataHorario != null)
                return false;
        } else if (!dataHorario.equals(other.dataHorario))
            return false;

        if (texto == null) {
            if (other.texto != null)
                return false;
        } else if (!texto.equals(other.texto))
            return false;

        if (imagem == null) {
            if (other.imagem != null)
                return false;
        } else if (!imagem.equals(other.imagem))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "Post [dataHorario=" + dataHorario + ", texto=" + texto + ", imagem=" + imagem + "]";
    }

    @Override
    public int compareTo(Post o) {
        return this.dataHorario.compareTo(o.dataHorario);
    }
}

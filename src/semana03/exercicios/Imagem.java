package semana03.exercicios;

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
        final int prime = 31;
        int result = 1;

        result = prime * result + ((arquivo == null) ? 0 : arquivo.hashCode());
        result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());

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

        Imagem other = (Imagem) obj;

        if (arquivo == null) {
            if (other.arquivo != null)
                return false;
        } else if (!arquivo.equals(other.arquivo))
            return false;

        if (descricao == null) {
            if (other.descricao != null)
                return false;
        } else if (!descricao.equals(other.descricao))
            return false;
            
        return true;
    }

    @Override
    public String toString() {
        return "Imagem [arquivo=" + arquivo + ", descricao=" + descricao + "]";
    }
}

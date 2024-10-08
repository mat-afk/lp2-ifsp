package bimestre1.atividade1;

public class Aluno extends Pessoa {
    private String prontuario;

    public Aluno() {
        super();
        this.prontuario = "";
    }

    public Aluno(String nome, int dia, int mes, int ano, String prontuario) {
        super(nome, dia, mes, ano);
        this.prontuario = prontuario;
    }

    public String getProntuario() {
        return prontuario;
    }

    public void setProntuario(String prontuario) {
        this.prontuario = prontuario;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();

        result = prime * result + ((prontuario == null) ? 0 : prontuario.hashCode());

        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;

        Aluno other = (Aluno) obj;

        if (prontuario == null) {
            if (other.prontuario != null)
                return false;
        } else if (!prontuario.equals(other.prontuario))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "Aluno [nome=" + getNome() + ", idade=" + getIdade() + ", prontuario=" + prontuario + "]";
    }
}

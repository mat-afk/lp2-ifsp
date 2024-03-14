package semana01.exercicios;

public class Moto extends Veiculo {

    private String cor;

    public Moto() {
        super();
        this.cor = "";
    }

    public Moto(String marca, Integer ano, String cor) {
        super(marca, ano);
        this.cor = cor;
    }

    public Moto(String marca, Integer ano) {
        super(marca, ano);
        this.cor = "";
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();

        result = prime * result + ((cor == null) ? 0 : (cor.hashCode()));

        return result;
    }

    @Override 
    public boolean equals(Object obj) {

        if (this == obj) 
            return true;
        if (obj == null) 
            return false;
        if (!super.equals(obj)) 
            return false;
        if (getClass() != obj.getClass()) 
            return false;

        Moto other = (Moto) obj;

        if (this.cor == null) {
            if(other.cor != null) {
                return false;
            }
        }
        else if (!this.cor.equals(other.cor)) 
            return false;

        return true;
    }
}
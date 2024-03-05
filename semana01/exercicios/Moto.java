package lp2;

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

        result = prime * result + ((cor == null) : 0 ? (cor.hashCode()));

        return result;
    }

    @Override 
    public boolean equals(Object obj) {

        if(this == obj) {
            return true;
        }

        if(obj == null) {
            return false
        }

        if(getClass() != obj.getClass()) {
            return false;
        }

        Moto other = (Moto) obj;

        if(this.marca == null) {
            if(other.marca != null) {
                return false
            }
        }
        else if(!this.marca.equals(other.marca)) {
            return false;
        }

        if(this.ano == null) {
            if(other.ano != null) {
                return false
            }
        }
        else if(!this.ano.equals(other.ano)) {
            return false;
        }

        if(this.cor == null) {
            if(other.cor != null) {
                return false
            }
        }
        else if(!this.cor.equals(other.cor)) {
            return false;
        }

        return true;
    }
}
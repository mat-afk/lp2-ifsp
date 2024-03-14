package semana01.exercicios;

public class Veiculo {

    private String marca;
    private Integer ano;

    public Veiculo() {
        this.marca = "";
        this.ano = 0;
    }

    public Veiculo(String marca, Integer ano) {
        this.marca = marca;
        this.ano = ano;
    }

    public Veiculo(String marca) {
        this.marca = marca;
        this.ano = 0;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getAno() {
        return this.ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((marca == null) ? 0 : (marca.hashCode()));
        result = prime * result + ((ano == null) ? 0 : (ano.hashCode()));

        return result;
    }

    @Override 
    public boolean equals(Object obj) {

        if(this == obj) 
            return true;
        if(obj == null) 
            return false;
        if(getClass() != obj.getClass()) 
            return false;

        Veiculo other = (Veiculo) obj;

        if(this.marca == null) {
            if(other.marca != null) 
                return false;
        }
        else if(!this.marca.equals(other.marca)) 
            return false;

        if(this.ano == null) {
            if(other.ano != null) 
                return false;
        }
        else if(!this.ano.equals(other.ano)) 
            return false;

        return true;
    }
}
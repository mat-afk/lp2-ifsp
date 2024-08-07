package bimestre1.semana01.exercicios;

public class Carro extends Veiculo {

    private String modelo;
    private String placa;

    public Carro() {
        super();
        this.modelo = "";
        this.placa = "";
    }

    public Carro(String marca, Integer ano, String modelo, String placa) {
        super(marca, ano);
        this.modelo = modelo;
        this.placa = placa;
    }

    public Carro(String marca, Integer ano) {
        super(marca, ano);
        this.modelo = "";
        this.placa = "";
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();

        result = prime * result + ((modelo == null) ? 0 : (modelo.hashCode()));
        result = prime * result + ((placa == null) ? 0 : (placa.hashCode()));

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

        Carro other = (Carro) obj;

        if (this.modelo == null) {
            if (other.modelo != null)
                return false;
        } else if (!this.modelo.equals(other.modelo))
            return false;

        if (this.placa == null) {
            if (other.placa != null)
                return false;
        } else if (!this.placa.equals(other.placa))
            return false;

        return true;
    }
}
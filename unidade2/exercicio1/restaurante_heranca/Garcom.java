package unidade2.exercicio1.restaurante_heranca;

public class Garcom extends Funcionario{
    private Double gorjeta;

    public Garcom(String nome, String cargo, Double gorjeta) {
        super(nome, cargo);
        this.gorjeta = gorjeta;
    }

    public Double getGorjeta() {
        return gorjeta;
    }

    public void setGorjeta(Double gorjeta) {
        this.gorjeta = gorjeta;
    }

    @Override
    public String toString() {
        return "Garcom [gorjeta=" + gorjeta + ", toString()=" + super.toString() + "]";
    }

    
}

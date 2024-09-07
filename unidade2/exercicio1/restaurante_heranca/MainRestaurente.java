package unidade2.exercicio1.restaurante_heranca;

public class MainRestaurente {
    public static void main(String[] args) {
        Funcionario umFuncionario = new Funcionario("Gabriel", "chefe de cozinha");
        Garcom uGarcom = new Garcom("Bolsonar", "Garcom", 17.00);
        System.out.print(uGarcom);
        System.out.print(umFuncionario);
    }


}

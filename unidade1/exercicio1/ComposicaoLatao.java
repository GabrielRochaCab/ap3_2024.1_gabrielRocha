package unidade1.exercicio1;

import java.util.Scanner;

public class ComposicaoLatao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de latão em quilos: ");
        double quantidadeLatao = scanner.nextDouble();

        double quantidadeCobre = quantidadeLatao * 0.70;
        double quantidadeZinco = quantidadeLatao * 0.30;

        System.out.println("Para " + quantidadeLatao + " kg de latão:");
        System.out.println(quantidadeCobre + " kg de cobre");
        System.out.println(quantidadeZinco + " kg de zinco");

        scanner.close();
    }
}


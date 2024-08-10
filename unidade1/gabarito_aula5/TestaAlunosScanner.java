package unidade1.gabarito_aula5;

import unidade1.gabarito_aula4.Aluno;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TestaAlunosScanner {
    public static void main(String[] args){
        Aluno umAluno = new Aluno();

        Scanner teclado = new Scanner(System.in);
        System.out.println();
        System.out.println("Digite o nome do Aluno");
        
        String nomeDoAluno = teclado.nextLine();

        System.out.println("Digite a nota 1:");
        double nota1 = teclado.nextDouble();

        System.out.println("Digite a nota 2");
        double nota2 = teclado.nextDouble();

        System.out.println("Digite a nota 3");
        double nota3 = teclado.nextDouble();

        System.out.println("Digite o nome da mae");
        String nomeDaMae = teclado.next();

        DateTimeFormatter padrao = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.print("Digite a data de nascimento (formato dd/MM/yyyy)");
        String dataNascimentoString = teclado.next();
        LocalDate dataNascimento = LocalDate.parse(dataNascimentoString, padrao);

        umAluno.setNomeDoAluno(nomeDoAluno);
        umAluno.setNota1(nota1);
        umAluno.setNota2(nota2);
        umAluno.setNota3(nota3);
        umAluno.setNomeDaMae(nomeDaMae);
    
        System.out.println(umAluno);
        teclado.close();
    }

}

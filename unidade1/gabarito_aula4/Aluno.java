package unidade1.gabarito_aula4;

import java.time.LocalDate;

public class Aluno {

    String nomeDoAluno = "Gabriel";
    String nomeDaMae = "Jane";
    double nota1 = 5.0;
    double nota2;
    double nota3;
    LocalDate dataNascimento = null;
    LocalDate dataCadastro = LocalDate.now();

    public String getNomeDoAluno() {
        return nomeDoAluno;
    }

    public String getNomeDaMae(){
        return nomeDaMae;
    }


    public String getNomeDoAlunoEmMaiusculo() {
        return nomeDoAluno.toUpperCase();
    }
    public String getNomeDoAlunoEmMinusculo() {
        return nomeDoAluno.toLowerCase();
    }
    public void setNomeDoAluno(String nomeDoAluno) {
        this.nomeDoAluno = nomeDoAluno;
    }
    public void setNomeDaMae(String nomeDaMae){
        this.nomeDaMae = nomeDaMae;
    }


    public double getNota1() {
        return nota1;
    }
    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }
    public double getNota2() {
        return nota2;
    }
    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    public double getNota3() {
        return nota3;
    }
    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }
    public double getMedia() {
        return (nota1 + nota2 + nota3) / 3;
    }
    public boolean aprovadoMedia() {
        if (getMedia() >= 7)
            return true;
        return false;
    }

    @Override
    public String toString() {
        return "Aluno [nomeDoAluno=" + nomeDoAluno + ", nomeDaMae=" + nomeDaMae + ", nota1=" + nota1 + ", nota2="
                + nota2 + ", nota3=" + nota3 + ", dataNascimento=" + dataNascimento + ", dataCadastro=" + dataCadastro
                + "]";
    }

    
    
    
    }

   


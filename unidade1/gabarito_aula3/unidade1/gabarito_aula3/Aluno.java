package unidade1.gabarito_aula3;

public class Aluno {
    String nomeDoAluno = "GabrielRocha";
    double nota1;
    double nota2;
    double nota3;

    public String getNomeMaiusculo(){
        return nomeDoAluno.toUpperCase();
    }

    public String getNomeMinusculo(){
        return nomeDoAluno.toLowerCase();
    }

    public double getMedia(){
        return (nota1 + nota2 + nota3) / 3;
    }

    public boolean aprovadorPorMedia(){
        if (getMedia() >=7){
            return true;
        }

        else{
            return false;
        }
    }

    public String getNomeDoAluno() {
        return nomeDoAluno;
    }
    public void setNomeDoAluno(String nomeDoAluno) {
        this.nomeDoAluno = nomeDoAluno;
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

    @Override
    public String toString() {
        return "Aluno [nome=" + nomeDoAluno + ", nota1=" + nota1 + ", nota2=" + nota2 + ", nota3=" + nota3 + "]";
    }
    
}

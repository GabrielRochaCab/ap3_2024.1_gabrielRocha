package unidade1.gabarito_aula3;

public class TestaAluno {
    public static void main(String[] args) {

        Aluno gabriel = new Aluno();

        gabriel.setNome("GabrielRocha");
        gabriel.setNota1(10);
        gabriel.setNota2(7);
        gabriel.setNota3(5);
        System.out.println();
        System.out.println(gabriel);


        if (gabriel.aprovadoPorMedia())
            System.out.println("Passou por média");

        else
            System.out.println("Reprovou pq tirou " + gabriel.getMedia());
    }
}

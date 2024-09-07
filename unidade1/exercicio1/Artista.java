package unidade1.exercicio1;

//Xico - Corrigindo: Falta codigo secreto
//Xico - Corrigindo: Falta javadoc

public class Artista { //
    //Xico - Corrigindo: O nome da classe não corresponde ao nome UML. Faltam métodos do diagrama UML.
    
    private String nome;
    private String periodo;

    // Construtor
    public Artista(String nome, String periodo) {
        this.nome = nome;
        this.periodo = periodo;
    }

    // Método para exibir os atributos
    public String toString() {
        return "Artista: " + nome.toUpperCase() + ", Período: " + periodo;
    }

    public static void main(String[] args) {
        // Criando as três instâncias de pintores
        Artista artista1 = new Artista("Leonardo da Vinci", "Renascimento Italiano"); //Xico - Corrigindo: Os parametros estao errados.
        Artista artista2 = new Artista("Michelangelo", "Renascimento Italiano");
        Artista artista3 = new Artista("Raphael", "Renascimento Italiano");

        System.out.println(artista1);
        System.out.println(artista2);
        System.out.println(artista3);
    }
}


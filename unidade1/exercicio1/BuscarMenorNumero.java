package unidade1.exercicio1;
import java.util.LinkedList;
import java.util.Random;

public class BuscarMenorNumero {
    public static void main(String[] args){
        //vai criar uma lisa para armazenar os numeros
        LinkedList<Integer> numeros = new LinkedList<>();

        //vai criar um objeto para gerar numeros aleatorios
        Random random = new Random();

        for (int i = 0; i < 9999; i++){
            numeros.add(random.nextInt(10000) + 1);
        }

        //Vai armazenar o menor numero
        int menorNumero = Integer.MAX_VALUE;

        for (int numero : numeros){
            if (numero < menorNumero){
                menorNumero = numero;
            }
        }

        System.out.println("O menor numero positivo da lista: " + menorNumero);

    }
}

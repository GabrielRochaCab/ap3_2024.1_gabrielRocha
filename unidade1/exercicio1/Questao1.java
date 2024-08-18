package unidade1.exercicio1;

import java.util.Scanner;

public class Questao1 {
  public static double getDistancia() {

//corrigi o .out para .in, já que o in é usado para ler os dados digitados
  Scanner teclado = new Scanner(System.in);

  double x1, y1, x2, y2;

  System.out.println("Entre com as coordenadas x e y dos pontos nesta ordem:"); //Mudei para nextDouble para evitar erros de arrendondamentos 
  x1=teclado.nextDouble();
  y1=teclado.nextDouble();
  x2=teclado.nextDouble();
  y2=teclado.nextDouble();

  //coloquei o tipo double para potenciacao e o metodo de raiz quadrada sqrt
  double distancia = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));

  System.out.println("A distância é: "+distancia);
    return distancia;
  }

  public static double getAmplitude(){
  
  double val1 = 0.0, val2=1.1, val3=-3.3;
    return val1 - val2 - val3;

}

  public static void main(String[] args) {
      System.out.println(Questao1.getDistancia());
      System.out.println(Questao1.getAmplitude());
    }
}

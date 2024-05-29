import java.util.Scanner;

public class Main {

  public static void main(String[] args){
    Scanner ref = new  Scanner(System.in);

    System.out.println("Digite um número máximo para a sequência de Fibonacci: ");
    int numMax = ref.nextInt();

    int a = 0;
    int b = 1;

    System.out.println("Sequência de Fibonacci: ");
      
    for (int i = 0; a <= numMax; i++){
      System.out.println(a + "");

      int soma = a + b;
      a = b;
      b = soma;
    }
    }
}

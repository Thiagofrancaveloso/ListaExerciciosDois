import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
    Scanner ref = new Scanner (System.in);

System.out.println("Digite um número:");
    double num = ref.nextDouble();

    double raizQuadrada = Math.sqrt(num);

    double raizCubica = Math.cbrt(num);

System.out.println("A raiz quadrada de " + num + " é " + raizQuadrada);
 

    System.out.println("A raiz cúbica de " + num + " é " + raizCubica);
    
    }
}

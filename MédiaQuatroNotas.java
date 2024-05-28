import java.util.Scanner;

public class Main {
  
  public static void main(String[] args) {
    Scanner ref = new Scanner(System.in);
    
     System.out.println("Digite suas quatro notas (entre 0 e 10):");
    double nota1 = ref.nextDouble();
    double nota2 = ref.nextDouble ();
    double nota3 = ref.nextDouble ();
    double nota4 = ref.nextDouble ();

    double media = (nota1 + nota2 + nota3 + nota4) /4;

    System.out.println("Sua média é:" + media);

  }

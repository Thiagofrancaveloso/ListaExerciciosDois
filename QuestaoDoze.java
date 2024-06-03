import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
    Scanner ref = new Scanner (System.in);

System.out.println("Digite cinco números:");
      
      double [] num = new double [5];
      for (int i = 0; i < 5; i++) {
          num[i] = ref.nextDouble();
      }
Arrays.sort(num);

System.out.println("A ordem dos números é:");
    for (double número: num) {
System.out.println(número);
     }

}
}

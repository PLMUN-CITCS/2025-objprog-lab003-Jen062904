import java.util.Scanner;

public class InputOutputDemo {
  public static void main(String[] args) {

   Scanner scanner = new Scanner(System.in);

   System.out.print("Enter an integer: ");
   int integerInput = scanner.nextInt();

   System.out.print("Enter a decimal number: ");
   double decimalInput = scanner.nextDouble();

   scanner.nextLine();

   System.out.print("Enter a word or sentence: ");
   String stringInput = scanner.nextLine();

   System.out.printf("Your integer: %d\n", integerInput);
   System.out.printf("Your decimal number: %.2f\n", decimalInput);
   System.out.printf("Your string: %s\n", stringInput);

    scanner.close();
   
   }
}

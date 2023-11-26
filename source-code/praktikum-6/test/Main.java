import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      try {
        System.out.print("Masukkan angka a: ");
        int a = scanner.nextInt();

        System.out.print("Masukkan angka b: ");
        int b = scanner.nextInt();

        double result = a / b;
        System.out.println(result);
      } catch (InputMismatchException e) {
        System.out.println("Tipe datanya dilihat lagi kak :)");
        scanner.nextLine();
      } catch (ArithmeticException e) {
        System.out.println("Pembaginya dilihat lagi ya kak :)");
      }
    }
  }
}
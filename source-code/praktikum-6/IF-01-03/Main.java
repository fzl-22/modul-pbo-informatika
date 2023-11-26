import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      try {
        System.out.print("Masukkan umur: ");
        int umur = scanner.nextInt();

        if (umur < 0 || umur > 200) {
          throw new IllegalArgumentException("Umur tidak valid...");
        }
      } catch (IllegalArgumentException e) {
        System.out.println(e.toString());
      }
    }
    // double result = 0;
    // while (true) {
    // try {
    // System.out.print("Masukkan angka a: ");
    // int a = scanner.nextInt();

    // System.out.print("Masukkan angka b: ");
    // int b = scanner.nextInt();

    // result = a / b;
    // } catch (Exception error) {
    // scanner.nextLine();
    // System.out.println("Dilihat lagi tipe datanya ya kak :)");
    // } finally {
    // System.out.println("Result: " + result);
    // }
    // }

    // System.out.print("Masukkan N: ");
    // int N = scanner.nextInt();

    // System.out.print("Masukkan a: ");
    // int a = scanner.nextInt();

    // System.out.print("Masukkan b: ");
    // int b = scanner.nextInt();

    // for(int i = a; i < b; i++){
    // try{
    // System.out.println(N + "/" + i + " = " + N / i);
    // }catch(ArithmeticException error){
    // System.out.println("Ada error nih. Errornya: " + error.toString());
    // }
    // }

    // scanner.close();
  }
}

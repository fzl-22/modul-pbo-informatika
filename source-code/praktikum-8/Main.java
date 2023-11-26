public class Main {
  public static void main(String[] args) {
    Student student = new Student("Eka");
    student.goCry();
    student.goHome();

    student = null;
    System.gc();
    System.out.println("[GC] Garbace collection selesai...");
  }
}

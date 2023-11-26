public class Student {
  private String name;

  public Student(String name) {
    this.name = name;
  }

  public void goCry() {
    String nama = "Tri";
    System.out.println(this.name + " sedang menangis...");
  }

  public void goHome() {
    String alamat = "Ketintang";
    System.out.println(nama);
    // ...
  }

  @Override
  protected void finalize() throws Throwable {
    try {
      System.out.println("[FINALIZE] Finalize dijalankan...");
    } catch (Throwable error) {
      throw error;
    } finally {
      System.out.println();
      super.finalize();
      System.out.println("[FINALIZE] Finalize selesai...");
    }
  }
}



public class Main {
  public static void main(String[] args) {
    // Creation
    Lifecycle obj = new Lifecycle();

    // Initialization
    obj.initializeData("DATA");
    
    // Utilization
    obj.performTask();

    // 2 cara membuat object eligible untuk dibersihkan
    // OPSIONAL SESUAI KEBUTUHAN
    // 1. buat referensi jadi null
    obj = null;
    // 2. referensikan ke object lain
    
    // Memaksa JVM untuk menjalankan Garbage Collection
    System.gc();
  }
}

public class Lifecycle {
  private String data;
  
  public void initializeData(String data) {
    this.data = data;
    System.out.println("Menginiasi dengan data: " + this.data);
  }

  public void performTask() {
    if(this.data == null){
      System.out.println("Melakukan tugas tanpa data");
      return;
    }

    System.out.println("Melakukan tugas dengan data: " + this.data);
  }
}


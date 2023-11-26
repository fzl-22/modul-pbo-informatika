public class Student {
  private String name;

  public Student(String name){
    this.name = name;
    System.out.println("Constructor is executed...");
  }

  public void utilizeObject(){
    int data = 20;
    System.out.println(this.name + " is utilized...");
  }

  @Override
  protected void finalize() throws Throwable{
    try {
      System.out.println("Executing finalize...");
      super.finalize();
    } catch (Throwable error) {
      throw error;
    } finally {
      System.out.println("Finalize is executed...");
    }
  }
}

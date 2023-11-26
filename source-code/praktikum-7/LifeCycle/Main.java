public class Main {
  public static void main(String[] args){
    // Creation & Initialization
    Obj obj = new Obj("DATA");

    // Utilization
    obj.utilizeObject();

    // Disposal
    obj = Obj1();

    // NOT RECOMMENDED
    // System.gc();
  }
}

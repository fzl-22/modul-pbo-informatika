package classes;

public class Circle extends Shape{
  private int radius;

  public Circle(int radius){
    this.radius = radius;
  }

  @Override
  public void draw(){
    System.out.println("Menggambar lingkaran dengan radius " + this.radius);
  }

  @Override
  public double calculateArea(){
    return Math.PI * this.radius * this.radius;
  }
}

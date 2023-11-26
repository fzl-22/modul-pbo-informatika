package classes;

public class Rectangle extends Shape{
  private int length;
  private int width;

  public Rectangle(int width, int length){
    this.width = width;
    this.length = length;
  }

  @Override
  public void draw(){
    System.out.println("Menggambar persegi dengan panjang " + this.length + " dan lebar " + this.width);
  }

  @Override
  public double calculateArea(){
    return this.length * this.width;
  }
}
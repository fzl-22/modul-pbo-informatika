package classes;

public class Player {
  public String name;
  public int speed;
  public int healthPoint;

  public void run() {
    System.out.println(name + " " + "is running...");
    System.out.println("Speed" + " " + speed);
  }

  public void getHit() {
    healthPoint = healthPoint - 5;
  }

  public boolean isDead() {
    return healthPoint <= 0;
  }
}


package Inheritance.soal;
public class Motorcycle extends Vehicle{
  private boolean hasSideCar;

  public Motorcycle(String color){
    super("Motorcycle", color);
  }

  public void setHasSideCar(boolean hasSideCar){
    this.hasSideCar = hasSideCar;
  }

  public void displayMotorcycleInfo(){
    super.displayInfo();
    if (hasSideCar) {
      System.out.println("This motorcycle has side door");
    } else {
      System.out.println("This motorcycle doesn't have side door");
    }
  }
}

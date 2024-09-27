package Inheritance.soal;

public class Car extends Vehicle{
  private int numberOfDoors;

  public Car(String color){
    super("Car", color);
  }

  public void setNumberOfDoors(int numberOfDoors){
    this.numberOfDoors = numberOfDoors;
  }

  public void displayCarInfo(){
    super.displayInfo();
    System.out.println("This car has " + numberOfDoors + " Doors");
  }
}

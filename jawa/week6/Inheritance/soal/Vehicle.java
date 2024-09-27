package Inheritance.soal;

public class Vehicle{
  protected String model;
  protected String color;
  protected int year;
  
  public Vehicle(String model, String color){
    this.model = model;
    this.color = color;
  }

  public void setYear(int year){
    if (year > 2025 || year < 1800) {
      System.out.println("Failed to save " + this.model + "'s year. Year must be less than  2025 and more than 1800");
    } else {
      System.out.println(this.model + "'s year saved");
      this.year = year;
    }
  }

  public void displayInfo(){
    System.out.println(">>Vehicle Info");
    System.out.println("Model: " + model);
    System.out.println("Color: " + color);
    System.out.println("Year: " + year);
  }
}


class Shape {
  double length;
  double width;
  double height;
  double volume;
  
  public Shape(double length, double width, double height){
    this.length = length;
    this.width = width;
    this.height = height;

    this.volume = calculateVolume();
  }
  public double compareTo(Shape shape){
    return Math.abs(this.volume - shape.volume);
  }
  private double calculateVolume(){
    return length * width * height;
  }

  public void cetak(){
    System.out.println("Panjang x Lebar x Tinggi = " + length + " x " + width + " x " + height);
    System.out.println("Volume = " + volume);
  } 
}

public class ShapeTester {
  public static void main(String[] args) {
    Shape kubus = new Shape(5, 5, 5);
    Shape balok = new Shape(10, 5, 5);
    kubus.cetak();
    balok.cetak();

    System.out.println("Perbandingan volume kubus dan balok = " + kubus.compareTo(balok));
  }
}

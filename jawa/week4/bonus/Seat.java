public class Seat{
  private String seatNumber;
  private boolean isAvailable;

  public Seat(String seatNumber, boolean isAvailable){
    this.seatNumber = seatNumber;
    this.isAvailable = isAvailable;
  }
  
  public void bookingSeat(){
    this.isAvailable = false;
  }

  public boolean getIsAvailable(){
    return this.isAvailable;
  }

}

public class Reservation{
  private String reservationID;
  private Movie movie;
  private Seat seat;

  public Reservation(String reservationID, Movie movie, Seat seat){
    this.reservationID = reservationID;
    this.movie = movie;
    this.seat = seat;
  }

  public void reserveSeat(){
    seat.bookingSeat();
  }
}

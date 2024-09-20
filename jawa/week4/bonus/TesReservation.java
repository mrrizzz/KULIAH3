public class TesReservation{
  public static void main(String[] args){
    Movie movie = new Movie("The Avengers", 120, "PG-13");
    Seat seat = new Seat("A12", true);
    Reservation reservation = new Reservation("A1", movie, seat);
    reservation.reserveSeat();
    System.out.println("Kursi tersedia?" + seat.getIsAvailable());
  }
}

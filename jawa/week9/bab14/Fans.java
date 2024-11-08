public class Fans {
  String name;
  Fans() {
    name = "noname";
  }

  Fans(String name) {
    this.name = name;
  }

  void showName() {
    System.out.print(name + ": " );
  }

  void watchingPerformance() {
    showName();
    System.out.print("melihat idolanya dari youtube");
  }

  void watchingPerformance(Musician musician) { 
    showName();
    System.out.print("melihat idolanya");
    musician.perform();
  }

}

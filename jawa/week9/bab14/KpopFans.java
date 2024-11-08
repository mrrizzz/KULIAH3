public class KpopFans extends Fans {
  public KpopFans(String name) {
    super(name);
  }
  public void watchingPerformance(Musician musisi, String expression) {
    showName();
    System.out.print(expression + ", melihat idolanya ");
    musisi.perform();
  }
}

import java.util.Scanner;

public class ReplaceString {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("String kalimat utama : ");
    String mainSentence = scanner.nextLine();

    System.out.print("String yang diganti : ");
    String replacedString = scanner.nextLine();

    System.out.print("String pengganti : ");
    String replacingString = scanner.nextLine();

    scanner.close();

    String newSentence = replaceString(mainSentence, replacedString, replacingString);
    System.out.println("Kalimat utama menjadi : " + newSentence);

  }

  private static String replaceString(String mainSentence, String replacedString, String replacingString) {
    return mainSentence.replace(replacedString, replacingString);
  }
}

import java.util.Scanner;

public class SwapName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("string nama pertama :");
        String name1 = scanner.nextLine();

        System.out.print("string nama kedua :");
        String name2 = scanner.nextLine();
        
        scanner.close();

        String[] swappedNames = swapFamilyName(name1, name2);

        System.out.println("String nama pertama : " + swappedNames[0]);
        System.out.println("String nama kedua : " + swappedNames[1]);
    }

    private static String[] swapFamilyName(String name1, String name2) {
        String[] splitName1 = name1.split(" ");
        String[] splitName2 = name2.split(" ");

        String swappedName1 = splitName1[0] + " " + splitName2[1];
        String swappedName2 = splitName2[0] + " " + splitName1[1];

        return new String[]{swappedName1, swappedName2};
    }
}

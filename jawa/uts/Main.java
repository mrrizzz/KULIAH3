import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama player: ");
        String playerName = scanner.nextLine();
        GameManager game = new GameManager(playerName);

        System.out.println("Pilih senjata player:");
        System.out.println("1. Pedang (10 damage)");
        System.out.println("2. Kapak (15 damage)");
        System.out.println("3. Panah (5 damage)");
        System.out.println("Default: Tangan Kosong (0 damage)");
        System.out.print("Pilihan: \n");
          
        int weaponChoice = scanner.nextInt();
        switch (weaponChoice) {
            case 1:
          Weapon sword = new Weapon("Pedang", 10);
          game.equipPlayerWeapon(sword);
          break;
            case 2:
          Weapon axe = new Weapon("Kapak", 15);
          game.equipPlayerWeapon(axe);
          break;
            case 3:
          Weapon bow = new Weapon("Panah", 5);
          game.equipPlayerWeapon(bow);
          break;
            default:
          Weapon bareHanded = new Weapon("Tangan Kosong", 0);
          break;
        }

        // Weapon sword = new Weapon("Pedang", 10);
        // game.equipPlayerWeapon(sword);
        
        Monster goblin = new Monster("Goblin", 50, 5);
        game.startBattle(goblin);
    }
}

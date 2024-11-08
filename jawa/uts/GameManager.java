public class GameManager {
    private Player player;
    private Monster currentMonster;

    public GameManager(String playerName) {
        this.player = new Player(playerName);
    }

    public void startBattle(Monster monster) {
        int playerAttackCOunt = 0;

        this.currentMonster = monster;
        System.out.println("Pertarungan dimulai antara " + player.getName() + " dan " + monster.getName() + "!");
        System.out.println("Monster : " + monster.getName() + ", memiliki " + monster.getHealth() + " health dan " + monster.getDamage() + " damage.");
        System.out.println("Player : " + player.getName() + ", memiliki " + player.getHealth() + " health dan " + player.getDamage() + " base damage." + " + " + player.getWeaponDamage() + " weapon damage \n");
             
        
        while (player.isAlive() && monster.isAlive()) {
            
            player.attack(monster);
            playerAttackCount++;
            
            if (monster.isAlive()) {
                if (playerAttackCount % 3 == 0){

                monster.attack(player);
        }
            }
        }

        if (player.isAlive()) {
            System.out.println(player.getName() + " menang!");
        }
        else {
            System.out.println(monster.getName() + " menang!");
        }
    }

    public void equipPlayerWeapon(Weapon weapon) {
        player.equipWeapon(weapon);
    }
}

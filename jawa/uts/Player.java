public class Player extends Character {
    private Weapon weapon;

    public Player(String name) {
        super(name, 100, 5);  // health 100, base damage 5
        this.weapon = new Weapon("Tangan Kosong", 0);
    }

    public void attack(Character target) {
        int totalDamage = damage + weapon.getDamage();
        System.out.println(name + " menyerang " + target.getName() + " dengan " + weapon.getName() + " sebesar " + totalDamage + " damage!");

        target.takeDamage(totalDamage);
    }

    public void equipWeapon(Weapon newWeapon) {
        this.weapon = newWeapon;
        System.out.println(name + " menggunakan senjata " + newWeapon.getName() + " (" + newWeapon.getDamage() + " damage)\n");
        
    }

    public int getWeaponDamage() {
      return weapon.getDamage();
    }
}


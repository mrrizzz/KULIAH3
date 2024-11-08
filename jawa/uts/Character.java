public class Character {
    protected String name;
    protected int health;
    protected int damage;

    public Character(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    public void attack(Character target) {
        System.out.println(name + " menyerang " + target.getName() + " sebesar " + damage + " damage!");
        target.takeDamage(damage);
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) health = 0;
        System.out.println(name + " menerima " + damage + " damage. Health tersisa: " + health + "\n");
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }
  
    public int getHealth() {
        return health;
    }

    public boolean isAlive() {
        return health > 0;
    }
}



public abstract class Weapon {
    protected int power;
    
    public Weapon() {
        this.power = 0;
    }
    
    public Weapon(int power) {
        this.power = power;
    }
    
    public abstract void attack();
}

public class TestAbstract {
    public static void main(String[] args) {
        Knife knife = new Knife();
        Gun gun = new Gun(10);
        
        knife.attack();
        gun.attack();
        gun.attack();
        
        knife.attack();
        gun.attack();
        gun.attack();
    }
}

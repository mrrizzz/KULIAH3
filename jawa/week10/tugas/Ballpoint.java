public class Ballpoint implements LaserPointer, StorageMedia {
    public void draw() {
        System.out.println("Drawing with ballpoint...");
    }
    
    @Override
    public void point() {
        System.out.println("Ballpoint pointing laser...");
    }
    
    @Override
    public void store() {
        System.out.println("Storing data in ballpoint...");
    }
}

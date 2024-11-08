public class TestMultiFunction {
    public static void main(String[] args) {
        USBFlash usb = new USBFlash();
        Gun gun = new Gun();
        Ballpoint ballpoint = new Ballpoint();
        
        System.out.println("Testing USB Flash:");
        usb.store();
        
        System.out.println("\nTesting Gun:");
        gun.point();
        
        System.out.println("\nTesting Ballpoint:");
        ballpoint.draw();
        ballpoint.point();
        ballpoint.store();
    }
}

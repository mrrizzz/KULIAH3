public class SmartPhone extends Phone implements CardReader, Camera {
    public void call() {
        System.out.println("SmartPhone Call");
    }
    public void receiveCall() {
        System.out.println("SmartPhone Receive Call");
    }
    public void readCard() {
        System.out.println("SmartPhone Read Card");
    }
    public void captureImage() {
        System.out.println("SmartPhone Capture Image");
    }
}

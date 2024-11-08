public class Car{
  private Engine engine;
  private Wheel wheels;
  private Audio audio;

  public Car(){
    this.engine = new Engine();
  }

  public void replaceWheel(){
    this.wheels = new Wheel();
  }

  public void installAudio(Audio audio){
    
  }

  public void playMusic(UsbFlash UsbFlash){
    
  } 
}
class Printer implements Copier, Scanner {
    @Override
    public void scanImage() {
        System.out.println("Scanning image...");
    }
    
    @Override
    public void copyImage() {
        System.out.println("Copy image...");
    }
    
    public void printImage() {
        System.out.println("Print image...");
    }
}

class Gun extends Weapon {
    private int peluru;
    
    public Gun(int peluru) {
        this.peluru = peluru;
    }
    
    @Override
    public void attack() {
        if (peluru > 0) {
            System.out.println("Senjata");
            System.out.println("Menembakkan peluru");
            System.out.println("Sisa peluru:" + --peluru);
        }
    }
}

class Kendaraan {
    void display(String warna) {
        System.out.println("Kendaraan: " + warna);
    }
}

class Motor extends Kendaraan {
    void display(String warna, String merk) {
        System.out.println("Motor: " + warna + ", " + merk);
    }
}

class Kendaraan {
    Kendaraan(String warna) {
        System.out.println("Kendaraan constructor: " + warna);
    }
}

class Mobil extends Kendaraan {
    Mobil(String warna) {
        super(warna);
        System.out.println("Mobil constructor 1: " + warna);
    }
    
    Mobil(String warna, String merk) {
        super(warna);
        System.out.println("Mobil constructor 2: " + x + ", " + merk);
    }
}

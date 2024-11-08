
class Base {
    int i = 99;
    Base() {
        amethod();
    }
    public void amethod() {
        System.out.print("Base.amethod()");
    }
}

public class Derived extends Base {
    int i = -1;
    public static void main(String argv[]) {
        Base b = new Derived();
        System.out.print(b.i);
        b.amethod();
    }
    public void amethod() {
        System.out.print("Derived.amethod()");
    }
}

class Parent {
  int x = 5;

  public void Info() {
    System.out.print("Ini class Parent");
  }
}


class Child extends Parent {
  int x = 10;

  public void Info() {
    System.out.print("Ini class Child");
  }
}

public class Tes {
  public static void main(String args[]) {
    Parent tes=new Child();
    System.out.print("Nilai x = " + tes.x);
    tes.Info();
  }
}

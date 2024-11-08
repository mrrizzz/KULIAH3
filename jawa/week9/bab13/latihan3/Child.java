
class Parent {
    private void method1() {
        System.out.print("Parent's method1()");
    }
    public void method2() {
        System.out.print("Parent's method2()");
        method1();
    }
}

class Child extends Parent {
    public void method1() {
        System.out.print("Child's method1()");
    }
    
    public static void main(String args[]) {
        Parent p = new Child();
        p.method2();
    }
}

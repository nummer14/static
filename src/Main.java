class Person {
    int a= 0;
    static int b = 1;

    public static void greet() {
        System.out.println("Hello from static method!");
        // System.out.println(a); 접근 불가
        System.out.println(b);
    }

    public void sayHello() {
        System.out.println("Hello from instance method!");
    }
}

public class Main {
    public static void main(String[] args) {
        Person.greet();

        Person p = new Person();
        p.sayHello();
        p.greet();
    }
}
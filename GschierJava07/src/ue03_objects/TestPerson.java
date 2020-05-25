package ue03_objects;

public class TestPerson {
    public TestPerson () {
        Person p1 = new Person("Max", "Mustermann");
        Person p2 = p1.clone();
        System.out.println("1: " + p1 + " " + p2);
        // p2.setFirstname("Franz");
        System.out.println("2: " + p1 + " " + p2);
        System.out.println("3: " + (p1 == p2));
        System.out.println("4: " + (p1.equals(p2)));
        System.out.println("----------------------");
        System.out.println("5: " + p1.hashCode());
        System.out.println("6: " + p2.hashCode());
    }
    
    public static void main(String[] args) {
        new TestPerson();
    }
}

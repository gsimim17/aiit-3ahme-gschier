package k8;

// Listing 8.6

public class ClassWithPrivateA {
    private int a;

    public ClassWithPrivateA(int a) {
        this.a = a;
    }

    public void setOtherA(ClassWithPrivateA other, int newvalue) {
        other.a = newvalue;
    }

    public String toString() {
        return "" + a;
    }
}

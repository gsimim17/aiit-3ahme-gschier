package k8;

// Listing 8.13

class SingleValue {
    protected int value1;

    public SingleValue(int value1) {
        this.value1 = value1;
        print();
    }

    public void print() {
        System.out.println("value = " + value1);
    }
}

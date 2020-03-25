package k8;

// Listing 8.7

public class TestAuto {
    static private int objcnt = 0;
    
    public TestAuto() {
        ++objcnt;
    }

    public void finalize() {
        --objcnt;
    }
    
    public void testAuto() {
        TestAuto auto1;
        TestAuto auto2 = new TestAuto();
        System.out.println("Anzahl Testauto-Objekte: " + ((TestAuto.objcnt)-1));
    }
}

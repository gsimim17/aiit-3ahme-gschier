package k4;

// Listing 4.9

public class MehrdimensionalesArrayBsp01 {
    public void mehrdimensionalesArrayBsp01() {
        int a[][] = new int[2][3];
        
        a[0][0] = 1;
        a[0][1] = 2;
        a[0][2] = 3;
        a[1][0] = 4;
        a[1][1] = 5;
        a[1][2] = 6;
        
        System.out.println(""+a[0][0]+a[0][1]+a[0][2]);
        System.out.println(""+a[1][0]+a[1][1]+a[1][2]);
    }
}

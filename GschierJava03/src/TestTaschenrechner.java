package ue01_taschenrechner;

import java.util.Locale;

public class TestTaschenrechner {
    public static void main(String[] args) {
        double a = 0;
        double b = 0;
        
        Taschenrechner bsp1 = new Taschenrechner();
        bsp1.Taschenrechner(a, b);
        System.out.println(String.format(Locale.US, "  Addition: %.3f", bsp1.getAdditionResult()));
        System.out.println(String.format(Locale.US, "  Subtraktion: %.3f", bsp1.getSubtractionResult()));
        System.out.println(String.format(Locale.US, "  Multiplikation: %.3f", bsp1.getMultiplicationResult()));
        System.out.println(String.format(Locale.US, "  Division: %.3f", bsp1.getDivisionResult()));
    }
}

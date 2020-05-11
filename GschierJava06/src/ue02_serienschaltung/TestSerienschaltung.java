package ue02_serienschaltung;

public class TestSerienschaltung {
    public static void main(String[] args) {
        final Serienschaltung serienschaltung = new Serienschaltung();
        try {
            System.out.println("1: " + serienschaltung);
            serienschaltung.addWiderstand(10);
        } catch (Exception ex) {
            System.out.println("Fehler aufgetreten");
            System.out.println(ex.getMessage());
            if (ex instanceof InvalidResistorValueException) {
                double v = ((InvalidResistorValueException)ex).getInvalidValue();
            }
        }
        System.out.println("2: " + serienschaltung);
        serienschaltung.setStrom(0.5);
        try {
            System.out.println("3: " + serienschaltung);
            serienschaltung.addWiderstand(15);
        } catch (Exception ex) {
            System.out.println("Fehler aufgetreten");
            System.out.println(ex.getMessage());
        }
        try {
            System.out.println("4: " + serienschaltung);
            serienschaltung.addWiderstand(20);
        } catch (Exception ex) {
            System.out.println("Fehler aufgetreten");
            System.out.println(ex.getMessage());
        }
        System.out.println("5: " + serienschaltung);
        serienschaltung.setStrom(1);
        System.out.println("6: " + serienschaltung);
    }
}

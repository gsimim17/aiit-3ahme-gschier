package ue02_serienschaltung;

public class TestSerienschaltung {
    public static void main(String[] args) {
        final Serienschaltung serienschaltung = new Serienschaltung();
        System.out.print("1: ");
        serienschaltung.serienschaltung();
        serienschaltung.addWiderstand(10);
        System.out.print("2: ");
        serienschaltung.serienschaltung();
        serienschaltung.setStrom(0.5);
        System.out.print("3: ");
        serienschaltung.serienschaltung();
        serienschaltung.addWiderstand(15);
        System.out.print("4: ");
        serienschaltung.serienschaltung();
        serienschaltung.addWiderstand(20);
        System.out.print("5: ");
        serienschaltung.serienschaltung();
        serienschaltung.setStrom(1);
        System.out.print("6: ");
        serienschaltung.serienschaltung();
    }
}

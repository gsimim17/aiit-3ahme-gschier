package ue02_serienschaltung;

public class TestSerienschaltung {
    public static void main(String[] args) {
        final Serienschaltung serienschaltung = new Serienschaltung();
        serienschaltung.addWiderstand(10);
        serienschaltung.addWiderstand(20);
        serienschaltung.setStrom(0.5);
        System.out.println(serienschaltung);
    }
}

import k8.ZweisitzerCabrio;
import k8.ValuePair;
import k8.TestAuto;
import k7.Son;
import k8.ClassWithPrivateA;
import k8.Cabrio;
import k7.AutoBsp01;

// Listing 7.2 - 7.5 / 7.7 / 7.10 / 7.13 / 7.16 / 8.2 / 8.4 / 8.6 / 8.9 / 8.13

public class Main {
    public static void main(String[] args) {
        // Listing 7.2 - 7.3
        AutoBsp01 meinKombi = new AutoBsp01();
        
        // Listing 7.4
        meinKombi.name = "Mercedes 600";
        meinKombi.erstzulassung = 1972;
        meinKombi.leistung = 250;
        
        // Listing 7.5
        System.out.println("Listing 7.5: ");
        System.out.println("Name............: "+meinKombi.name);
        System.out.println("Erstzulassung...: "+meinKombi.erstzulassung);
        System.out.println("Leistung........: "+meinKombi.leistung);
        
        System.out.println("");
        
        // Listing 7.7
        System.out.println("Listing 7.7: ");
        System.out.println("Alter...........: "+meinKombi.alter());
        
        System.out.println("");
        
        // Listing 7.10
        System.out.println("Listing 7.10: ");
        meinKombi.printAlter(1);
        meinKombi.printAlter(2);
        
        System.out.println("");
        
        System.out.println("Listing 7.11: ");
        meinKombi.alter("Alter: ");
        
        System.out.println("");
        
        // Listing 7.13
        /*
        System.out.println("Listing 7.13: ");
        AutoBsp01 dasAuto = new AutoBsp01("Porsche 911");
        System.out.println(dasAuto.name);
        */
        
        System.out.println("");
        
        // Listing 7.16
        System.out.println("Listing 7.16: ");
        Son son = new Son();
        
        System.out.println("");
        
        // Listing 8.2
        Cabrio kfz1 = new Cabrio();
        kfz1.name = "MX5";
        kfz1.erstzulassung = 1994;
        kfz1.leistung = 115;
        kfz1.vdauer = 120;
        System.out.println("Listing 8.2: ");
        System.out.println("Alter = "+kfz1.alter());
        
        System.out.println("");
        
        // Listing 8.4
        ZweisitzerCabrio kfz2 = new ZweisitzerCabrio();
        kfz2.name = "911-T";
        kfz2.erstzulassung = 1982;
        kfz2.leistung = 94;
        kfz2.vdauer = 50;
        kfz2.notsitze = true;
        System.out.println("Listing 8.4: ");
        System.out.println("Alter = "+kfz2.alter());
        
        System.out.println("");
        
        // Listing 8.6
        ClassWithPrivateA a1 = new ClassWithPrivateA(7);
        ClassWithPrivateA a2 = new ClassWithPrivateA(11);
        a2.setOtherA(a1, 999);
        System.out.println("Listing 8.6: ");
        System.out.println("a1 = " + a1.toString());
        System.out.println("a2 = " + a2.toString());
        
        System.out.println("");
        
        System.out.println("Listing 8.7: ");
        TestAuto ta = new TestAuto();
        ta.testAuto();
        
        System.out.println("");
        
        // Listing 8.9
        System.out.println("Listing 8.9: ");
        double x, y;
        for (x = 0.0; x <= 10.0; x = x + 1.0) {
            y = Math.sqrt(x);
            System.out.println("sqrt("+x+") = "+y);
        }
        
        System.out.println("");
        
        /*
        System.out.println("Listing 8.11 / 8.12: ");
        GehaltBsp01 gb = new GehaltBsp01();
        gb.gehaltsberechnung();
        */
        
        // Listing 8.13
        System.out.println("Listing 8.13: ");
        new ValuePair(10,20);
    }
}

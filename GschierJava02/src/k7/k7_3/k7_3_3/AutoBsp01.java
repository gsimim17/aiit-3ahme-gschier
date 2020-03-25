package k7;

// Listing 7.1 / 7.6 / 7.8 / 7.9 / 7.11 / 7.12 / 7.14 / 7.15

public class AutoBsp01 {
    // Listing 7.1
    public String name;
    public int    erstzulassung;
    public int    leistung;
    
    // Listing 7.6 / 7.8
    public int alter() {
        return 2000 - this.erstzulassung;
    }
    
    // Listing 7.9
    public void printAlter(int wieoft) {
        while (wieoft-- > 0) {
            System.out.println("Alter = "+alter());
        }
    }
    
    // Listing 7.11
    public int alter(String titel) {
        int alter = alter();
        System.out.println(titel+alter());
        return alter;
    }
    
    // Listing 7.12
    /*
    public AutoBsp01(String name) {
        this.name = name;
    }
    
    // Listing 7.14 / 7.15
    public AutoBsp01(String name, int erstzulassung, int leistung) {
            this(name);
            this.erstzulassung = erstzulassung;
            this.leistung = leistung;
        }
    */
}

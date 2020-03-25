package k7;

// Listing 7.16

class Father {
    private String s1 = FatherSonBsp01.getAndPrint("Father.s1");

    public Father() {
        FatherSonBsp01.getAndPrint("Father.<init>");
    }
}

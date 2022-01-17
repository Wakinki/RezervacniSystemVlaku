package rezervaceJizdenekVlaku;

public enum NazvyVlaku {
    MORAVIA("Moravia"),
    POLONIA("Polonia"),
    SLESIA("Slesia"),
    VALASSKYEXPRES("Valašský expres"),
    OSTRAVAN("Ostravan"),
    BERLINER("Berliner"),
    METROPOLITAN("Metropolitan"),
    VINDOBONA("Vindobona"),
    JIZNYEXPRES("Jižní expres"),
    OPAVAN("Opavan"),
    LABE("Labe"),
    KRUSNOHOR("Krušnohor"),
    JIHLAVA("Jihlava"),
    ROZMBERG("Rožmberg"),
    VLTAVA("Vltava"),
    LUZNICE("Lužnice"),
    BEROUNKA("Berounka"),
    MORAVAN("Moravan"),
    SVITAVA("Svitava"),
    SLOVACKYEXPRES("Slovácký expres"),
    ZLINSKYECPRES("Zlínský expres"),
    JANPERNER("Jan Perner"),
    KRAKONOS("Krakonoš"),
    HRADECAN("Hradečan"),
    VYSOCINA("Vysočina"),
    PRADED("Praděd"),
    SAZAVA("Sázava"),
    JIZERA("Jizera"),
    PERNSTEJN("Pernštejn"),
    RENESANCE("Renesance"),
    HORACKYEXPRES("Horácký expres");

    private static final NazvyVlaku[] typy = NazvyVlaku.values();

    public static NazvyVlaku getNazevVlaku(int i) {
        return typy[i];
    }

    public static NazvyVlaku getRandomNazevVlaku() {
        int r = (int)(Math.random() * typy.length);
        return typy[r];
    }

    public String getNazev() {
        return nazev;
    }

    private final String nazev;

    NazvyVlaku(String nazev){
        this.nazev = nazev;
    }

}

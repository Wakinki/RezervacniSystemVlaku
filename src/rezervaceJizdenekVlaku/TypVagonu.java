/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rezervaceJizdenekVlaku;

/**
 *
 * @author Michal Wackermann
 */
public enum TypVagonu {
        B(10,80), //(pocet kupe, pocet sedacek v kupe)
        BMZ(9,54),
        BPEE(1,100);

    private static final TypVagonu[] typy = TypVagonu.values();
    private final int pocetKupe;
    private final int pocetSedadel;

    public static TypVagonu getTypVagonu(int i) {
        return typy[i];
    }

    public static TypVagonu getRandomTypVagonu() {
        int r = (int)(Math.random() * typy.length);
        return typy[r];
    }

    public int getPocetKupe() {
        return pocetKupe;
    }

    public int getPocetSedadel() {
        return pocetSedadel;
    }



    TypVagonu(int pocetKupe, int pocetSedadel){
            this.pocetKupe = pocetKupe;
            this.pocetSedadel = pocetSedadel;
    }


}

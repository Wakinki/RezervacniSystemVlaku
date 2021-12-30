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

        private final int pocetKupe;
        private final int pocetSedadel;

    TypVagonu(int pocetKupe, int pocetSedadel){
            this.pocetKupe = pocetKupe;
            this.pocetSedadel = pocetSedadel;
    }
}

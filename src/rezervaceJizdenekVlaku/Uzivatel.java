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
public class Uzivatel {
   private String jmeno;
   private String prijmeni;
    private String fullName;

    public Uzivatel(String jmeno, String prijmeni) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        fullName = this.jmeno +" "+ this.prijmeni;
    }

    public String getFullName() {
        return fullName;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }


}

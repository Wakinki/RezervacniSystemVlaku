
package rezervaceJizdenekVlaku;

public class Main {

    public static void main(String[] args) throws WrongTrainException {


      Uzivatel u1 = new Uzivatel("Karel", "Máslo");
      Vlak v1 = new Vlak("Krušnohor");
      Rezervace r1 = new Rezervace(u1,"Krušnohor",369,13);
      Rezervace r2 = new Rezervace(u1,"Krušnohor",367,2);

        r2.printReservationFile();
      v1.pridejRezervaci(r1);
        
    }
    
}

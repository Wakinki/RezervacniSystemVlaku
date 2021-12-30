package rezervaceJizdenekVlaku;

import java.io.Serializable;

public class SeznamVlaku extends SeznamObjektu implements Serializable {

    private Vlak[] seznam;


    public SeznamVlaku() {
        this.seznam = new Vlak[8];
    }

    @Override
    public Vlak getOnIndex(int index){
        return seznam[index];
    }

    public String getTrainNameOnIndex(int index){
        return seznam[index].getNazev();
    }

    public void loadFromFile(String filePath){
        //TODO napsat metodu na načtení vlaků ze souboru
    }

    public void loadToFile(String filePath){
        //TODO napsat metodu na načtení vlaků do souboru
    }


}

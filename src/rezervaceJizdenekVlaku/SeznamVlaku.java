package rezervaceJizdenekVlaku;

import java.io.Serializable;

public class SeznamVlaku extends SeznamObjektu implements Serializable {

    private Vlak[] seznam;
    private final int startingSize = 8;
    private int indexAfterLastObject = 0;

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

    public void add(Vlak o){
        if(indexAfterLastObject == this.seznam.length){
            Vlak[] copiedArray = new Vlak[this.seznam.length + 8];
            System.arraycopy(seznam, 0, copiedArray, 0, this.seznam.length);
            this.seznam = copiedArray;
            copiedArray = null;
        }
        seznam[indexAfterLastObject] = o;
        indexAfterLastObject++;
    }

    public SeznamVlaku loadRandomTrains(int howMany){ //TODO dopsat třídu na naplnění seznamu náhodnými vlaky
        SeznamVlaku s = new SeznamVlaku();
        for(int i = 0;i<howMany;i++){
            s.add(new Vlak());
        }
        return s;
    }

}

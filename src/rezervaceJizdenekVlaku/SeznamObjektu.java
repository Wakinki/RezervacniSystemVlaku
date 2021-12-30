package rezervaceJizdenekVlaku;


public class SeznamObjektu {

    private Object[] seznam;
    private int indexAfterLastObject = 0;

    public SeznamObjektu() {
        this.seznam = new Object[8];
    }

    public void add(Object o){
        if(indexAfterLastObject == this.seznam.length){
            Object[] copiedArray = new Object[this.seznam.length + 8];
            System.arraycopy(seznam, 0, copiedArray, 0, this.seznam.length);
            this.seznam = copiedArray;
            copiedArray = null;
        }
        o = seznam[indexAfterLastObject];
        indexAfterLastObject++;
    }


    public void clear(){
        for (int i=0;i<this.seznam.length;i++) {
            seznam[i] = null;
        }
        indexAfterLastObject = 0;
    }


    public void removeOnIndex(int index){
        if(seznam[index] != null){
            for(int i=index;i<this.seznam.length-1;i++){
                seznam[i] = seznam[i+1];
            }
            seznam[this.seznam.length] = null;
            indexAfterLastObject--;
        }
    }


    public Object getOnIndex(int index){
        return seznam[index];
    }

}

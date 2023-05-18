import java.util.List;

public class Botte {
    private List<Rubinetto> rubinetti;
    private int litri;

    public Botte(int litri, List<Rubinetto> rubinetti) {
        this.rubinetti = rubinetti;
        this.litri = litri;
    }
    
    public synchronized Rubinetto rubinettoLibero(){
        while(true)
            for(Rubinetto r : rubinetti)
                if(r.isLibero())
                    return r;
    }

    public boolean isEmpty(){
        if(litri > 0)
            return false;
        return true;
    }

    public int decLitri(int val){
        return litri-= val;
    }

    public int getLitri() {
        return litri;
    }
}
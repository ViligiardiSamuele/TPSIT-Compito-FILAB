import java.util.Random;

public class Bevitore extends Thread{
    private Botte botte;

    public Bevitore(String name, Botte botte) {
        super(name);
        this.botte = botte;
    }

    @Override
    public void run() {
        while(!botte.isEmpty()){
            try {
                Thread.sleep(new Random().nextInt(1000) + 1);
            } catch (InterruptedException igException) {}
            botte.rubinettoLibero().bevi();
        }
        if(botte.isEmpty())
        Thread.currentThread().interrupt();
    }

    public Botte getBotte() {
        return botte;
    }
    
}
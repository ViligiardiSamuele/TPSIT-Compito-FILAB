import java.util.Random;

public class Rubinetto extends Thread{
    private String nome;
    private boolean libero;

    public Rubinetto(String nome) {
        this.nome = nome;
        this.libero = true;
    }

    public synchronized void bevi(){
        libero =! libero;
        Botte botte = ((Bevitore) Thread.currentThread()).getBotte();
        if(botte.getLitri() > 0){
            String nome = Thread.currentThread().getName();
            int tempoBevuta = new Random().nextInt(3000) + 1;
            int rand;
            do{
                rand = new Random().nextInt(3) + 1;
            } while(botte.getLitri() - rand < 0);
            botte.decLitri(rand);
            System.out.println(
                nome + " beve "+ rand + " litri da " + this.nome +
                " per " +tempoBevuta + "ms - Litri rimasti: " + botte.getLitri()
            );
            try {
                Thread.sleep(tempoBevuta);
            } catch (InterruptedException igException) {}
        } else {
            libero =! libero;
            Thread.currentThread().interrupt();
        }
        libero =! libero;
    }
    
    public boolean isLibero(){
        return libero;
    }

    public String getNome() {
        return nome;
    }
}

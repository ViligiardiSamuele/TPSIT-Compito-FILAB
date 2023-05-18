import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Rubinetto> rubinetti = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            rubinetti.add(new Rubinetto("Rubinetto " + (i+1)));
        }
        Botte botte = new Botte(100, rubinetti);
        List<Bevitore> bevitori = new ArrayList<Bevitore>();
        for (int i = 0; i < 10; i++) {
            bevitori.add(new Bevitore("Bevitore " + (i+1), botte));
        }

        for(Rubinetto r : rubinetti)
            r.start();
        for(Bevitore b : bevitori)
            b.start();
    }
}

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Raffle {
    private List<Games> games;

    public Raffle() {
        games = new ArrayList<>();
    }

    public void addToy(Games toy) {
        this.games.add(toy);
    }

    public void giveToy() throws IOException {
        Random rnd = new Random();

        boolean isToySelect = false;

        while(!isToySelect) {
            for (Games toy : this.games) {
                int chance = toy.GetToyDropRate() / 10;

                if(toy.GetToyQuantity() > 0) {
                    if(rnd.nextInt(1, 10) <= chance) {
                        new File(toy.GetToyTitle());
                        toy.ChangeQuantity("remove");

                        isToySelect = true;
                        break;
                    }
                } else {
                    games.remove(toy);
                    break;
                }
            }
        }
    }
}
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Raffle raffle = new Raffle();
        raffle.addToy(new Games(1, "Щелкунчик", 3, 60));
        raffle.addToy(new Games(2, "Барби", 2, 20));
        raffle.addToy(new Games(3, "Трансформер", 5, 20));

        int raffleCount = 10;

        for(int i = 0; i < raffleCount; i++) {
            raffle.giveToy();
        }
    }
}
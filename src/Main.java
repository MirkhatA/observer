import update.updateList.Overwatch;
import update.updateList.OverwatchPlayers;

public class Main {
    public static void main(String[] args) {
        Overwatch update = new Overwatch();
        OverwatchPlayers player = new OverwatchPlayers(update, "Player");
        OverwatchPlayers madikhan = new OverwatchPlayers(update, "Madikhan");
        update.addUser(player);
        update.addUser(madikhan);

        update.setVersion("version: 2.3.5: Tracer was boosted");
    }
}

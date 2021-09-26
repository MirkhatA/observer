package update.updateList;

import update.observer.Observer;

import java.util.List;

public class OverwatchPlayers implements Observer {
    private Overwatch overwatch;
    private String name;

    public OverwatchPlayers(Overwatch overwatch, String name) {
        this.overwatch = overwatch;
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println("Hey " + name + "! New update!: " + this.overwatch.getVersion());
    }
}



package pokemons;

import Attacks.BodySlam;

public class Poliwhirl extends Poliwag {
    public Poliwhirl(String name, int lvl) {
        super(name, lvl);

        this.setStats(65, 65, 65, 50, 50, 90);

        this.addMove(new BodySlam());
    }


}

package pokemons;

import Attacks.DoubleSlap;

public class Politoed extends Poliwhirl {
    public Politoed(String name, int lvl) {
        super(name, lvl);

        this.setStats(90, 75,75, 90, 100, 70);

        this.addMove(new DoubleSlap());
    }
}

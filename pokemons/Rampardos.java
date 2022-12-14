package pokemons;

import Attacks.FocusBlast;

public class Rampardos extends Cranidos {
    public Rampardos(String name, int lvl) {
        super(name, lvl);

         this.setStats(97, 165, 60, 65, 50,58);

         this.addMove(new FocusBlast());
    }
}

package pokemons;

import ru.ifmo.se.pokemon.*;
import Attacks.Rest;
import Attacks.WildCharge;
import Attacks.Crunch;
import Attacks.Swagger;
public class Thundurus extends Pokemon {
    public Thundurus(String name, int lvl) {
        super(name, lvl);

        this.setType(Type.ELECTRIC, Type.FLYING);

        this.setStats(79,115,70,125,80,111);

        this.addMove(new Rest(79));
        this.addMove(new WildCharge());
        this.addMove(new Crunch());
        this.addMove(new Swagger());
    }
}

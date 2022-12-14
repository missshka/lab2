package pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import Attacks.Bulldoze;
import Attacks.Swagger;
import Attacks.RockTomb;

public class Cranidos extends Pokemon{
    public Cranidos(String name, int lvl)  {
        super(name, lvl);

        this.setType(Type.ROCK);

        this.setStats(67, 125, 40, 30, 30, 58);

        this.addMove(new Bulldoze());
        this.addMove(new Swagger());
        this.addMove(new RockTomb());
    }
}

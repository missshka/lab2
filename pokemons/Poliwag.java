package pokemons;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import Attacks.Psychic;
import Attacks.Confide;

public class Poliwag extends Pokemon {
    public Poliwag(String name, int lvl) {
        super(name, lvl);
        this.setType(Type.WATER);

        this.setStats(40, 50, 40, 40, 40, 90);

        this.setMove(new Psychic(), new Confide());
    }

}
import pokemons.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();

        b.addAlly(new Cranidos("Кренидос", 10));
        b.addAlly(new Rampardos("Рампардорс", 10));
        b.addAlly(new Thundurus("Тандурус", 10));

        b.addFoe(new Politoed("Политойд", 10));
        b.addFoe(new Poliwag("Поливаг", 10));
        b.addFoe(new Poliwhirl("Поливёрл", 10));

        b.go();


    }
}
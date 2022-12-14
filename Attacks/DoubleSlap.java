package Attacks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;
import java.util.Random;
public class DoubleSlap extends PhysicalMove{
    public DoubleSlap() {
        super(Type.NORMAL, 15, 85);
        int[] matrix = {2, 2, 2, 3, 3, 3, 4, 5};
        this.hits = matrix[Math.round(new Random().nextInt(8))];

    }

    @Override
    protected String describe(){
        return "использует Double Slap";
    }

}

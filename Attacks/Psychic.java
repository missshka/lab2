package Attacks;

import ru.ifmo.se.pokemon.*;

public class Psychic extends SpecialMove {
    public Psychic(){
        super(Type.PSYCHIC, 90, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        Effect e = new Effect().chance(0.1).stat(Stat.SPECIAL_ATTACK, -1);
        p.addEffect(e);
    }

    @Override
    protected String describe() {
        return "атакует Psychic";
    }

}

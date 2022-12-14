package Attacks;

import ru.ifmo.se.pokemon.*;

public class Crunch extends PhysicalMove{
    public Crunch() {
        super(Type.DARK, 80, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        Effect e = new Effect().chance(0.2).stat(Stat.DEFENSE, -1);
        p.addEffect(e);
    }

    @Override
    protected String describe() {
        return "использует Crunch";
    }

}



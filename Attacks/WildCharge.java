package Attacks;

import ru.ifmo.se.pokemon.*;

public class WildCharge extends PhysicalMove {
    public WildCharge() {
        super(Type.ELECTRIC, 90, 100);

    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        double d = this.power * 0.25;
        int di = (int) d;
        Effect e = new Effect().chance(1).turns(0).stat(Stat.HP, -di);
        p.addEffect(e);
    }
    @Override
    protected String describe() {
        return "использует WildCharge";
    }
}
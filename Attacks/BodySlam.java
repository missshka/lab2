package Attacks;

import ru.ifmo.se.pokemon.*;
public class BodySlam extends PhysicalMove {
    public BodySlam() {
        super(Type.NORMAL, 85, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (new Effect().chance(0.3).success() && p.getCondition() == Status.NORMAL) {
            Effect.paralyze(p);
        }
    }

    @Override
    protected String describe() {
        return "использует BodySlam";
    }
}

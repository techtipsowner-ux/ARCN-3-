
public class Archer extends Combatant implements Special {
    private int arrows;

    public Archer(String name, int hp, int arrows) {
        super(name, hp);
        this.arrows = arrows;
    }

    @Override
    public String attack() {
        if (arrows == 0) {
            return getname() + " has no arrows left!";
        }

        arrows--;
        return getname() + " shoots his bow!";
    }

    @Override
    public String useSpecialMove() {
        if (arrows < 3) {
            return getname() + " does not have enough arrows!";
        }

        arrows = arrows - 3;
        return getname() + " shoots three deadly arrows!";
    }
}

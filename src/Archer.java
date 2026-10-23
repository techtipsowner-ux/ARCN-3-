public class Archer extends Combatant implements Special {
    private int arrows;

    public Archer(String name, int hp, int arrows) {
        super(name, hp); // hand shared fields UP to the parent

    }

    @Override
    public String attack() {
        return getname() + " shoots his bow";
    }

    @Override
    public String useSpecialMove() {
        return getname() +
                " Shoots a deadly arrow!";
    }

}


public class Archer extends Combatant {
    private int arrows;
    public Archer(String name, int hp, int arrows) {
        super(name, hp); // hand shared fields UP to the parent
        this.archer = archer;
    }
    @Override
    public String attack() {
        return getname() + " shoots his bow";
    }
    implements Special {
        @Override
        public String useSpecialMove() {
            return getname() +
                    " Shoots a deadly arrow!";
        }

    }
}

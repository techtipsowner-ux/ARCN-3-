public class Warrior extends Combatant {

    public Warrior(String name, int hp) {
        super(name, hp); // hand shared fields UP to the parent

    }
    @Override
    public String attack() {
        return getName() + "Swings his sword";
    }
    implements Special {
        @Override
        public String useSpecialMove() {
            return getName() +
                    " swings a bit better!";
        }

    }
}

public class Mage extends Combatant {
    private int mana;

    public Mage(String name, int hp, int mana) {
        super(name, hp); // hand shared fields UP to the parent
        this.mana = mana;
    }

    @Override
    public String attack() {
        return getName() + " hurls a fireball!";
    }
    implements

    Special {
        @Override
        public String useSpecialMove () {
            return getName() +
                    " channels an arcane nova!";
        }

    }
}
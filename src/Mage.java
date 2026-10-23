public class Mage extends Combatant implements Special {
    private int mana;

    public Mage(String name, int hp, int mana) {
        super(name, hp); // hand shared fields UP to the parent
        this.mana = mana;
    }

    @Override
    public String attack() {
        return getname() + " hurls a fireball!";
    }

    @Override
    public String useSpecialMove() {
        return getname() +
                " FIREBALL!";
    }


}
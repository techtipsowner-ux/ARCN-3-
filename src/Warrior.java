public class Warrior extends Combatant implements Special {

    public Warrior(String name, int hp) {
        super(name, hp); // hand shared fields UP to the parent

    }

    @Override
    public String attack() {
        return getname() + "Swings his sword";
    }

    @Override
    public String useSpecialMove() {
        return getname() + " swings a bit better!";
    }


}

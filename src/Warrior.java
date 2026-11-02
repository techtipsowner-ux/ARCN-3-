
public class Warrior extends Combatant implements Special {
    private int armor;

    public Warrior(String name, int hp, int armor) {
        super(name, hp);
        this.armor = armor;
    }

    @Override
    public String attack() {
        return getname() + " swings his sword!";
    }

    @Override
    public int takeDamage(int damage) {
        return super.takeDamage(Math.max(0, damage - armor));
    }

    @Override
    public String useSpecialMove() {
        return getname() + " swings his sword with extra strength!";
    }
}


public abstract class Combatant {
    protected int hp;
    private String name;

    public Combatant(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public abstract String attack();

    public int takeDamage(int damage) {
        hp = hp - Math.max(0, damage);

        if (hp < 0) {
            hp = 0;
        }
        return hp;
    }

    public String getname() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    @Override
    public String toString() {
        return name + " has " + hp + " HP";
    }
}

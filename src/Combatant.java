public abstract class Combatant {
    protected int hp; // children can touch this
    private String name;
    public abstract String attack();

    public Combatant(String name, int hp) {
        this.hp = hp;
        this.name = name;
    }

    public int takeDamage(int damage) {
        int result;
        result = hp - damage;
        return result;
    }
    public String getname() {
        return name;
    }
    // the promise — no body
    // shared concrete methods: takeDamage(int), getName(), toString()


}

public abstract class Combatant {
    protected int hp; // children can touch this
    private String name;
    public abstract String attack();

    public int takeDamage(int damage) {
        int result;
        result = hp - damage;
        return result;
    }
    public String getname(String Name) {
        if(Name == name) {
            return name;
        } else {
            return null;
        }
    }
    // the promise — no body
    // shared concrete methods: takeDamage(int), getName(), toString()


}

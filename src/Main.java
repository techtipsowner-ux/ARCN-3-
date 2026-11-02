
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Combatant> roster = new ArrayList<>();

        Warrior warrior = new Warrior("Aragorn", 100, 10);
        Mage mage = new Mage("Gandalf", 70, 30);
        Archer archer = new Archer("Legolas", 80, 40);

        roster.add(warrior);
        roster.add(mage);
        roster.add(archer);

        System.out.println("RPG Battle Roster");

        for (Combatant c : roster) {
            System.out.println(c);
        }

        System.out.println("\nRound 1:");

        for (Combatant c : roster) {
            System.out.println(c.attack());
        }

        ArrayList<Special> specials = new ArrayList<>();

        specials.add(warrior);
        specials.add(mage);
        specials.add(archer);

        System.out.println("\nSpecial moves:");

        for (Special s : specials) {
            System.out.println(s.useSpecialMove());
        }

        warrior.takeDamage(25);
        mage.takeDamage(20);
        archer.takeDamage(15);

        System.out.println("\nAfter taking damage:");

        for (Combatant c : roster) {
            System.out.println(c);
        }
    }
}

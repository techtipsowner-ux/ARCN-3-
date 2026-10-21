//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    ArrayList<Combatant> roster = new ArrayList<>();
    roster.add(new Warrior("Aragorn", 100));
    roster.add(new Mage("Gandalf", 70, 30));
    roster.add(new Archer("Legolas", 80, 40));


    for (Combatant c : roster) {
        System.out.println(c.attack());
        // each runs ITS OWN attack
    }


}

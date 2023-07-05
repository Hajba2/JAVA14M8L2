package game;

public class Fight {

    private Person person1;
    private Person person2;

    public Fight(Person person1, Person person2) {
        this.person1 = person1;
        this.person2 = person2;
    }

    public void startFight() {
        boolean isSomebodyLoose = false;
        while (!isSomebodyLoose) {
            person1.getDamageFrom(person2);
            if (!person1.isAlive() ) {
                break;
            }
            person2.getDamageFrom(person1);
            if (!person2.isAlive() ) {
                break;
            }

        }
        if (person1.isAlive()) {
            System.out.println(person1.getName() + " person win");
        } else {
            System.out.println(person2.getName() + " person win");
        }
    }
}

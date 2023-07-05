package game;

public class Test {

    public static void main(String[] args) {
        Weapon bl = new Blaster(10, 80);
        Weapon sw = new Sword(10, 100);

        Person p1 = new Person("Dragon", 100, bl);
        Person p2 = new Person("Elf", 100, sw);

        Fight fight = new Fight(p1, p2);
        fight.startFight();

    }
}

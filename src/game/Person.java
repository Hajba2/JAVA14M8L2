package game;

import java.util.Random;

public class Person {

    private int health;
    private Weapon weapon;
    private String name;

    public Person(String name, int health, Weapon weapon) {
        this.health = health;
        this.weapon = weapon;
        this.name = name;
    }

    public void getDamageFrom(Person person) {

        Random randI = new Random();
        int myRandInt = randI.nextInt(100);
        myRandInt = myRandInt+1;

        if (myRandInt < weapon.getAim()) {
            health -= person.getDamage();
            System.out.println(name
                    + " is attacked by "
                    + person.getName()
                    + " by "
                    + person.getDamage()
                    + " damage "
                    + " current health = " + health);
        } else {
            System.out.println(name
                    + " is attacked by "
                    + person.getName()
                    + " and "
                    + person.getName()
                    + " missed");
        }


    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return weapon.getDamage();
    }

    public String getName() {
        return name;
    }

    public boolean isAlive() {
        return health >= 1;
    }
}

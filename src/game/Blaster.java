package game;

public class Blaster implements Weapon {

    private int damage;

    //from 1 till 100
    private int aim;

    public Blaster(int damage, int aim) {
        this.damage = damage;
        this.aim = aim;
    }

    @Override
    public int getDamage() {
        return damage;
    }

    @Override
    public int getAim() {
        return aim;
    }

}

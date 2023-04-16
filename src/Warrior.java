import java.util.Random;

public abstract class Warrior<W extends IWeapon, S extends IDefence> extends Personage {
    protected static Random rnd = new Random();
    protected W weapon;

    protected S shield;

    public W getWeapon() {
        return weapon;
    }

    public S getShield() {
        return shield;
    }

    public Warrior(String name, int hp, W weapon, S shield) {
        super(name, hp);
        this.weapon = weapon;
        this.shield = shield;
    }

    public int harm() {
        boolean isHit = rnd.nextBoolean();
        int damage = 0;
        if (isHit) {
            damage = rnd.nextInt(weapon.damage() + 1);
        }
        return damage;
    }

    public int shielded() {
        boolean isShielded = rnd.nextBoolean();
        int defence = 0;
        if (isShielded) defence = rnd.nextInt(shield.defend());
        return defence;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(this.getPersonageName())
                .append(String.format("\n\tЗдоровье: %d", getHealPoint()))
                .append(String.format("\n\tВооружение: %s", this.weapon))
                .append("\n\t" + this.shield).append("\n");
        return res.toString();
    }
}

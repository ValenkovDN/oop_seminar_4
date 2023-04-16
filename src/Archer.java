public class  Archer extends Warrior<Throwing, LightShield> {
    public Archer(String name, int hp, Throwing weapon, LightShield shield) {
        super(name, hp, weapon, shield);
    }

    public int range() {
        return rnd.nextInt(this.weapon.range) + 1;
    }

    @Override
    public String toString() {
        return "Лучник " + super.toString();
    }
}

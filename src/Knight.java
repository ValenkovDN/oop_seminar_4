public class Knight extends Warrior<Sword, HeavyShield> {
    public Knight(String name, int hp, Sword weapon, HeavyShield shield) {
        super(name, hp, weapon, shield);
    }

    @Override
    public String toString() {
        return "Рыцарь " + super.toString();
    }
}

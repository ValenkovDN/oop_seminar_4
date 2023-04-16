public class Thief extends Warrior<Knife, LightShield>{
    public Thief(String name, int hp, Knife weapon, LightShield shield) {
        super(name, hp, weapon, shield);
    }

    @Override
    public String toString() {
        return "Вор " + super.toString();
    }
}

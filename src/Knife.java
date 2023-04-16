public class Knife implements IWeapon {
    @Override
    public int damage() {
        return 30;
    }

    @Override
    public String toString() {
        return String.format("нож перочинный\n\tУрон: %d", this.damage());
    }
}
